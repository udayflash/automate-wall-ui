package login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;

public class LoginWebPage extends SetupProperties {

		WebDriver driver;
		NgWebDriver ngWebDriver;
		JavascriptExecutor jsDriver;
 //       FluentWait<WebDriver> wait;
		
		private By userEmail = By.cssSelector("input[placeholder='Username']");
		private By userPwd = By.id("input__password");
		private By loginButton = By.xpath("//button[@type='submit']");
		private By errorMessage = By.xpath("//div[@class='error mb-20']");
		private By userProfile = By.xpath("(//div[@class='mat-mdc-menu-trigger logout-profile-badge'])[1]");
		private By logout = By.xpath("(//span[contains(text(),'Sign Out')])[1]");
		private By homeButton = By.xpath("(//mat-icon[normalize-space()='home'])[1]");

		public LoginWebPage(WebDriver driver) {
			this.driver = driver;
			jsDriver = (JavascriptExecutor) driver;
			ngWebDriver = new NgWebDriver(jsDriver);
		}
		public void loginqountweb() throws InterruptedException, IOException {
			    SetupProper();
//				driver.findElement(userEmail).sendKeys(prop.getProperty("validEmail"));
//				driver.findElement(userEmail).clear();
//				driver.findElement(userEmail).sendKeys(prop.getProperty("validEmail"));
//				driver.findElement(userPwd).sendKeys(prop.getProperty("validPassword"));
//				driver.findElement(userPwd).clear();
//				driver.findElement(userPwd).sendKeys(prop.getProperty("validPassword"));
//			 	driver.findElement(loginButton).click();
//			 	Thread.sleep(12000);
		//	driver.get("https://test.qount.io");
		//	driver.manage().window().maximize();
		//	Thread.sleep(3000);
			driver.findElement(userEmail).sendKeys(prop.getProperty("validEmail"));
			driver.findElement(userPwd).sendKeys(prop.getProperty("validPassword"));
			driver.findElement(loginButton).click();
			Thread.sleep(14000);
			}	
		public void wallhome() throws InterruptedException, IOException {
			driver.findElement(homeButton).click();
			Thread.sleep(9000);
		}
		public void windowmain() throws InterruptedException {
			String realwindow = driver.getWindowHandle();
			driver.switchTo().window(realwindow);
            Thread.sleep(4000);
			}
		public void logoutqountweb() throws InterruptedException, IOException {
			driver.findElement(userProfile).click();
			Thread.sleep(2000);
			driver.findElement(logout).click();
			Thread.sleep(6000);
			driver.close();
		}   		
		public void loginInvalidCredentials() throws InterruptedException, IOException {	
			    SetupProper();
				driver.findElement(userEmail).sendKeys(prop.getProperty("invalidemail"));   				
				driver.findElement(userEmail).clear();
				driver.findElement(userEmail).sendKeys(prop.getProperty("invalidemail"));
				driver.findElement(userPwd).sendKeys(prop.getProperty("invalidpassword"));
				driver.findElement(userPwd).clear();
				driver.findElement(userPwd).sendKeys(prop.getProperty("invalidpassword"));				
			 	driver.findElement(loginButton).click();
			 	Thread.sleep(10000);	
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