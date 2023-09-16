package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Praveenkumar/Desktop/WeekendSelenium/SingleSelect.html");
        WebElement element = driver.findElement(By.id("Empire"));
        Select select =new Select(element);
      //  select.selectByIndex(0);
        //select.selectByValue("d");
       select.selectByVisibleText("Chapati");
	}

}
