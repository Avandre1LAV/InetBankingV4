package Listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {
	
	public void onTestStart(ITestResult tr) {
		System.out.println("Test Started.......");
	}
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test passed.......");
	}
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failed.......");
		//Provide screeshot
	}
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Skipped.......");
	}

}
