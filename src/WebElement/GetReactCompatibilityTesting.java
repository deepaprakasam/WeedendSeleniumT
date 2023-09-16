package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetReactCompatibilityTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		Rectangle emailtextfield = email.getRect();
		Rectangle passwordtextfield = pass.getRect();
		System.out.println(emailtextfield.getDimension());
		System.out.println(passwordtextfield.getDimension());
		if(emailtextfield.getX()==passwordtextfield.getX())
		{
			System.out.println("X alignment are same");
		}
		else
		{
			System.out.println("X alignment not same");
		}
		if(emailtextfield.getY()==passwordtextfield.getY())
		{
			System.out.println("Y is same");
		
		}
		else
		{
			System.out.println("Y is not same");
		}
	}
	
	
	
}
