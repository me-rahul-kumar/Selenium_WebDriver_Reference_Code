package WebDriver_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Tab {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		//Open in new Window
		WebDriver newwindow=driver.switchTo().newWindow(WindowType.WINDOW);
		newwindow.get("https://omayo.blogspot.com/");
		
		
		//Open in New Tab
		WebDriver newtab=driver.switchTo().newWindow(WindowType.TAB);
		newtab.get("https://omayo.blogspot.com/");
	}

}
