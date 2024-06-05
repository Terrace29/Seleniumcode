package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		//3. Open website link https://www.itlearn360.com/.
	     	 browserObject.get("https://www.itlearn360.com/");
	     	 
	     	 int count = 0;
	     	 
	     	 List<WebElement> allLinks = browserObject.findElements(By.tagName("a"));
	     	 
	     	 for(WebElement link:allLinks)
	     	 {
	     		 System.out.println(link.getAttribute("href"));
	     		 count++;
	     	 }
		
	     	 System.out.println("Print no of links:" +count);
	}

}
