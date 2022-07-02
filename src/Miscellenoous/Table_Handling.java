package Miscellenoous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul Kumar\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://omayo.blogspot.com/");

		List<WebElement> tablehead = driver.findElements(By.xpath("//table[@id='table1']//th"));
		
		//Printing the table head
		
		for(int i=0; i<tablehead.size();i++)
		{
			System.out.println(tablehead.get(i).getText());
		}
		
		//size of row 
		System.out.println(tablehead.size());
		
		//printing entire table data 
		
		List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='table1']//td"));
		for(int i=0; i<tabledata.size(); i++)
		{
			System.out.println(tabledata.get(i).getText());
		}
		
		//total number of data in entire row
		System.out.println(tabledata.size());
		
		//table data in first row
		List<WebElement> firstrowdata = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[1]"));
		
		for(int i=0; i<firstrowdata.size(); i++)
		{
			System.out.println(firstrowdata.get(i).getText());
		}
		
		//second column data in third row 
		
		System.out.println(driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[3]/td[2]")).getText());
		
		//Locating all column data of third column
		
		List<WebElement> namecolumndata = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr/td[1]"));
		
		int j=0;
		for(int i=0; i<namecolumndata.size();i++)
		{
			j=i; //it will give position of the Praveen
			if(namecolumndata.get(i).getText().equals("Praveen"))
			{
				break;
			}
		}
		j=j+1; //value of j is increment by 1 because index start form 0
		
		
		String locationxpath="//table[@id='table1']//tbody/tr["+j+"]/td[3]";
		
		System.out.println(driver.findElement(By.xpath(locationxpath)).getText());
		Thread.sleep(2000);

		
		//number of row in table
		List<WebElement> rowsize = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println("Size of column: "+rowsize.size());
		
		//number of column
		List<WebElement> columnsize = driver.findElements(By.xpath("//table[@id='table1']//th"));
		System.out.println("Size of column: "+columnsize.size());
		
		
		driver.quit();

	}

}
