package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenableddiplayedselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.name("login"));
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		System.out.println(login.isSelected());

	}

}
