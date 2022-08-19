package test_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test_4 extends test_3 {
	
	@Test
	public void username_test() {
		
		// test email field
		driver.findElement(By.xpath("//input[@id='email']"));
	
	}
	@Test
	public void pass_test() {
		//test pass field
		driver.findElement(By.xpath("//input[@id='pass']"));
		
	}
	@Test
	public void login_click() {
		//login click
		driver.findElement(By.xpath("//button[@name='login']"));
		
	}

}
