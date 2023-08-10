package hooks;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public ChromeDriver driver;
	public Properties configProp;
	
	 @BeforeClass  
	public Properties readProperties() throws IOException{		
		FileReader reader = new FileReader("./src/main/java/utils/config.properties");
		configProp = new Properties();
		configProp.load(reader);  
		return configProp;
	}
	 @BeforeMethod
	public void launch() {		
		// driver setup
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(configProp.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	 
	 @AfterMethod
		public void tearDown() {
			//driver.close();
		}
	
}
