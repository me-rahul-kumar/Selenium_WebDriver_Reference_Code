package WaitMechanism;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.FlickAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_WebDriverWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
	
		driver.findElement(By.className("dropbtn")).click();
		
		//Explicitly wait for a particular/individual element 
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//Deprecated in Selenium 4 in place of time we have to declare Duration.timemeasurement unit
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement flipkartelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
		flipkartelement.click();

		//wait.until(ExpectedConditions.elementToBeClickable((By.linkText("Flipkart")))).click();

		
		
		driver.quit();
		
	}

}
