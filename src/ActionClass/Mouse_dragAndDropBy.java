package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_dragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		Actions action=new Actions(driver);
		
		//dragAndDropBy() 
		//drag and drop element in x and y axis using dargAndDropBy() method
		driver.get("http://omayo.blogspot.com/p/page3.html");
		WebElement minlable = driver.findElement(By.cssSelector("a[aria-labelledby='price-min-label']"));
		//action.dragAndDropBy(minlable, 200, 0).perform();
		action.dragAndDropBy(minlable, -100, 0).perform();
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
