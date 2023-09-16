package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://trello.com/home");
	 driver.findElement(By.linkText("Log in")).click();
	 driver.findElement(By.id("user")).sendKeys("Deepa");
	 int size = driver.findElement(By.id("user")).getSize().getHeight();
	 System.out.println(size);
	 driver.findElement(By.id("login")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("password")).sendKeys("Deepa0103");
     driver.findElement(By.id("login")).click();
     Thread.sleep(2000);
    String errortext = driver.findElement(By.xpath("(//p[@class='error-message'])[1]")).getText();
    Thread.sleep(2000);
	System.out.println(errortext);
	driver.quit();
	
	
	
	
	}

}
