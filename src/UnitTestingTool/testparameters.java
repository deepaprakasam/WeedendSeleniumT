package UnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testparameters {
	WebDriver driver;
	@Test(dependsOnMethods="bell")
	public void tcs()
	{
	driver=new ChromeDriver();	
	driver.get("https://www.tcs.com/");
	Reporter.log("TCS page is launched",true);
	driver.quit();
	}
	@Test(invocationCount=2,threadPoolSize=2)
	public void bell()
	{

		driver=new ChromeDriver();	
		driver.get("https://www.thebellcompany.com/");
		Reporter.log("Bell page is launched",true);
		driver.quit();
	}
	@Test(priority=2,invocationCount=2)
	public void wipro()
	{

		driver=new ChromeDriver();	
		driver.get("https://www.wipro.com/");
		Reporter.log("wipro page is launched",true);
		driver.quit();
	}
 @Test()
   public void Ista()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.instagram.com/accounts/login/");
	   Reporter.log("Insta page is Launched",true);
	   driver.quit();
   }
}
