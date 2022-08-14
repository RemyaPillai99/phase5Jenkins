package appTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);

	WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	UserName.sendKeys("Abc@xyz.com");
	
	WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
	Password.sendKeys("Abc@xyzPassword.com");
	
	WebElement textSearch = driver.findElement(By.xpath("//*[text()='Facebook helps you connect and share with the people in your life.']"));

	System.out.println(textSearch.getText());
	
	WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	
	LoginBtn.click();
	
}

}
