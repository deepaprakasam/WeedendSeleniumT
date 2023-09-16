package UnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class wipro {
	WebDriver driver;
	@Test
	public void wipro()
	{

		driver=new ChromeDriver();	
		driver.get("https://www.wipro.com/");
		Reporter.log("wipro page is launched",true);
		driver.quit();
	}


}

