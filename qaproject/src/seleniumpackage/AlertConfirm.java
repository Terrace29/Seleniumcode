package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
         System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
		ChromeDriver browserObject = new ChromeDriver();
		
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        
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
