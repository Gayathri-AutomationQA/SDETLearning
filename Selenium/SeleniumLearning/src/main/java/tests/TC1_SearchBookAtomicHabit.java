package tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import hooks.BaseClass;
import pages.toolBarPage;

public class TC1_SearchBookAtomicHabit extends  BaseClass{
	@Test
	public void SearchBookAtomicHabit() {
		new toolBarPage (driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Atomic Habits");
		driver.findElement(By.id("nav-search-submit-text")).click();
	}

}
