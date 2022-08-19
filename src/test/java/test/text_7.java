package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class text_7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        
        //identify drop down
        WebElement drop_down=driver.findElement(By.xpath("//select[@name='country']"));

    
        
        Select sel=new Select(drop_down);
        
        System.out.println(sel.getFirstSelectedOption().getText());
        
        //select by index
        sel.selectByIndex(2);
        
        //select by value
        Thread.sleep(5000);
        sel.selectByValue("BANGLADESH");
        
        Thread.sleep(3000); //3 sec.
        //select by visible text
        sel.selectByVisibleText("AUSTRALIA");
        
       List<WebElement>list= sel.getOptions();
       System.out.println(list.size());
       
       for (int i=0;i<=list.size();) {
    	   
    	   String text=list.get(i).getText();
    	   
    	   System.out.println(text);
    	   
    	   if(text.equals("BANGLADESH"));{
    	   
    	   sel.selectByVisibleText("BANGLADESH");
    	   
    	   break;
    	   }
       }
	
}	
       
}
	
