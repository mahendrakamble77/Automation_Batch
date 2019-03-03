package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Location of Chrome Driver
		
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\chromedriver.exe");
				
				// Create an object of Chrome Driver ... Chrome driver Class implements interface WebDriver
				
				
				
				ChromeDriver dr = new ChromeDriver();
				dr.get("https://spicejet.com");
				
				String PageTitle = dr.getTitle();
				
				System.out.println(PageTitle);
				
				System.out.println(dr.getCurrentUrl());
				
				dr.findElementById("divpaxinfo").click();
				int i = 1;
				
				while(i<=5)
				{
					Thread.sleep(2000);

					
				dr.findElementById("hrefIncAdt").click();
				i++;
				}
				
				dr.findElement(By.id("btnclosepaxoption")).click();
				
				
				
				
			//  //a[@value='MAA']  - Xpath for chennai

			//  //a[@value='BLR']

			dr.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

			dr.findElement(By.xpath("//a[@value='BLR']")).click();

			Thread.sleep(2000);

			//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

			dr.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			Thread.sleep(4000);
			dr.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
				
				
								
				

	}

}
