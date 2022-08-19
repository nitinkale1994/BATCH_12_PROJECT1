package test_1;

import org.testng.annotations.Test;

public class test_5_1 {
	
	@Test (priority=1,invocationCount=3)
	public void username_test() {
		System.out.println("test A");
	}
	@Test (priority=3,enabled=false)
	public void login_btn() {
		System.out.println("test B");
	}
	@Test(priority=2)
	public void pass_test() {
		System.out.println("test C");
	}

}
