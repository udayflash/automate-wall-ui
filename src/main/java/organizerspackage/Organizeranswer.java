package organizerspackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;
import org.openqa.selenium.support.ui.FluentWait;

public class Organizeranswer extends SetupProperties {
    WebDriver driver;
    JavascriptExecutor jsDriver;
    NgWebDriver ngWebDriver;
 //   FluentWait<WebDriver> wait;
	
/*    private By userEmail = By.cssSelector("input[placeholder='Username']");
 	private By userPwd = By.id("input__password");
 	private By loginButton = By.xpath("//button[@type='submit']");
// 	private By errorMessage = By.xpath("//div[@class='error mb-20']");
 	private By userProfile = By.xpath("(//div[@class='mat-mdc-menu-trigger logout-profile-badge'])[1]");
 	private By logout = By.xpath("(//span[contains(text(),'Sign Out')])[1]");    */
 	
	public Organizeranswer(WebDriver driver) {
            this.driver = driver;
			jsDriver = (JavascriptExecutor) driver;
			ngWebDriver = new NgWebDriver(jsDriver);
		    }
/*	 public void loginqountweb() throws InterruptedException, IOException {
         SetupProper();
	    driver.findElement(userEmail).sendKeys(prop.getProperty("validemail"));   
		driver.findElement(userPwd).sendKeys(prop.getProperty("validpassword"));
	 	driver.findElement(loginButton).click();
	 	Thread.sleep(7000);    */
// }
 //   @Test
	public void answerpage() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
//	driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(18) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
	Thread.sleep(5000);
	Actions actoned = new Actions(driver);
	    WebElement orgrown = driver.findElement(By.xpath("(//td[normalize-space()='Hamburg new300'])[1]"));
	    actoned.moveToElement(orgrown).perform();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//td[normalize-space()='Hamburg new300'])[1]")).click();
	    Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[normalize-space()='In Progress']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[normalize-space()='Udays bajjs']")).click();
	 Thread.sleep(3000);
    WebElement npsquestion = driver.findElement(By.xpath("(//div[normalize-space()='4.'])[1]"));
    actoned.moveToElement(npsquestion).perform();
    Thread.sleep(6000);
    driver.findElement(By.xpath("(//i[@class='icon ion-ios-star star selected ng-star-inserted'])[4]")).click();  //star rating
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//i[@class='icon ion-ios-star star selected ng-star-inserted'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//label[contains(text(),'Contra')]")).click();   //checkbox
    Thread.sleep(4000);
    driver.findElement(By.xpath("//label[contains(text(),'Contra')]")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//label[contains(text(),'Tetris')]")).click();
    Thread.sleep(4000);
    WebElement checkboxquestion = driver.findElement(By.xpath("(//div[normalize-space()='5.'])[1]"));
    actoned.moveToElement(checkboxquestion).perform();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='5'])[1]")).click();  
    Thread.sleep(2000);  //nps question
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='4'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='3'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='2'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='1'])[1]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//div[@role='tab'][@aria-posinset='2'])")).click();  //section tab
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[1]")).click();
    Thread.sleep(3000);//prev section
    driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[3]")).click();
    Thread.sleep(3000);//next section
    driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[2]")).click();
    Thread.sleep(3000);//next section
    driver.findElement(By.xpath("//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base ng-star-inserted']")).click();
    Thread.sleep(3000); //prev section review
    driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[2]")).click();
    Thread.sleep(3000);//next section
/*    WebElement comment = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='chat_bubble_outline'])[9]"));
    actoned.moveToElement(comment).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='chat_bubble_outline'])[8]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//label[contains(@id,'mat-mdc-form-field-label-')]")).click();
    Thread.sleep(2000);
    Actions actionsc = new Actions(driver);
	actionsc.sendKeys("Automate comment").build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Cancel']")).click();        */
//	Thread.sleep(2000);
	WebElement radioquestion = driver.findElement(By.xpath("(//div[normalize-space()='11.'])[1]"));
    actoned.moveToElement(radioquestion).perform();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//span[@class='text-black fs-8 fw-normal'][contains(text(),'True')])[1]")).click();
    Thread.sleep(2000);
    WebElement radiolike = driver.findElement(By.xpath("(//div[normalize-space()='12.'])[1]"));
    actoned.moveToElement(radiolike).perform();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//span[@class='text-black fs-8 fw-normal'][contains(text(),'Like')])[1]")).click();
    Thread.sleep(2000);
/*    WebElement radioquestone = driver.findElement(By.xpath("(//div[normalize-space()='10.'])[1]"));
    actoned.moveToElement(radioquestone).perform();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//span[contains(text(),'True')])[1]")).click();
    Thread.sleep(2000);     
  //input[contains(@id,'mat-input-')]  //label[@id='mat-mdc-form-field-label-118']   
    WebElement radiodislike = driver.findElement(By.xpath("(//div[normalize-space()='11.'])[1]"));
    actoned.moveToElement(radiodislike).perform();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//span[contains(text(),'Dislike')])[1]")).click();  */
    }
}

