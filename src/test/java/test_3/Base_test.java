package test_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_test {
	
	//cross browser testing date-14/8/2022
	
	WebDriver driver;
	@Parameters ({"BrowserName"})
	@BeforeMethod
	public void BM(String BrowserName ) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
			
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void AF() {
		driver.close();
	}

}
