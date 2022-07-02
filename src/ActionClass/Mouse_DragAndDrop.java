package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions action=new Actions(driver);
		
		WebElement romebox = driver.findElement(By.id("box6"));
		WebElement italybox = driver.findElement(By.id("box106"));
		action.dragAndDrop(romebox, italybox).perform();
		
		Thread.sleep(2000);
		WebElement mainfram = driver.findElement(By.id("capitals"));
		action.dragAndDrop(italybox, mainfram).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
