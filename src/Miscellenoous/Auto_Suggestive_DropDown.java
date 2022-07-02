package Miscellenoous;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto_Suggestive_DropDown {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/");

		// CLICKING ON FLIGHT MENU
		driver.findElement(By.xpath("//ul[@class='makeFlex font12']//li[@class='menu_Flights']")).click();
		Thread.sleep(3000);

		WebElement from = driver.findElement(By.xpath("//*[@id='fromCity']"));
		from.click();

		WebElement inputform = driver.findElement(By.xpath("//input[@placeholder='From']"));

		inputform.click();
		inputform.sendKeys("del");

		for (int i = 0; i < 3; i++) {
			Thread.sleep(500);
			inputform.sendKeys(Keys.DOWN);
		}
		inputform.sendKeys(Keys.ENTER);

		WebElement tofield = driver.findElement(By.cssSelector("input[placeholder='To']"));

		tofield.click();
		Thread.sleep(2000);

		tofield.sendKeys("patna");
		Thread.sleep(2000);

		tofield.sendKeys(Keys.DOWN);
		Thread.sleep(1000);

		tofield.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	
		// selecting date from calendar

		driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10'][text()='DEPARTURE']")).click();
		Thread.sleep(3000);

		Actions a = new Actions(driver);

		WebElement datetoselect = driver
				.findElement(By.xpath("//div[@class='DayPicker-Day'][@aria-label='Mon May 23 2022']"));
		a.moveToElement(datetoselect).click().build().perform();

		Thread.sleep(5000);
		driver.quit();

	}

}
