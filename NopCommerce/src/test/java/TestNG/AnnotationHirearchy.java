package TestNG;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationHirearchy {
	
	@BeforeSuite
	void BS(){
		System.out.println("this is before suite");
	}

	@AfterSuite
	void AS() {
		System.out.println("this is after suite");
	}
	
	@BeforeTest
	void BT() {
		System.out.println("this is before Test");
	}
	
	@AfterTest
	void AT() {
		System.out.println("this is after Test");
	}
	
	@BeforeClass
	void BC() {
		System.out.println("this is before class");
	}
	
	@AfterClass
	void AC() {
		System.out.println("this is after class");
	}
	
	@BeforeMethod
	void BM() {
			System.out.println("this is before method");
		}
	
	@AfterMethod
	void AM() {
		System.out.println("this is after method");
	
	}
	
	@Test
	void tm1() {
		System.out.println("this is test method 1");
		
	}
	
	@Test
	void TC2() {
		System.out.println("this is test method 2");
	}
	
	
}
