package Miscellenoous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_Light_Box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://omayo.blogspot.com/p/lightbox.html");
		
		//handling light-box
		//no need to switch to the light box we can directly trigger the light box elements
		
		WebElement lightboximage = driver.findElement(By.xpath("//img[@class='hover-shadow cursor']"));
		lightboximage.click();
		
		Thread.sleep(2000);
		WebElement closelighbox = driver.findElement(By.xpath("//span[@class='close cursor']"));
		closelighbox.click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
	}

}
