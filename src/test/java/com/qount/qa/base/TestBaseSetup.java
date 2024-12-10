package com.qount.qa.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;
import com.qount.qa.utils.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseSetup extends SetupProperties implements ITestListener {

	protected WebDriver driver;
	protected FluentWait<WebDriver> wait;
	protected NgWebDriver ngWebDriver;
	protected JavascriptExecutor jsDriver;
	
	private WebDriver returnDriver(String webbrowser) throws IOException {
		
		if (webbrowser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}	 
		else if (webbrowser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
		else if (webbrowser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();     
		} 
		else {
//			driver = new ChromeDriver();    
		}		    
		jsDriver = (JavascriptExecutor) driver;
		ngWebDriver = new NgWebDriver(jsDriver);
        SetupProper();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_LOAD_TIME));
		driver.manage().window().maximize();
		wait = new FluentWait<WebDriver>(driver);
		wait.ignoring(NoSuchElementException.class);
//	    wait.pollingEvery(Duration.ofMillis(250));
		wait.withTimeout(Duration.ofSeconds(10));  
		driver.get(prop.getProperty("url"));		
		ngWebDriver.waitForAngularRequestsToFinish();
		return driver;
	}	    
	@BeforeClass
	public void initializeTestBaseSetup(ITestContext context) throws IOException, InterruptedException {	
	driver = returnDriver("chrome");
    context.setAttribute("webdriver", driver);    
	}
	@AfterClass
	public void closeDriver() throws IOException, InterruptedException{
	driver.quit();
}}