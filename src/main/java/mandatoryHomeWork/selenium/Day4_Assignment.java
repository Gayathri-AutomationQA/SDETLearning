package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4_Assignment {

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
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
//		driver.findElement(By.xpath("//a[@title=\"Chatter\"]")).click();
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		jsExecutor.executeScript("arguments[0].click();", chatter);
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@role=\"textbox\"]")).sendKeys("What is the name?");
		driver.findElement(By.xpath("//div[@role=\"textbox\"]")).sendKeys("Details");
		driver.findElement(By.xpath("//button[@title=\"Click, or press Ctrl+Enter\"]")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);

		Assert.assertEquals((driver.findElement(By.xpath("(//span[@class=\"uiOutputText\"])[3]")).getText()),"What is the name?" );

////		Close the browser
//		driver.quit();
}
}
