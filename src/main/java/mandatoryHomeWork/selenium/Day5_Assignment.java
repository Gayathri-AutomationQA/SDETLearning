package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5_Assignment {

	/*
	 *  Day_6 
		 Assignment 
		
		1.Launch the url:
		https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm 
		2.Click Try It Button
		3.Click OK/Cancel in the alert
		4.Confirm the action is performed correctly by verifying the text !!
	 */
	
	@Test
	public void testgoogle() {
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText(), "You pressed OK!");
		




		////		Close the browser
		//		driver.quit();
	}
}
