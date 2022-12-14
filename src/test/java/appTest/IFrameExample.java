package appTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
        driver.switchTo().frame("frame1");
        
        WebElement heading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println(heading.getText());
        
        driver.switchTo().defaultContent();
	}

}
