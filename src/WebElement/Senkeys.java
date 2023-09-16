package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Deepa");
		Thread.sleep(2000);
		firstname.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		firstname.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		WebElement surename = driver.findElement(By.name("lastname"));
		Thread.sleep(2000);
		surename.sendKeys(Keys.CONTROL+"v");
		
		
	}

}
