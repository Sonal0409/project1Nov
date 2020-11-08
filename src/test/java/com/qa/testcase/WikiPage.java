package com.qa.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WikiPage {
	
	@Test   // it is used to execute our testcases
	public void createAccount() throws InterruptedException
	{
		
		// we will write our test steps
		
		// declaring an object called as driver
		// here we are staring selenium webdriver and giving instruction to start chrome broswer
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (15)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// call method in java ==> objectname.methodname
		// opening URL on the chromebrowser
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		
		// maxamise the browser window
		
		driver.manage().window().maximize();
		
		// tool to wait for sometime so that my application elemets are loaded completly
		
		// Implicit wait
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		// Pageload wait
		
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		
		// write the test steps to perfrom a task on webelements on thr webpage
		
		// Locators: the address of webelements on the webpage
		//we will use locators to identofy elements and perform action on them
		// id =wpName2   // id locator
		
		// XPATH: //*[@id="wpName2"]  
		// Syntax for writing xpath: //tagname[@attribute="value"]
		
		// use locator and perform action(click, enterdata, ) on the element
		
		// find an element whose id is wpName2 and perform the action of enetering data
		driver.findElement(By.id("wpName2")).sendKeys("Sonal");
		
		Thread.sleep(2000);
		// find an element password whose xpath and perform the action of enetering data
		
		driver.findElement(By.xpath("//input[@name='wpPassword']")).sendKeys("mittal");
		
         Thread.sleep(2000);
         
         // for link use linkText locator
         
         driver.findElement(By.linkText("Main page")).click();
         
        driver.close(); 
         
         
         
         
         
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
	}
	
	

}
