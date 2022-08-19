package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_2 {

	public static void main(String[] args) throws Exception{
		
		
		// browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//get title here
		
		String titel=driver.getTitle();
		System.out.println(titel); //facebook log in or sign up
		
		//get current url here
		
		String url=driver.getCurrentUrl(); //
		System.out.println(url);  //https://www.facebook.com
		
		//nevigate to another window
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(5000);  //5 sec.
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
