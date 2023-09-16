
package DataDriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertyfile {

	public static void main(String[] args) throws IOException {
	
		//./ navigate form Project to File
		FileInputStream fis= new FileInputStream("./TestData/TestData.properties");
		////Object for Properties
		Properties prop=new Properties();
		//Load or fetch the files
		prop.load(fis);
		String testdata = (String) prop.get("url");
		WebDriver driver=new ChromeDriver();
		driver.get(testdata);

	}

}
