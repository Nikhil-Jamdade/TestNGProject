package testcases;

import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {

	@Test(priority=0)
	public void test1() {
		System.out.println("Inside HOME loan test1: ");
	}

	@Test(enabled=false)
	public void test2() {
		System.out.println("Inside HOME loan test2: ");

	}
}