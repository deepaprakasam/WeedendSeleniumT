package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class realtimehdfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//we pass the send keys we get no such element Exception
		driver.findElement(By.linkText("CONTINUE")).clear();
		driver.switchTo().frame(0);
		
	}

}
