package selectClass;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RealtimeSingleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		WebElement dayOption = driver.findElement(By.id("day"));
		WebElement monthOption = driver.findElement(By.id("month"));
		WebElement yearOption = driver.findElement(By.id("year"));
		Select s1= new Select(dayOption);
		Select s2 = new Select(monthOption);
		Select s3 = new Select(yearOption);
		s1.selectByIndex(0);
		s2.selectByValue("3");
		s3.selectByVisibleText("1996");

	}

}
