package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeTest(alwaysRun=true)
	public void before1() {
		System.out.println("Inside BeforeTest: ");
	}

	@AfterTest(alwaysRun=true)
	public void before2() {
		System.out.println("Inside AfterTest: ");
	}

	@BeforeMethod(alwaysRun=true)
	public void method1() {
		System.out.println("Inside BeforeMethod: ");
	}

	@AfterMethod(alwaysRun=true)
	public void method2() {
		System.out.println("Inside AfterMethod: ");
	}
}