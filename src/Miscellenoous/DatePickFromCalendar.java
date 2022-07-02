package Miscellenoous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickFromCalendar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(10000);
		
		
		WebElement traveldate = driver.findElement(By.id("travel_date"));
		traveldate.click();
		
		
		WebElement monthtopick = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		//System.out.println(monthtopick.getText().contains("May"));
		//going to pick December month date so check first calendar of December is displaying or not
		
		while(!monthtopick.getText().contains("December"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();	
		}
		
		List<WebElement> days = driver.findElements(By.xpath("//td[@class='day']"));
		
		for(int i=0;i<days.size()-1;i++)
		{
			if(days.get(i).getText().equals("15"))
			{
				days.get(i).click();
				break;
			}
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
