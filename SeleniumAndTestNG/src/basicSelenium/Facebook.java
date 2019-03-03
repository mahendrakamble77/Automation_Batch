package basicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Location of Chrome Driver
		
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\chromedriver.exe");
				
				// Create an object of Chrome Driver ... Chrome driver Class implements interface WebDriver
				
				
				
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://facebook.com");
				
				String PageTitle = driver.getTitle();
				
				System.out.println(PageTitle);
				
				System.out.println(driver.getCurrentUrl());
				
				driver.findElementById("email").sendKeys("softwareengineer_mit@yahoo.com");
				driver.findElementById("pass").sendKeys("thinkmahen");
				driver.findElementById("loginbutton").click();
				
				
				String PageTitle1 = driver.getTitle();
				
				System.out.println(PageTitle1);
				
				System.out.println(driver.getCurrentUrl());
				
				driver.close();
				
				

	}

}
