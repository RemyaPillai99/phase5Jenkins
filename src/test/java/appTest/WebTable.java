package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Toal Num of rows"+Rows.size());
		
		List<WebElement> Cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("Toal Num of rows"+Cols.size());
		

		WebElement Data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println(Data.getText());
		
	}

}
