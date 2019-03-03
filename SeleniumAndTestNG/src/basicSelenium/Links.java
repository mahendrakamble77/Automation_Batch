package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Links {

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
		
		driver.findElement(By.partialLinkText("REG")).click();
		

	}

}
