package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Keys_Operation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://omayo.blogspot.com/");

		WebElement compendium = driver.findElement(By.linkText("compendiumdev"));
		
		Actions action=new Actions(driver);
		
		
		action.moveToElement(compendium).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

		Thread.sleep(3000);
		driver.quit();
	}

}
