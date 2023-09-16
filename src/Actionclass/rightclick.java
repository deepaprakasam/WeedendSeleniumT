package Actionclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		Actions action = new Actions(driver);
	//RightClick action (context click)
		//action.contextClick().perform();
		//Mouse over action
		//moveByOffset----X and Y coordinates to click mouse over action
		// or another method is location 
		action.moveByOffset(730, 269).click().perform();
		
		
	}

}
