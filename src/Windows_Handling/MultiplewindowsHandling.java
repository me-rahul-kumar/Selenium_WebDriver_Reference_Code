package Windows_Handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplewindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();//first child
		driver.findElement(By.xpath("//a[text()='Blogger']")).click(); //second child
		
		String mainwindow = driver.getWindowHandle();
		System.out.println("Main window id: "+ mainwindow);
		
		Set<String> allwinowides = driver.getWindowHandles();
		System.out.println("All windows id");
		System.out.println(allwinowides);
		
		Iterator<String> iterator = allwinowides.iterator();
		String childwindow=null;
		
		while(iterator.hasNext())
		{
			childwindow=iterator.next();
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				
				if(driver.getTitle().contains("Basic"))
				{
					System.out.println("We are first window and going to get text of first para");
					System.out.println(driver.findElement(By.cssSelector("p#para1")).getText());
				}
				else if(driver.getTitle().contains("Blogger.com "))
				{
					System.out.println("We are second window and going to click on sign in");
					driver.findElement(By.xpath("//a[@href='/go/signin']")).click();
				}
			}
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
