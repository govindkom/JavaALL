package TestNG;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=1)
	void openApp() {
		System.out.println("opening application");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("login to application");
	}
	
	@Test(priority=3)
	
	void logout() {
		System.out.println("logout from application");
	}

}
