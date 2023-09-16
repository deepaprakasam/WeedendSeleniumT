package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launching {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//get method()
		//driver.get("https://www.flipkart.com/");
      driver.get("https://www.amazon.com/");
      
    //  gettitle()
     String title =driver.getTitle(); 
		System.out.println(title);
		//getCurrentTitle()
		
		System.out.println(driver.getCurrentUrl());
		//getpageSource()
	//	System.out.println(driver.getPageSource());
		String tit = driver.getPageSource();
		System.out.println(tit);

		
	}

}
