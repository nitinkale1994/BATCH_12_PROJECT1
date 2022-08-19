package test_3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test_3 {
	
	//soft assert or verify---->need to create object of soft class
	//we  need to call assertAll() method at the end of test case
	@Test
	public void test_N_1() {
		
		SoftAssert soft=new SoftAssert();
		System.out.println("email");
		System.out.println("pass");
		System.out.println("login");
		
		String expected="Bugspotter";
		String actual="bugspotter";	
		
		soft.assertEquals(actual, expected);
		
		System.out.println("test done");
		
		soft.assertAll();
		
	}

}
