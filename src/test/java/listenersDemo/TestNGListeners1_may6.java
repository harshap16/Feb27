package listenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners1_may6 implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCases Started and TestCase details are"+result.getName());	
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCases Success and TestCase details are"+result.getName());	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and TestCase details are"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCases Skipped and TestCase details are"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext result) {
		
		System.out.println("TestCases Started and TestCase details are"+result.getName());
	}

	public void onFinish(ITestContext result) {
		
		
	}

}
