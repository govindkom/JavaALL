package TestNGDEmo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Execution Started");
		System.out.println("Test Execution Started");
	}
	
	public void onFinish(ITestContext context) {
		
		System.out.println("Test Execution Ended");
	}
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Execution successful");
	}
	
	public void onTestFailure(ITestResult result) {
		
		// Take a ScreenShot
		// updating the failure status inot the Reports
		// update in logs
		System.out.println("Test Execution Failed");
	}
	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Execution got skipped");
	}
	
	
	
}
