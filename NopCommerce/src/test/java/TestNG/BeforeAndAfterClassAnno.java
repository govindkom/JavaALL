package TestNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterClassAnno {

	  
		@BeforeClass
		void login() {
			System.out.println("logged in");
		}
		
		
		@AfterClass
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



