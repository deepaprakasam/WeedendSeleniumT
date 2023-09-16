package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countingoftags {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	 List<WebElement> img = driver.findElements(By.tagName("img"));
	 System.out.println(img);  // It will print only address of the locator of image
      System.out.println(img.size());// It will print only count of the image ----using size()
      
      //Using anger tag to have count of link
      
       List<WebElement> anger = driver.findElements(By.tagName("a"));
       System.out.println(anger.size());
      //Usage of div tags
        List<WebElement> divtags = driver.findElements(By.tagName("div"));
        System.out.println(divtags.size());
        
       
	}

}
