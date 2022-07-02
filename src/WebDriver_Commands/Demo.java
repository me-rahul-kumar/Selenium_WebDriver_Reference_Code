package WebDriver_Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//select item by id
		//driver.findElement(By.id("alert1")).click();
		
		//select element by By.className();
		
		//WebElement classname = driver.findElement(By.className("title"));
		//String text = classname.getText();
		//System.out.println(text);
		
		//WebElement input = driver.findElement(By.name("q"));
		//input.sendKeys("submit");
		
		Thread.sleep(2000);
		
		//WebElement search = driver.findElement(By.className("gsc-search-button"));
		//search.click();
		
		//WebElement classname1 = driver.findElement(By.className("classone"));
		//classname1.sendKeys("rahul");
		
		//WebElement compendium = driver.findElement(By.linkText("compendiumdev"));
		//compendium.click();
		
		//WebElement partiallinktext = driver.findElement(By.partialLinkText("compendium"));
		//partiallinktext.click();
		
		//WebElement cssselector = driver.findElement(By.cssSelector("#alert1"));
		//cssselector.click();
		
		/*
		 * WebElement textfield = driver.findElement(By.id("ta1"));
		 * textfield.sendKeys("Adrash is good boy."); Thread.sleep(2000);
		 * textfield.clear(); Thread.sleep(3000);
		 */
		
		/*
		 * WebElement byxpath = driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/textarea[1]s"
		 * )); String text = byxpath.getText(); System.out.println(text);
		 */
	
		String text = driver.findElement(By.id("link2")).getText();
		System.out.println(text);
		driver.quit();		
		
		String tagname = driver.findElement(By.cssSelector("#link2")).getText();
		System.out.println(tagname);
		
		//driver.close(); // close current window only 
		

	}

}
