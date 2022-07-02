package Miscellenoous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//handling Alerts
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Selecting option from dropdown field 
		
		WebElement dropdownfield = driver.findElement(By.id("drop1"));
		
		
		Select select=new Select(dropdownfield);
		
		select.selectByIndex(1);
		
		Thread.sleep(3000);
		select.selectByIndex(2);
		
		System.out.println("selection operation done sucessfully");
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
