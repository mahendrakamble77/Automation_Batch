package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ManageIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//Location of Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\chromedriver.exe");
		
		// Create an object of Chrome Driver ... Chrome driver Class implements interface WebDriver
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://paytm.com/");
		driver.manage().window().maximize();
		
		
		String PageTitle = driver.getTitle();
		
		System.out.println(PageTitle);
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElementByXPath("//div[contains(text(), 'Log In')]").click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElementByXPath("//span[contains(text(), 'Login/Signup with mobile number and password')]").click();
		
		
		

	}

}
