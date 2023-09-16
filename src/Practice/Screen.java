package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://trello.com/home");
		 //TakesScreenshot shot= (TakesScreenshot) driver;
		 //File shost = shot.getScreenshotAs(OutputType.FILE);
		// FileHandler.copy(shost, new File("./Errorshots1/img.png"));
		 
	File sot= driver.findElement(By.xpath("(//button[text()='Sign up - it’s free!'])[1]")).getScreenshotAs(OutputType.FILE);
		 
		FileHandler.copy(sot, new File("./Errorshots1/im.jpg"));

	}

}
