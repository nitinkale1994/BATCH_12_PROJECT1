package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_12 {

	public static void main(String[] args) throws Exception {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
        
		//alert
		WebElement txt_id=driver.findElement(By.xpath("//input[@name='cusid']"));
		txt_id.sendKeys("123456");
		WebElement submit_btn=driver.findElement(By.xpath("//input[@name='submit']"));
		submit_btn.click();
		
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(text); //Do you really want to delete this Customer?
		
		//alt.dismiss(); //cancel
		
		alt.accept(); //ok
		Thread.sleep(3000);
		
		String text_1=alt.getText();
		System.out.println(text_1); //Customer Successfully Delete!
		
		alt.accept(); //ok




		
	}

}
