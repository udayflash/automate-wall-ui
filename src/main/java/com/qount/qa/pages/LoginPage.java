package com.qount.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;

public class LoginPage extends SetupProperties {

	WebDriver driver;
	NgWebDriver ngWebDriver;
	JavascriptExecutor jsDriver;
//	protected FluentWait<WebDriver> wait;
	
	private By userEmail = By.cssSelector("input[placeholder='Username']");
	private By userPwd = By.id("input__password");
	private By loginButton = By.xpath("//button[@type='submit']");
	private By errorMessage = By.xpath("//div[@class='error mb-20']");
	private By userProfile = By.cssSelector("mat-mdc-menu-trigger logout-profile-badge");
	private By logout = By.xpath("//i[@class='icon ion-log-out power-symbol pe-3']");

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
//		this.wait = wait;
		jsDriver = (JavascriptExecutor) driver;
		ngWebDriver = new NgWebDriver(jsDriver);
	}

	public void login() throws InterruptedException, IOException {
/*		driver.findElement(userEmail).clear();
		driver.findElement(userEmail).sendKeys(userName);
		driver.findElement(userPwd).clear();
		driver.findElement(userPwd).sendKeys(password);
		driver.findElement(loginButton).click();   */
		SetupProper();
		driver.findElement(userEmail).sendKeys(prop.getProperty("validemail"));
		driver.findElement(userPwd).sendKeys(prop.getProperty("validpassword"));
	 	driver.findElement(loginButton).click();
		Thread.sleep(8000);
	}
	
	
	public void logout() {
		driver.findElement(userProfile).click();
		driver.findElement(logout).click();
	}
	
	public void loginWithValidCredentials() throws InterruptedException, IOException {
		
		login();
//		ngWebDriver.waitForAngularRequestsToFinish();
//		javaScriptClick(By.xpath("//div[@role='tab' and @aria-controls='mat-tab-content-0-4']"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public String verifyErrorMessage() {
		return driver.findElement(errorMessage).getText();
	}
	
	
	public Boolean verifyHomePage() {
		return driver.getTitle().equals("Wallq");
	}

	public void javaScriptClick(By by) {
		WebElement element = driver.findElement(by);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
}
