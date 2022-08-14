package appTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		WebElement elem = driver.findElement(By.xpath("//*[@id='alertButton']"));
        elem.click();
        
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        
        
       

	}

}
