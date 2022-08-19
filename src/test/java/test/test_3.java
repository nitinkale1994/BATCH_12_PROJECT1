package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_3 {

	public static void main(String[] args) throws Exception {
		
		//open browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//identify the webelement--->locator--->id
		
		WebElement txt_email=driver.findElement(By.id("email"));
		txt_email.sendKeys("nitin303@gmail.com");
		
		WebElement txt_password=driver.findElement(By.id("pass"));
		txt_password.sendKeys("9766926617");
		
		Thread.sleep(5000);  // 5 sec
	
		//identify webelement by--->locator--->name
		
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
		
		Thread.sleep(5000); //5 sec
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		driver.close();
		
	}

}
