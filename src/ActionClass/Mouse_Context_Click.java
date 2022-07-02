package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Context_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://omayo.blogspot.com/");

		Actions action = new Actions(driver);

		//WebElement textarea = driver.findElement(By.cssSelector("textarea#ta1"));
		//action.contextClick(textarea).perform();
		
		Thread.sleep(2000);
		//Selecting the right click option
		WebElement compendium = driver.findElement(By.xpath("//a[@href='http://compendiumdev.co.uk/selenium/basic_web_page.html']"));
		action.contextClick(compendium).sendKeys(Keys.DOWN).sendKeys(Keys.RETURN).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
