package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.name("username")).sendKeys("Deeppa");
		Thread.sleep(2000);
	 driver.findElement(By.name("password")).sendKeys("Deepa@011");
	 Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
/*CashKaro application
		driver.get("https://cashkaro.com/blog/best-online-shopping-apps-in-india/185530");
		//Xpath by attribute
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("Toys");
		//grouped index
		
		/// we are not use this This is last Option group index
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	*/
		/*
		 * 
		 * Youtube
		 */
	/*driver.get("https://www.youtube.com/");
   driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Lesa Lesa");
	Thread.sleep(2000);
	driver.findElement(By.id("search-icon-legacy")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[text()='Lesa Lesa | Yedho Ondru Video Song | Shaam, Trisha | Harris Jayaraj | Priyadarshan'])[1]")).click();
	*/	
	}
	

}
