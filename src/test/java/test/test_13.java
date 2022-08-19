package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_13 {

	public static void main(String[] args) {
		
		//browser open 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentwindowadd=driver.getWindowHandle();
		System.out.println(parentwindowadd);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> Alladdress=driver.getWindowHandles();
		System.out.println(Alladdress);
		
		Iterator <String> it=Alladdress.iterator();
		
		while(it.hasNext()) {
			
			String childwindowaddress=it.next();
			
			if(!parentwindowadd.equals(childwindowaddress)) {
				
				driver.switchTo().window(childwindowaddress);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("123456789");
				driver.close();
				
			}
			
		}
            driver.switchTo().window(parentwindowadd).close();
	}

}
