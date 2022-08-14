package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountTest {
	
	
	@BeforeTest
	public void Method1() {
		System.out.println("Inside before test");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void SetUp() {
		System.out.println("inside SetUp method ");
		
	}
	
	@Test(enabled = true,priority=1, description="this test will validate Something..")
	public void SavingAccountTest1() {
		System.out.println("Inside saving Acc test1");
		
	}
	
	@Test(priority=0)
	public void SavingAccountTest2() {
		System.out.println("Inside saving Acc test2");
		
	}
	
	@Test(groups= {"sanity"},priority=2)
	public void CheckingAccountTest1() {
		System.out.println("Inside CheckingAccount test1");
		
	}


	@AfterMethod
	public void TearDown() {
		System.out.println("inside TearDown method ");
		
	}
	
	@AfterTest
	public void Method2() {
		System.out.println("Inside After test");
	}
	
}
