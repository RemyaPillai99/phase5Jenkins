package appTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot obj = (TakesScreenshot) driver;
		File file = obj.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("image.png"));
		

	}

}
