package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook {
	 @DataProvider(name="cred", parallel=true)
	   public String[][]data()
	   {
		   String[][] cat= {{"Deepa","Prakasam","deepaprakasamr@gmail.com","8870637996"}};
		   return cat;   
	   }
	   @Test(dataProvider="cred")
		   public void deat(String[] Credentails) throws InterruptedException
		   {
			   WebDriver driver=new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			   driver.get("https://www.facebook.com/signup");
			   driver.findElement(By.name("firstname")).sendKeys(Credentails[0]);
			   driver.findElement(By.name("lastname")).sendKeys(Credentails[1]);
			   driver.findElement(By.name("reg_email__")).sendKeys(Credentails[2]);
			   driver.findElement(By.id("password_step_input")).sendKeys(Credentails[3]);
			   Thread.sleep(1000);
			   driver.quit();
		   }
	   }


