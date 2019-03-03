package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Location of Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\chromedriver.exe");
		
		// Create an object of Chrome Driver ... Chrome driver Class implements interface WebDriver
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		String PageTitle = driver.getTitle();
		
		System.out.println(PageTitle);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		String TextValue1= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText();
	
		System.out.println(TextValue1);
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@value='oneway']")).isSelected());
		
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		sel.selectByValue("2");
		
	
		
		
		
		
		// Relative xpath: //*[@class='featured-box']//*[text()='Testing']
		
		// Relative XPAth = //tagName(@AttributeNAme = 'Value')
		
		//input[@name='userName']
		//driver.launchApp("https://www.seleniumhq.org/download/");
		
		//System.out.println(driver.getPageSource());
/*		
		
		driver.get("https://www.yahoo.com");
		
		System.out.println(PageTitle);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println(PageTitle);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(PageTitle);
		
		System.out.println(driver.getCurrentUrl());
		
	*/
		
		
	//	driver.close();
		

	}

}
