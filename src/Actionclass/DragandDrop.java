package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https:trello.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).sendKeys("deepaprakasamr@gmail.com");
		driver.findElement(By.id("login")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Log in']"))));
		driver.findElement(By.id("password")).sendKeys("Deepa0103@1996");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//div[text()='WeekendSelenium']")).click();
		WebElement src = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
        WebElement target = driver.findElement(By.xpath("//h2[text()='Dragclass']/../..//span[text()='Add a card']"));		
        Actions action=new Actions(driver);
         action.dragAndDrop(src, target).perform();
         }

}
