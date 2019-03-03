package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Location of Chrome Driver
		
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\chromedriver.exe");
				
				// Create an object of Chrome Driver ... Chrome driver Class implements interface WebDriver
				
				
				
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://login.salesforce.com/");
				
				String PageTitle = driver.getTitle();
				
				System.out.println(PageTitle);
				
				System.out.println(driver.getCurrentUrl());
				
			/*	driver.findElementByXPath("//input[@class = 'inputtext']").sendKeys("softwareengineer_mit@yahoo.com");
				driver.findElementByXPath("//input[@type = 'password']").sendKeys("thinkmahen");
				
				driver.findElementByXPath("//input[@value='Log In']").click();
				
			*/
				
				
				driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("softwareengineer_mit@yahoo.com");
				driver.findElement(By.xpath("//input[@name = 'pw']")).sendKeys("thinkmahen");
				
				driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
				
				
				
				// Code with different fucntions
				/*
				driver.findElementById("email").sendKeys("softwareengineer_mit@yahoo.com");
				driver.findElementById("pass").sendKeys("thinkmahen");
				driver.findElementById("loginbutton").click();
				
				
				String PageTitle1 = driver.getTitle();
				
				System.out.println(PageTitle1);
				
				System.out.println(driver.getCurrentUrl());
				
				driver.close();
	*/
				
				
				

	}

}
