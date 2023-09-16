package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentandIndependent {
	
	//Dunzo Application

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/bangalore");
		driver.findElement(By.xpath("//p[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@class='sc-fznZeY jRsRRC']")).sendKeys("Oranges");
		driver.findElement(By.xpath("(//p[text()='Orange - Nagpur'])[1]/../../..//button[text()='ADD']")).click();
		

	}

}
