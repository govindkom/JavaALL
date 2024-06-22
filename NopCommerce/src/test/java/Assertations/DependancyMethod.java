package Assertations;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependancyMethod {
	
	
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(false);
	}

	
	@Test(priority=1, dependsOnMethods = {"openapp"})
	void login() {
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"login"})
	void search() {
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"login"})
	void advsearch() {
		Assert.assertTrue(true);
	}
	
	
	@Test(dependsOnMethods = {"login"})
	void logout() {
		Assert.assertTrue(true);
	}
	
	
}
