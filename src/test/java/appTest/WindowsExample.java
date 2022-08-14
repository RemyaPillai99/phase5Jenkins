package appTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		String ParentWin = driver.getWindowHandle();
		System.out.println("Before clicking tab button ");
		
		WebElement Tab = driver.findElement(By.xpath("//*[@id='tabButton']"));
        Tab.click();
        
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        
        while(itr.hasNext()) {
        	String currentHandle = itr.next();
        	System.out.println(currentHandle);
            if(!currentHandle.equals(ParentWin)) {
            	driver.switchTo().window(currentHandle);
            }
        }
        
       // handles.forEach()
        WebElement childWinElement = driver.findElement(By.tagName("h1"));
        System.out.println("Text on new window is "+ childWinElement.getText());
        
        driver.close();//only current window
        //driver.quit();//windows by driver 
        
        driver.switchTo().window(ParentWin);
        
        System.out.println("Back to Parent Window");
        driver.close();
    
        
	}

}
