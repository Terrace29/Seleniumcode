package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adminpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	        
	        //browserObject.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	        WebElement email = browserObject.findElement(By.id("Email"));
	        email.clear();
	        email.sendKeys("admin@yourstore.com");
	        
	        WebElement pwd = browserObject.findElement(By.name("Password"));
	        pwd.clear();
	        pwd.sendKeys("admin");
	        WebElement button = browserObject.findElement(By.className("button-1"));
	        button.click();
	        
	}

}
