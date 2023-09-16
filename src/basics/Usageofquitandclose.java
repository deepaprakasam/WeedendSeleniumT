package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usageofquitandclose {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
	//	driver.quit();
		driver.close();
		

	}

}
