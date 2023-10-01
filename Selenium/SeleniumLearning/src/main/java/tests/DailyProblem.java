package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import hooks.BaseClass;
import pages.toolBarPage;

public class DailyProblem extends  BaseClass{
	@Test
	public void SearchBookAtomicHabit() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
	
	}

}
