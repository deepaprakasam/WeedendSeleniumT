package Learning;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		Set<String> allwid = driver.getWindowHandles();
		for(String w: allwid)
		{
		System.out.println(allwid);
	}

}
}
