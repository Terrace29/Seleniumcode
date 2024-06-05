package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fillform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://www.training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.name("name")).sendKeys("Lavanya");
	        browserObject.findElement(By.id("eml")).sendKeys("bavanireddi@gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("https://www.training.qaonlinetraining.com/testPage.php");
	        browserObject.findElement(By.name("comment")).sendKeys("Hello Itlearning");
	        
	        ///RadioButton
	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        browserObject.findElement(By.xpath("//input[@value='male']")).click();
	        
	       // browserObject.findElement(By.name("bike")).click();
//	        browserObject.findElement(By.name("car")).click();
	       // browserObject.findElement(By.name("boat")).click();
	      //  browserObject.findElement(By.name("horse")).click();
	        
	        //Dropdown 
	        
	       Select country= new Select(browserObject.findElement(By.name("country")));
	      // country.selectByVisibleText("Ethiopia");
	       
	       //Select skill= new Select(browserObject.findElement(By.name("skill")));
	       //skill.selectByVisibleText("Programming");
	      // skill.selectByVisibleText("Database");
	        
	      //  browserObject.findElement(By.name("submit")).click();
	        
	        
	}

}
