package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	void demo() {
		Assert.assertTrue(true);//pass
		Assert.assertEquals("Hiii", "hii");//fail
		Assert.assertEquals("hii", "hii");//pass
		Assert.assertFalse(false);//pass
		System.out.println("Passed");
		
		
	}

}
