package task_N_1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class task_2 extends task_1 {
	
   @Test
   public void amazon_test() throws Exception {
	   
	   Actions action=new Actions(driver);
	   WebElement search_bar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	   search_bar.sendKeys("mobile");
	   
	   WebElement btn_submit=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	   btn_submit.click();
	   
	   WebElement mobile=driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]"));
	   action.moveToElement(mobile).click().build().perform();
	   
	   //taking screenshot
	   String location="C:\\Users\\Omsai\\Desktop\\java Learning\\Batch_12_project\\screenshot";
	   String s=RandomString.make(5);
	   TakesScreenshot ts=(TakesScreenshot) driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   File destn=new File(location+"\\"+s+".png");
	   FileUtils.copyFile(src, destn);
	   
	   //print name on console
	   WebElement mobile_name=driver.findElement(By.xpath("//a[@class='ProductShowcase__title__SBCBw']"));
	   String name=mobile_name.getText();
	   System.out.println(name);
	   
	   WebElement text=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	   String actual_str=text.getText();
	   System.out.println(actual_str);
	   
	   String expected_str="amazon.in";
	   Assert.assertEquals(actual_str, expected_str);
	   
	   System.out.println("task done");
	   
	   
   }

}
