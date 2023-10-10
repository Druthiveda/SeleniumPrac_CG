package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	void demo() {
		softAssert.assertTrue(true);//pass
		softAssert.assertEquals("Hiii", "hii");//fail
		softAssert.assertEquals("hii", "hii");//pass
		softAssert.assertFalse(false);//pass
		System.out.println("Passed");
		softAssert.assertAll();
		
	}
}
