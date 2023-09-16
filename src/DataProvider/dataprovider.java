package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
   @DataProvider(name="cred", parallel=true)
   public String[][]data()
   {
	   String[][] arss= {{"Shiva","123456"},{"Deepa","Fathd123"},{"deepa1","895gashdasg"}};
	   return arss;   
   }
   @Test(dataProvider="cred")
	   public void fetch(String[] Credentails) throws InterruptedException
	   {
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://demo.actitime.com/login.do");
		   driver.findElement(By.id("username")).sendKeys(Credentails[0]);
		   driver.findElement(By.name("pwd")).sendKeys(Credentails[1]);
		   Thread.sleep(1000);
		   driver.quit();
	   }
   }
  

