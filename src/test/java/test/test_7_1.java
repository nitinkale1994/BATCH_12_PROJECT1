package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_7_1 {

	public static void main(String[] args) {
		
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/register.php");
	        driver.manage().window().maximize();
	        
	        //identify drop down---->by using method
	        WebElement drop_down=driver.findElement(By.xpath("//select[@name='country']"));

	        HandleDreoDwon(drop_down,"BANGLADESH");

	}

     //method----->
private static void HandleDreoDwon(WebElement element, String string) {
	
	 Select select=new Select(element);
	 
	 select.selectByVisibleText("BANGLADESH");
}

}
