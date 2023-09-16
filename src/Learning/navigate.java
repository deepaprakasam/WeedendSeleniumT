package Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Navigation tit = driver.navigate();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		tit.back();
		Thread.sleep(2000);
		tit.forward();
		tit.refresh();

	}

}
