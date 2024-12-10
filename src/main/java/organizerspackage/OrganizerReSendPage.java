package organizerspackage;

	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
	import com.paulhammant.ngwebdriver.NgWebDriver;
	import com.qount.qa.proppackage.SetupProperties;
	import proposalspackage.ProposalStatusPage;

	public class OrganizerReSendPage  extends SetupProperties {
	    WebDriver driver; 
		JavascriptExecutor jsDriver;
		NgWebDriver ngWebDriver;

		    private By userEmail = By.cssSelector("input[placeholder='Username']");
		 	private By userPwd = By.id("input__password");
		 	private By loginButton = By.xpath("//button[@type='submit']");
//		 	private By errorMessage = By.xpath("//div[@class='error mb-20']");
		 	private By userProfile = By.xpath("(//div[@class='mat-mdc-menu-trigger logout-profile-badge'])[1]");
		 	private By logout = By.xpath("(//span[contains(text(),'Sign Out')])[1]");
		 	private By organizers = By.xpath("//span[text()='# Organizers']");
	 	
		 public OrganizerReSendPage(WebDriver driver) {
	            this.driver = driver;
				jsDriver = (JavascriptExecutor) driver;
				ngWebDriver = new NgWebDriver(jsDriver);		
		 }
		 public void organizerspage() throws InterruptedException {
			driver.findElement(organizers) .click();
			Thread.sleep(5000);
		 }
		 public void resendorganizer() throws InterruptedException, IOException{
			Actions actoned = new Actions(driver);
			WebElement orgrown = driver.findElement(By.xpath("(//td[normalize-space()='Org 76 Automate'])[1]"));
			actoned.moveToElement(orgrown).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[normalize-space()='Org 76 Automate'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[normalize-space()='Sent']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[4]")).click();
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("//div[normalize-space()='Resend']")).click();
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]")).click();
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("//span[contains(text(),'Resend')]")).click();
  			Thread.sleep(2000);
		 }
  			public String verifyResendMessage() {
  				return driver.findElement(By.xpath("//div[normalize-space()='Form Resent Successfully']")).getText();
		 }  	        
	}