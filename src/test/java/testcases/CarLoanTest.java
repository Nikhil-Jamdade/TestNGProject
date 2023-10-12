package testcases;

import org.testng.annotations.Test;

public class CarLoanTest extends BaseClass{

	@Test(dependsOnMethods="test4")
	public void test3() {
		System.out.println("Inside CAR loan test3: ");
	}
	
	@Test
	public void test4() {
		System.out.println("Inside CAR loan test4: ");
	}
}