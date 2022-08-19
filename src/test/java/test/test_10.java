package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_10 {

	public static void main(String[] args) {
		//key bord action
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	
		//capital later---->use shift key
		Actions act= new Actions(driver);
		act.keyDown(email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
		
		//select all and copy text and pest
		act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.click();
		
		act.keyDown(pass,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		
		btn_login.sendKeys(Keys.ENTER);
		
		
		
		

	}

}
