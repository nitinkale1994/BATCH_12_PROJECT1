package test_1;

import org.testng.annotations.Test;

public class test_6 {
	
	@Test(groups="sanity")
	public void test_A() {
		System.out.println("A");
		

	}
	@Test(groups="critical regression")
	public void test_B() {
		System.out.println("B");
		

    }
	@Test(groups="regression")
	public void test_C() {
		System.out.println("C");
    }
	@Test(groups="regression")
	public void test_D() {
		System.out.println("D");
    }		
}