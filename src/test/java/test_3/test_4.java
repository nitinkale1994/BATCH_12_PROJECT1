package test_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_4 {
	
	@Test
	public void verify_test_1() throws Exception {
		
		//scroll by pixel  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(3000);
		//scroll by element   not done--->practice again
		WebElement english=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeScript("arguments[0].scrollIntoViwe()",english);
		
	}

}
