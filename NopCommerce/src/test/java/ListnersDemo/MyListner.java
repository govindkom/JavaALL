package ListnersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {
	
	 public void onStart(ITestContext context) {
		 System.out.println("test execution start==only once will start");
		  }
	
	 public void onTestStart(ITestResult result) {
		 System.out.println("test execution started==for every test execution");
		  }
	 

	 public void onTestSuccess(ITestResult result) {
		 System.out.println("test passed");
		  }
	 
	 
	 public void onTestFailure(ITestResult result) {
		 System.out.println("test failed");
		  }
	  
	  
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("test skipped");
		  }

}
