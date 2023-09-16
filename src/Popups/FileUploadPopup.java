package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.freshersworld.com/user/register");
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Praveenkumar\\Desktop\\praveen_resume (1).pdf");

	}

}
