package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RealTimeMultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement element1 = driver.findElement(By.id("cars"));
		Select s = new Select(element1);
		s.selectByIndex(3);
		s.selectByValue("399");
	    s.selectByVisibleText("More Than INR 500 ( 55 ) ");
	    s.deselectByValue("399");
	    System.out.println("The first Selected Option:"+ s.getFirstSelectedOption().getText());
	    List<WebElement> multiple = s.getAllSelectedOptions();
	    for(WebElement d: multiple)
	    {
	    	System.out.println(d.getText());
	    }
	  System.out.println(s.isMultiple());  
	  s.deselectAll();
	}

}
