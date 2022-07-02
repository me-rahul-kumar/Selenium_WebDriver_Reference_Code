package WebDriver_Commands;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://omayo.blogspot.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.findElement(By.linkText("compendiumdev")).click();
		//System.out.println(driver.getCurrentUrl());
		
		
		
		WebElement xpathelement = driver.findElement(By.xpath("//p[@id='pah']"));
		String attribut = xpathelement.getAttribute("id");
		System.out.println(attribut);
		
		WebElement button = driver.findElement(By.id("myBtn"));
				
		System.out.println("is buttom display: "+button.isDisplayed());
		System.out.println("is button enable: "+button.isEnabled());
		
		
		WebElement isselected = driver.findElement(By.xpath("//input[@name=\"vehicle\"][2]"));
		System.out.println("is input selected: "+isselected.isSelected());
		
		WebElement disablebutton = driver.findElement(By.xpath("//button[@id=\"but1\"]"));
		System.out.println("is botton unable: "+disablebutton.isEnabled());
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		
		
		WebElement cnf = driver.findElement(By.id("confirm"));
		System.out.println(cnf.getTagName());
		System.out.println(cnf.getCssValue("align-items"));
		
		 Dimension dim = cnf.getSize();// getSize returns Dimension class object
		 System.out.println(dim.height);
		 
		 List<WebElement> elements = driver.findElements(By.tagName("a"));//more than one elements so contain in List
		 System.out.println(elements.size());
		 
		 Iterator<WebElement> iterator = elements.iterator();
		 while(iterator.hasNext())
		 {
			 System.out.println(iterator.next());
		 }
		
		 
		driver.quit();

	}

}
