package com.hrms.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hrms.testbase.BaseClass;

public class Listener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test started "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed "+result.getName());
		CommonMethods.takeScreenshot("passed/"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed "+result.getName());
		CommonMethods.takeScreenshot("failed/"+result.getName());
	}
	
	
}

	
	
	

