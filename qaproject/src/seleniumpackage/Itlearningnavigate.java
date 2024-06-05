package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itlearningnavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://www.itlearn360.com/");
	       
	        browserObject.findElement(By.className("fa-facebook")).click();
	        browserObject.navigate().back();
	        
	        browserObject.findElement(By.className("fa-twitter")).click();
	        browserObject.navigate().back();
	        
	        browserObject.findElement(By.className("fa-instagram")).click();
	        browserObject.navigate().back();
	        
	        browserObject.findElement(By.className("fa-youtube")).click();
	        browserObject.navigate().back();
	        
	        browserObject.findElement(By.className("fa-linkedin")).click();
	        browserObject.navigate().back();
            browserObject.close();   
	}

}
