package JsExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-8u381-linux-aarch64.tar.gz")).click();
		WebElement disable = driver.findElement(By.linkText("Download jdk-8u381-linux-aarch64.tar.gz"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", disable);
      
	}

}
