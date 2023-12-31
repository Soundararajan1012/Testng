package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class List implements ITestListener{
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case start");
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Success of test cases and its details are:"+result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Failure of test cases and its details are:"+result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Skipped of test cases and its details are:"+result.getName());
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("FailedwithinSuccessPercentage test cases and its details:"+result.getName());
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("Start");
	
	}
	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("Finish");
	}
}
