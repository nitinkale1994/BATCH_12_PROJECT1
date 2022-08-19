package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class text_11 {

	public static void main(String[] args) throws Exception {
		
	//take screen-shoot
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		
		email.sendKeys("kale@123");
		txt_pass.sendKeys("12345678");
		btn_login.click();
		
		String path="C:\\Users\\Omsai\\Desktop\\java Learning\\Batch_12_project\\screenshot";
		
		String rm=RandomString.make(3);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\"+rm+".png");
		
		FileUtils.copyFile(src, destn);
		
	}

}
