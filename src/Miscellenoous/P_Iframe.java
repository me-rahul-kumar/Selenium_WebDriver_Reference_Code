package Miscellenoous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//WebElement searchbox = driver.findElement(By.id("b-query"));
		//searchbox.sendKeys("rahul");
		//it will throw an NSElementException because it is inside the iframe
		//so to perform any action on the elements which are inside the iframe we will
		//have to switch the control to the iframe
		
		WebElement iframe = driver.findElement(By.id("navbar-iframe"));
		driver.switchTo().frame(iframe);
		
		
		WebElement searchbox = driver.findElement(By.id("b-query"));
		searchbox.sendKeys("rahul");
		
		driver.switchTo().defaultContent();
		
		WebElement compendiumdev = driver.findElement(By.linkText("compendiumdev"));
		compendiumdev.click();
		
		//it will throw an NSElementException because control is still inside the iframe
		//so we have to switch control to the main window or default content
		
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
