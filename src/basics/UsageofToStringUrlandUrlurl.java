package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofToStringUrlandUrlurl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.meesho.com/");
         Thread.sleep(2000);
         driver.navigate().to("https://www.facebook.com/");
       Navigation nav = driver.navigate();
       nav.back();
       Thread.sleep(2000);
       nav.forward();
       Thread.sleep(2000);
       nav.refresh();
        driver.quit();
         
         
	}

}
