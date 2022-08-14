package webDriverTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.Test;

import pages.LoginPage;

public class SimpliLearnLoginTest extends BaseClass {

	@Test
	public void NegativeTest() {

		LoginPage login = new LoginPage(driver);
		login.Login("abc@xyz.com", "Abc@1234");

		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		String ActError = ErrorMsg.getText();
		String ExpError = "The email or password you have entered is invalid.";
		Assert.assertEquals(ActError, ExpError);

	}

	/*
	 * @Test public void PositiveTest() {
	 * 
	 * LoginPage login = new LoginPage(driver);
	 * login.Login("remya.pillai99@gmail.com","remDev@89");
	 * 
	 * 
	 * 
	 * WebElement ErrorMsg = driver.findElement(By.id("msg_box")); String ActError =
	 * ErrorMsg.getText(); String ExpError =
	 * "The email or password you have entered is invalid.";
	 * Assert.assertEquals(ActError, ExpError);
	 * 
	 * 
	 * }
	 */

}
