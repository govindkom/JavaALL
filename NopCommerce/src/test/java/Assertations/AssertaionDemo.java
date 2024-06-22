package Assertations;

import org.testng.Assert;
import org.testng.annotations.*;





public class AssertaionDemo {

	
	
	@Test
	void test() {
		
		//Assert.assertEquals("xyz", "xyz1");
//		Assert.assertEquals(123, 345);
//		
//		Assert.assertEquals("123", 123);
//		Assert.assertEquals("abc", 123);
		
		//Assert.assertNotEquals(123, 123);
		
		
	//	Assert.assertTrue(1==2);
		//Assert.assertTrue(1==1);
		
		
		Assert.assertFalse(1==2);
	}
}
