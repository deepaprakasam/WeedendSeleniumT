package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containstextfunction {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		String text = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getText();
  System.out.println(text);
  driver.quit();

	}
	

}
