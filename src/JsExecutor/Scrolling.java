package JsExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/doodles");
		//we have to typecast it
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(;;)
		{
			try
			{
			driver.findElement(By.linkText("Willy De Bruyn's 109th Birthday")).click();
			break;
		}
			catch(Exception e)
			{
				//argument if you need you can pass or leave it
				js.executeScript("window.scrollBy(0,1000);", true);
		}
	}
	}
}


