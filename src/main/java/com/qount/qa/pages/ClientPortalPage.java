package com.qount.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;

public class ClientPortalPage extends SetupProperties {
    WebDriver driver;
    JavascriptExecutor jsDriver;
	NgWebDriver ngWebDriver;
	
	 public ClientPortalPage(WebDriver driver) {
            this.driver = driver;
			jsDriver = (JavascriptExecutor) driver;
			ngWebDriver = new NgWebDriver(jsDriver);
		    }

	public void portallogin() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
    SetupProper();
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("urlweb");
//    Thread.sleep(5000);
    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(prop.getProperty("clientportalemail"));
	driver.findElement(By.id("input__password")).sendKeys(prop.getProperty("clientportalpassword"));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(7000);
	try {
		System.out.println("print the system");
	     try {
		 WebElement skipengage = driver.findElement(By.xpath("(//span[normalize-space()='Skip Billing'])[1]"));
		 boolean domain = skipengage.isDisplayed();
		 if(domain) {
			 skipengage.click();
		 }}
		 catch(NoSuchElementException e) {
			 driver.findElement(By.xpath("(//span[normalize-space()='Skip Engagement'])[1]")).click();
	//		driver.findElement(By.xpath("(//span[normalize-space()='Skip Engagement'])[1]")).click();
		}
	     Thread.sleep(3000);
		 try {
		 WebElement skipbill = driver.findElement(By.xpath("(//span[normalize-space()='Skip Billing'])[1]"));
		 boolean displayinfo = skipbill.isDisplayed();
		 if(displayinfo) {
			 skipbill.click();
		 }	}
		 catch(NoSuchElementException e) {
			 System.out.println("Element not present");
		 }
		 Thread.sleep(4000);
	     try {
		 WebElement skipengage = driver.findElement(By.xpath("(//span[normalize-space()='Skip Engagement'])[1]"));
		 boolean domain = skipengage.isDisplayed();
		 if(domain) {
			 skipengage.click();
		 }}
		 catch(NoSuchElementException e) {
			 driver.findElement(By.xpath("(//span[normalize-space()='Skip Billing'])[1]")).click();
	//		driver.findElement(By.xpath("(//span[normalize-space()='Skip Engagement'])[1]")).click();
		}
	     Thread.sleep(3000);
		 try {
		 WebElement skipbill = driver.findElement(By.xpath("(//span[normalize-space()='Skip Billing'])[1]"));
		 boolean displayinfo = skipbill.isDisplayed();
		 if(displayinfo) {
			 skipbill.click();
		 }	}
		 catch(NoSuchElementException e) {
			 System.out.println("Element not present");
		 }
		 finally {
			 System.out.println("error in print");	 
	}}
	catch (NoSuchElementException e) {
		System.out.println("error exist");
	}	 
	finally {
		System.out.println("error template");
	}		
    }
	}