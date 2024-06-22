package Assertations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAss {
	
	
	//@Test
	/*void hardassertations() {
		
		System.out.println("testing");
		System.out.println("testing");
		
		Assert.assertEquals(1, );
		
		System.out.println("testing");
		System.out.println("testing");
	}
*/
	
	

	@Test
	void hardassertations() {
		
		SoftAssert sa= new SoftAssert();
		System.out.println("testing");
		System.out.println("testing");
		
		sa.assertEquals(1, 1);
		
		System.out.println("testing");
		System.out.println("testing");
		
		sa.assertAll();
}
}
