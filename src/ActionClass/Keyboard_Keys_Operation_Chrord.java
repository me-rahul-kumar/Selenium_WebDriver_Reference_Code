package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Keys_Operation_Chrord {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://omayo.blogspot.com/");

		Actions action=new Actions(driver);
		
		WebElement textbox = driver.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden.')]"));
		
		action.moveToElement(textbox).click().build().perform();
		
		//chord method to press two or more than two keys together
		
		textbox.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
