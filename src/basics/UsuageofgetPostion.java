package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsuageofgetPostion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		// import point  to selenium Package
		//getposition which place to place
		//dimension import from Selenium Package
		driver.manage().window().setSize(new Dimension(300,600));
		Thread.sleep(2000);
	
		driver.manage().window().setPosition(new Point(0,0));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(200,500));
		driver.quit();
		
	}

}
