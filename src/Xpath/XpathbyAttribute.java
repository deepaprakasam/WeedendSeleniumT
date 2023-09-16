package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Dress ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

}

