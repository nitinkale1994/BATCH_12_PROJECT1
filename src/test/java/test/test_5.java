package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_5 {

	public static void main(String[] args) throws Exception {
		
		// identify x-path
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				//identify absolute x-path username
				WebElement txt_email=driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
				txt_email.sendKeys("niti@123");
						
				//identify relative x-path password
				
				//identify x_path by attribute
				WebElement txt_pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
				txt_pass.sendKeys("12345678");
				Thread.sleep(5000);// 5sec
	
				
				
				//x-path by index-----> create new account
				WebElement crt_account=driver.findElement(By.xpath("//a[contains(@id,\"u_0_0_uX\")][1]"));
				crt_account.click();
				WebElement name=(WebElement) driver.findElements(By.xpath("(//input[@data-type=\"text\"])[1]"));
				name.sendKeys("nitin");
				Thread.sleep(5000); //5 sec
				driver.close();
				
				

	}

}
