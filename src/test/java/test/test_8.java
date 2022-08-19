package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_8 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//with the help of action class
		//for mouse over on any element ---->use moveElement method
	    WebElement drp_selenium=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		Actions act=new Actions(driver);
		act.moveToElement(drp_selenium).click().build().perform();
		
		//for right click ---->use context method
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rightclick).build().perform();
		
		//double click on any element
		WebElement doubble_click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubble_click).build().perform();
		
		
	}

}
