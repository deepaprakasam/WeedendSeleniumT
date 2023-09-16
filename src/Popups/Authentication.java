package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//url-https://the-internet.herokuapp.com/basic_auth
		//online food delivery -swiggy and zomato
		//directly we can pass username and password in link
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
