package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Login(String userName, String password) {
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(userName);

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(password);

		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();

		
	}

}
