package com.sample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day2_CreateNewDashboard {

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
		driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).sendKeys("Dashboard");
		driver.findElement(By.xpath("//mark[text()='Dashboard']")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//div[@title=\"New Dashboard\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		WebElement Frame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(Frame);
		driver.findElement(By.xpath("//input[@id=\"dashboardNameInput\"]")).sendKeys("Salesforce Automation By Gayathri");
		driver.findElement(By.xpath("//button[@id=\"submitBtn\"]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;		

//		Close the browser
		driver.quit();
		
	}
	
}
