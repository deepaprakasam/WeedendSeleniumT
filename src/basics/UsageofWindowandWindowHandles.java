package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofWindowandWindowHandles {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.meesho.com/");
	//driver control is in meesho so we get meesho page id
	//Once we navigate to facebook page we get facebook id
 //	windowHandle
	
	
	System.out.println(driver.getWindowHandle());
	//WindowHandles
	Set<String> simple = driver.getWindowHandles();
	for(String s: simple)
	{
		System.out.println(simple);
	}
}
}
