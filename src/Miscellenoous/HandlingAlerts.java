package Miscellenoous;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.id("alert1")).click();

		System.out.println("Clicked on the alert button");

		 
		//Switching control to Alert
		   
		   Alert alert = driver.switchTo().alert(); // Alert is an Interface
		   
		   String alerttext = alert.getText(); 
		   System.out.println(alerttext);
		   
		   alert.accept();
		   
		   //alert.dismiss();
		  
		Thread.sleep(3000);

		driver.quit();

	}

}
