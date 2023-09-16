package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Praveenkumar/Desktop/WeekendSelenium/MultipleSelect.html");
        WebElement element = driver.findElement(By.id("Empire"));
        Select select =new Select(element);
        select.selectByIndex(2);
        select.selectByValue("e");
       select.selectByVisibleText("Dal");
       select.deselectByVisibleText("Dal");
        System.out.println("The first selected Option:"+ select.getFirstSelectedOption().getText());
        List<WebElement> multiple = select.getAllSelectedOptions();
        for(WebElement multi:multiple)
        {
        	System.out.println(multi.getText());
        }
        System.out.println("Checking is it multiple or not"+ select.isMultiple());
        select.deselectAll();  
        

	}

}
