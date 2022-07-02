package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Event_Hover_and_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://omayo.blogspot.com/");
		
		//Mouse hover operation using moveToElement() method of Actions class
			
		Actions action=new Actions(driver);
		WebElement home = driver.findElement(By.xpath("//span[@id='home']"));
		action.moveToElement(home).perform();
		
		//click on element using mouse
		
		Thread.sleep(2000);
		action.moveToElement(home).click().build().perform();
		Thread.sleep(2000);
		
		
		
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
