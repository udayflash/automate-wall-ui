package organizerspackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;
//import org.testng.annotations.Test;

public class OrganizerDashboard extends SetupProperties {
    WebDriver driver;
    JavascriptExecutor jsDriver;
	NgWebDriver ngWebDriver;
	
    private By userEmail = By.cssSelector("input[placeholder='Username']");
 	private By userPwd = By.id("input__password");
 	private By loginButton = By.xpath("//button[@type='submit']");
 	private By errorMessage = By.xpath("//div[@class='error mb-20']");
 	private By userProfile = By.cssSelector("mat-mdc-menu-trigger logout-profile-badge");
 	private By logout = By.xpath("//i[@class='icon ion-log-out power-symbol pe-3']");
 	
	public OrganizerDashboard(WebDriver driver) {
            this.driver = driver;
			jsDriver = (JavascriptExecutor) driver;
			ngWebDriver = new NgWebDriver(jsDriver);
		    }
/*	 public void loginqountweb() throws InterruptedException, IOException {
         SetupProper();
	    driver.findElement(userEmail).sendKeys(prop.getProperty("validemail"));   
		driver.findElement(userPwd).sendKeys(prop.getProperty("validpassword"));
	 	driver.findElement(loginButton).click();
			 //   	loginPage.login();
	 	Thread.sleep(7000);
 }   */
 //   @Test
	public void dashorg() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
//		driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(18) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[normalize-space()='Hamburg new300']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[normalize-space()='In Progress']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='download'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Download Organizer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='cdk-overlay-backdrop blue-berry-theme cdk-overlay-backdrop-showing']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@mattooltip='Secure Link'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='open'])[2]")).click();
    }
}



	
