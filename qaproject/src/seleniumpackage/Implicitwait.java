package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        
	        // Initialize WebDriver
	        ChromeDriver driver = new ChromeDriver();
	        
	        // Set implicit wait time
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        // Open a web page
	        driver.get("http://www.google.com");
	        
	        // Perform actions on the web page
	        
	        // Quit the driver
	        driver.quit();		
	}

}
