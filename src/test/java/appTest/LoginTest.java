package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
	//	Thread.sleep(5000);//for firefox
		WebElement LoginLink = driver.findElement(By.partialLinkText("Log"));
		LoginLink.click();
		
		
		
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abc@1234");
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		
		
		  WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		  RememberMe.click();
		 
		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		String ActError = ErrorMsg.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		if(ActError.equals(ExpError)) {
			System.out.println("TC is passed ");
			
		}else {
			System.out.println("TC is Failed");
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links "+ links.size());
		 links.forEach(
		            new Consumer<WebElement>() {
						public void accept(WebElement link) { 
							System.out.println(link.getText());
							System.out.println(link.getAttribute("href")+ " ");
							 
						
						}
					});
		           
		driver.close();
	}

}
