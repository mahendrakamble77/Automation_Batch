package basicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//Location of Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\chromedriver.exe");
		
		// Create an object of Chrome Driver ... Chrome driver Class implements interface WebDriver
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Mahen/Desktop/Practice.html");
		driver.manage().window().maximize();
		
		
		String PageTitle = driver.getTitle();
		
		System.out.println(PageTitle);
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement w = driver.findElementById("anand");
		
		Select sel = new Select(w);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele = driver.findElementByTagName("button");
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		ele.click();
		
		Alert al = driver.switchTo().alert();
		
		
		
		System.out.println(al.getText());
		
		al.dismiss();
		
		
		
		

	}

}
