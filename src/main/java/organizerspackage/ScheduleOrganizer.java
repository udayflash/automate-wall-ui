package organizerspackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;
//import org.testng.annotations.Test;

public class ScheduleOrganizer extends SetupProperties {
    WebDriver driver;
    JavascriptExecutor jsDriver;
	NgWebDriver ngWebDriver;
	
    private By userEmail = By.cssSelector("input[placeholder='Username']");
 	private By userPwd = By.id("input__password");
 	private By loginButton = By.xpath("//button[@type='submit']");
 	private By errorMessage = By.xpath("//div[@class='error mb-20']");
 	private By userProfile = By.cssSelector("mat-mdc-menu-trigger logout-profile-badge");
 	private By logout = By.xpath("//i[@class='icon ion-log-out power-symbol pe-3']");
 	
	public ScheduleOrganizer(WebDriver driver) {
            this.driver = driver;
			jsDriver = (JavascriptExecutor) driver;
			ngWebDriver = new NgWebDriver(jsDriver);
		    }
/*	 public void loginqountweb() throws InterruptedException, IOException {
         SetupProper();
	    driver.findElement(userEmail).sendKeys(prop.getProperty("validemail"));   
		driver.findElement(userPwd).sendKeys(prop.getProperty("validpassword"));
	 	driver.findElement(loginButton).click();
	 	Thread.sleep(7000);
 }       */
//    @Test
	public void sendattime() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		SetupProper();
	driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[normalize-space()='Send']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space()='Send to Client']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys("Croatia");
	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys(Keys.ENTER);	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys("Mighty enterprises pvt");
	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='delete'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-1-button'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-1-button'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-2-button'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-2-button'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//label[normalize-space()='Enable MFA'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//label[normalize-space()='Enable MFA'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//mat-label[normalize-space()='Subject']")).sendKeys("Sub email organizer automate");
  //  Thread.sleep(2000);
 //   driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ARROW_UP);
 //   Thread.sleep(2000);
  //  driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ARROW_UP);
 //   driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ENTER);
 //   Thread.sleep(2000);
    driver.findElement(By.xpath("//mat-icon[normalize-space()='assignment']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[normalize-space()='8th August']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[normalize-space()='Select']")).click();
    Thread.sleep(5000);
 /*   driver.findElement(By.xpath("(//span[normalize-space()='Send'])[2]")).click(); 
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[normalize-space()='Save as Draft']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[normalize-space()='Send']")).click();    */
 //   Thread.sleep(2000);
    driver.findElement(By.xpath("(//span[normalize-space()='Schedule'])[1]")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//input[@id='mat-input-6'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//li[normalize-space()='12:03 AM'])[1]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[contains(text(),'Schedule')]")).click();
	}
}
