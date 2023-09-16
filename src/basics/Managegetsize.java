package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managegetsize {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		//getsize//get height//getwidth before maximizing 
		//to get height and width of the window
		Dimension sizeOfWindowbeforemaximizing = driver.manage().window().getSize();
		System.out.println(sizeOfWindowbeforemaximizing.getHeight());
		System.out.println(sizeOfWindowbeforemaximizing.getWidth());
	
		//getsize//get height//getwidth after maximizing
		
		driver.manage().window().maximize();
		Dimension sizeOfWindowaftermaximizing = driver.manage().window().getSize();
		System.out.println(sizeOfWindowaftermaximizing.getHeight());
		System.out.println(sizeOfWindowaftermaximizing.getWidth());
	    driver.quit();
	}

}
