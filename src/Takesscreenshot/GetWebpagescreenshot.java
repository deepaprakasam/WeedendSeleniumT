package Takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetWebpagescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		//we can take entire webpage we need to typecaste
	    TakesScreenshot shot=(TakesScreenshot) driver;
	    File f = shot.getScreenshotAs(OutputType.FILE);
	    System.out.println(f);
	    
	    //filehandler taken from selenium package to import
	    //throw declaration throws IO Exception
	   FileHandler.copy(f, new File("./Errorshots1/image1.png"));

	}

}
