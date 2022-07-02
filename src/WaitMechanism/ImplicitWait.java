package WaitMechanism;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		//implicit wait: It said to be global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//wait for 0 second
		driver.findElement(By.className("dropbtn")).click();
		
		//this element will be visible after 3 seconds so it waits for 3 seconds as 
		//fall into global wait
		
		driver.findElement(By.linkText("Flipkart")).click();
		
		
		
		driver.quit();
		
	}

}












