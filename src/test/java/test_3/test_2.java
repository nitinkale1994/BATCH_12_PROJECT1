package test_3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test_2 {

	@Test
	public void test_N_1() {
		//hard assert or assert---->it allows us to verify result of an operation
	    //                     ---->assert fall-abort execution of next stages of that test case
		//                     ----> contineu-next test cases
		System.out.println("email");
		System.out.println("pass");
		System.out.println("login");
		
		String expected="Bugspotter";
		String actual="bugspotter";	
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("test done");
	}
	
	@Test
	public void test_N_2() {
		
		System.out.println("login1");
	}
}
