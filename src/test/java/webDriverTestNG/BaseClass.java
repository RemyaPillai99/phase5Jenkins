package webDriverTestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		// Thr

	}
	
	@AfterMethod
	public void TearDown() {
		//System.out.println("@AfterMethod -TearDown");
		
		driver.close();
	}
}
