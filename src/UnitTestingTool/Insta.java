package UnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Insta {
	WebDriver driver;
	@Test(groups="crm")
	   public void Ista()
	   {
		   driver=new ChromeDriver();
		   driver.get("https://www.instagram.com/accounts/login/");
		   Reporter.log("Insta page is Launched",true);
		   driver.quit();
	   }


}
