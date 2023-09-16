package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofURlurl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// instead of using driver.get() method we use driver.navigateTo
		//driver.get()-waiting to launch the browser
		//driver.navigate.tostring() or to Url()-directly launching the window
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	String URL = "https://www.meesho.com/";
	driver.navigate().to(URL);
	Navigation nav = driver.navigate();
    nav.back();
    Thread.sleep(2000);
    nav.forward();
    Thread.sleep(2000);
    nav.refresh();
     driver.quit();
     
     
     
    

	}

}
