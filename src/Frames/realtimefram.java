package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class realtimefram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		//we pass the send keys we get no such element Exception
		//driver.findElement(By.id("regEmail")).sendKeys("7010726573");
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("8870637996");
		driver.switchTo().parentFrame();
		

	}

}
