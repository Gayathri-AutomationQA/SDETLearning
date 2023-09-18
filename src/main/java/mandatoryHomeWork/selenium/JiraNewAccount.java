package mandatoryHomeWork.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JiraNewAccount {
	
	String myProjectname = "SDET5_GayathriAutomationProject";
	
	@Test
	public void jiraAccount() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://api-training.atlassian.net/");
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com",Keys.ENTER);
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("login-submit")).click();
		
		WebElement sdet5Link = driver.findElement(By.xpath("//p[text()='SDET-5']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(sdet5Link));
		
		driver.findElement(By.xpath("//p[text()='SDET-5']")).click();
		
		WebElement createLink = driver.findElement(By.xpath("//span[text()=\"Create\"]"));
		WebDriverWait waitforCreateLink = new WebDriverWait(driver, Duration.ofSeconds(60));
		waitforCreateLink.until(ExpectedConditions.elementToBeClickable(createLink));
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()=\"Create\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"summary\"]")).sendKeys(myProjectname,Keys.ENTER,Keys.ESCAPE);
		
		WebElement backlogLink = driver.findElement(By.xpath("//span[text()=\"Backlog\"]/ancestor::a"));
		WebDriverWait waitforBacklogLink = new WebDriverWait(driver, Duration.ofSeconds(30));
		waitforBacklogLink.until(ExpectedConditions.elementToBeClickable(backlogLink));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("arguments[0].click();", backlogLink);
		
//		driver.findElement(By.id("//span[text()=\"Backlog\"]")).click();
		driver.findElement(By.xpath("//input[@data-test-id=\"searchfield\"]")).sendKeys(myProjectname,Keys.ENTER);
		
		String outputProjectName = driver.findElement(By.xpath("//a[@data-component-selector=\"issue-field-summary-inline-edit-link.ui.read.styled-link-item\"]//mark")).getText();
		if(outputProjectName.contains(myProjectname)) {
			System.out.println("Creation Successfull");
		}else {
			System.out.println("Created UnSuccessfull");
		}

		driver.close();
	}
	

}
