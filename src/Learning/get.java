package Learning;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
		//String tit = driver.getTitle();
	  //  System.out.println(tit);
	  //  String url = driver.getCurrentUrl();
	   // System.out.println(url);
	    //String save = driver.getWindowHandle();
	   // System.out.println(save);
	    driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		
		driver.get("https://www.youtube.com/");
		Set<String> all = driver.getWindowHandles();
   System.out.println(all.size());
   
	//	driver.get("https://www.amazon.in/");
	//	driver.switchTo().newWindow(WindowType.WINDOW);
		
	//	driver.get("https://www.flipkart.com/");
		
	//	driver.get("https://www.youtube.com/");
	//Set<String> til = driver.getWindowHandles();
	//System.out.println(til);
	
 //   String all = driver.getTitle();
//	System.out.println(all);
	}

}
