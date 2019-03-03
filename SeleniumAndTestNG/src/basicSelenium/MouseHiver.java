package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Location of Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\chromedriver.exe");
		
		// Create an object of Chrome Driver ... Chrome driver Class implements interface WebDriver
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		
		String PageTitle = driver.getTitle();
		
		System.out.println(PageTitle);
		
		System.out.println(driver.getCurrentUrl());
	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement ele  = driver.findElement(By.xpath("//span[text()='Men']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		

	}

}
