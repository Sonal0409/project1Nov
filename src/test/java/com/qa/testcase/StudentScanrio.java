package com.qa.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StudentScanrio {

	
	public static WebDriver driver;
	
	
	
	@BeforeClass
	public static void setup() throws InterruptedException
	{
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (15)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize the browser window
		
		driver.manage().deleteAllCookies();  // delete cookies on the browser
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(7000);
		
	}
	
	@Test
	public void mouseovermethod() throws InterruptedException
	{
		
		WebElement e = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(e).build().perform();
        
        Thread.sleep(5000);
        
      WebElement mi=  driver.findElement(By.linkText("Mi"));
      
      WebDriverWait w= new WebDriverWait(driver,5);
      w.until(ExpectedConditions.visibilityOf(mi)).click();
      
      
	}
	
}
