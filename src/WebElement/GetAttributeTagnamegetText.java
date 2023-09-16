package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeTagnamegetText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.id("username"));
		//getAttribute(Attribute Value)
		//System.out.println(text.getAttribute("name"));
		
		//getTagname()
		System.out.println(text.getTagName());
		//getText()
		//Suppose if you have text in that tag we get it
		System.out.println(text.getText());
		
		//getCSSvalue()------inside webpage inspect we have styles so much is there we can fetch the clour,boder
		System.out.println(text.getCssValue("display"));
		
		
		//getlocation()
		//to printt the location 
		System.out.println(text.getLocation());
		//getsize()
		System.out.println(text.getSize());
		
		
		
		

	}

}
