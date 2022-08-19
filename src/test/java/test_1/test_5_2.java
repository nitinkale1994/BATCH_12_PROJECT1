package test_1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_5_2 {
	
	@Test
	public void login() {
		Assert.assertTrue(false);
		System.out.println("test A");
		}
	@Test (dependsOnMethods="login")
	public void Home_page() {
		System.out.println("test B");
		
	}
	@Test(priority=2)
	public void forgotten_pass() {
		System.out.println("test C");
   }
}
