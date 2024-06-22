package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodAnn0 {
  
	@BeforeMethod
	void login() {
		System.out.println("logged in");
	}
	
	
	@AfterMethod
	void logout() {
		System.out.println("logged out");
	}
	
	
	@Test(priority=1)
	void search() {
		System.out.println("item searched");
	}
	
	@Test(priority=2)
	void advanceSearch() {
		System.out.println("advanced search");
	}
	
	
	
}
