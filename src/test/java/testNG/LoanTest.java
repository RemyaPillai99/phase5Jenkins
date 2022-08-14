package testNG;

import org.testng.annotations.Test;

public class LoanTest {
	@Test(groups= {"sanity"})
	public void personalLoanTest1() {
		System.out.println("Inside Pl1");
	}

}
