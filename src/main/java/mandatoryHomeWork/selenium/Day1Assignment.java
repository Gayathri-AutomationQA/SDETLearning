package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1Assignment {

	@Test
	public void testgoogle() {
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//div[@class=\"slds-icon-waffle\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"View All\"]")).click();
		driver.findElement(By.xpath("//div[@class='slds-truncate']//p[text()='Sales']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
		js.executeScript("arguments[0].click();", account);
		
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		driver.findElement(By.xpath("//input[@class=\"slds-input\" and @name='Name']")).sendKeys("Gayathri Balakrishnan");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();

//		Close the browser
		driver.quit();
		
	}
	
}
