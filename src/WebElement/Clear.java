package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("Weekend");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("Selenium");
	}
	

}
