package JsExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement hidden = driver.findElement(By.name("custom_gender"));
		//JSE is abstract
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//arguments[0] is the condition 
		//how many condition we have based on condition we have to pass the arguments index
		//clear method is not there so we can override
		js.executeScript("arguments[0].value='GoodLife'",hidden);
	}

}
