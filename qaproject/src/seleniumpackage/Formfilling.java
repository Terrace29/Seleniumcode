package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formfilling {

	public static void main(String[] args) throws InterruptedException {
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
	        
	        //RADIO BUTTON
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        browserObject.findElement(By.xpath("//input[@value='male']")).click();
	        //browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
	        
	        // Check boxes
	        
	        browserObject.findElement(By.name("bike")).click();
	       // browserObject.findElement(By.name("car")).click();
	        browserObject.findElement(By.name("boat")).click();
	        browserObject.findElement(By.name("horse")).click();
	        
	        
	        //Drop down
	        
	        Select country = new Select(browserObject.findElement(By.name("country")));
            //country.selectByVisibleText("Ethiopia");
            country.selectByVisibleText("USA");
            
            Select skill = new Select(browserObject.findElement(By.name("skill")));
            skill.selectByVisibleText("Programming");
            skill.selectByVisibleText("Database");
            
	        browserObject.findElement(By.name("submit")).click();
	        
	        
	      //Example : Alert
	        browserObject.findElement(By.id("alert")).click();
	        
	     // 5. Initialize Alert object using switchTo and alert method
	        Alert alert = browserObject.switchTo().alert();
	       
	       System.out.println(alert.getText());
	        
	        Thread.sleep(6000);
	        alert.accept();
	        
	        
	        //Example: Confirm
	        
	        browserObject.findElement(By.id("confirm")).click();
	        
	        Alert alert1 = browserObject.switchTo().alert();
	        System.out.println(alert.getText());
	        Thread.sleep(4000);
	       // alert.accept();
	        alert.dismiss();
	        
	        //Example:Prompt me
	        
	        browserObject.findElement(By.id("prompt")).click();
	        Alert alert2 = browserObject.switchTo().alert();
	        System.out.println(alert2.getText());
	        Thread.sleep(3000);
	        alert2.sendKeys(" Lavanya ");
	        alert2.accept();
	        
	        
	      
	}

}
