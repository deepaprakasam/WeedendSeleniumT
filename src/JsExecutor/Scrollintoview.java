package JsExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollintoview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //True-sroll down
		//False-scroll up
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement static1 = driver.findElement(By.xpath("//span[text()='WhatsApp']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",static1);
	}

}
