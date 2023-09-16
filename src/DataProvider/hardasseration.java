package DataProvider;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hardasseration {
  
	@Test()
	public void google()
	{  
	  String Expectedtitle="Google - About Google, Our Culture & Company News";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://about.google/");
		Reporter.log(driver.getTitle(),true);
	Assert.assertEquals(Expectedtitle,driver.getTitle(),"The page is not diplayed");
		
	}
	
}
