package UnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstProgram {
	WebDriver driver;
	@Test
	public void tcs()
	{
	driver=new ChromeDriver();	
	driver.get("https://www.tcs.com/");
	Reporter.log("TCS page is launched");
	driver.quit();
	}
	@Test()
	public void bell()
	{

		driver=new ChromeDriver();	
		driver.get("https://www.thebellcompany.com/");
		Reporter.log("Bell page is launched");
		driver.quit();
	}
	@Test()
	public void wipro()
	{

		driver=new ChromeDriver();	
		driver.get("https://www.wipro.com/");
		Reporter.log("wipro page is launched");
		driver.quit();
	}
}
