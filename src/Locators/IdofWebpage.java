package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdofWebpage {

	public static void main(String[] args) throws InterruptedException
	{
	 WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("trainee");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
  driver.quit();
  */
		
		
	/*driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("Deepa");
		driver.findElement(By.name("lastname")).sendKeys("Prakasam");
		driver.findElement(By.name("reg_email__")).sendKeys("deepaprakasam");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("88875");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		
	*/
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Deepa");
		driver.findElement(By.id("LastName")).sendKeys("Prakasam");
		driver.findElement(By.id("Email")).sendKeys("deepaprakasamr@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Deepa@0103");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Deepa@0103");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("deepaprakasamr@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Deepa@0103");
		driver.findElement(By.id("dialog-notifications-success")).click();
		driver.findElement(By.partialLinkText("BOOKS")).click();
	}
	

}
