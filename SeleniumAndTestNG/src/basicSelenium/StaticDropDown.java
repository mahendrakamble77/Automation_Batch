package basicSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Location of Chrome Driver
		
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\chromedriver.exe");
				
				// Create an object of Chrome Driver ... Chrome driver Class implements interface WebDriver
				
				
				
				ChromeDriver dr = new ChromeDriver();
				dr.get("https://www.cleartrip.com/do/search/flights?");
				
				String PageTitle = dr.getTitle();
				
				System.out.println(PageTitle);
				
				System.out.println(dr.getCurrentUrl());
				
				
				WebElement w = dr.findElementById("adults_selector");
				
				Select s = new Select(w); 	 	
				s.selectByValue("4");
				s.selectByIndex(7);
				
				
				
				
								
				

	}

}
