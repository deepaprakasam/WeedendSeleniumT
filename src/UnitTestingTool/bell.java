package UnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class bell {
	WebDriver driver;

	@Test
	public void bell()
	{

		driver=new ChromeDriver();	
		driver.get("https://www.thebellcompany.com/");
		Reporter.log("Bell page is launched");
		driver.quit();


}
}