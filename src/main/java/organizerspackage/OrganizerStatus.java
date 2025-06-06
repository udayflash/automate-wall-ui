package organizerspackage;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;

//import org.testng.annotations.Test;

public class OrganizerStatus extends SetupProperties {
    WebDriver driver; 
	JavascriptExecutor jsDriver;
	NgWebDriver ngWebDriver;
//	FluentWait<WebDriver> wait;
	
	 private static By organizerdata = By.xpath("(//td[normalize-space()='All Qs DLs 85 dup'])[1]");
     private static By inprogresstab = By.xpath("//div[normalize-space()='In Progress']");
     private static By clientorganizer = By.xpath("//span[normalize-space()='Bullvice ledgers']");
     private static By radiobutton = By.xpath("(//mat-card[@class='mat-mdc-card mdc-card py-0'])[1]//span[normalize-space()='Anjaneyulu']");
	   
//	 	private By errorMessage = By.xpath("//div[@class='error mb-20']");
//	 	private By userProfile = By.xpath("(//div[@class='mat-mdc-menu-trigger logout-profile-badge'])[1]");
//	 	private By logout = By.xpath("(//span[contains(text(),'Sign Out')])[1]");
 	
	 public OrganizerStatus(WebDriver driver) {
            this.driver = driver;
			jsDriver = (JavascriptExecutor) driver;
			ngWebDriver = new NgWebDriver(jsDriver);
		    }

	public void statustabs() throws InterruptedException, IOException {

	driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
//	driver.findElement(By.cssSelector("body > app-root:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > app-side-bar:nth-child(1) > div:nth-child(4) > mat-tab-group:nth-child(1) > div:nth-child(2) > mat-tab-body:nth-child(1) > div:nth-child(1) > div:nth-child(1) > mat-selection-list:nth-child(1) > mat-list-option:nth-child(18) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
	Thread.sleep(7000);
    Actions actoned = new Actions(driver);
    WebElement orgrown = driver.findElement(By.xpath("(//td[normalize-space()='Real int 47'])[1]"));
    actoned.moveToElement(orgrown).perform();
    Thread.sleep(4000);
	driver.findElement(By.xpath("(//td[normalize-space()='Real int 47'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[normalize-space()='Sent']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[normalize-space()='Draft']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[normalize-space()='In Progress']")).click();
	Thread.sleep(4000);
    driver.findElement(By.xpath("//div[normalize-space()='Submitted']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//div[normalize-space()='Locked']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//div[normalize-space()='Done']")).click();
    Thread.sleep(8000);
    }
//	public void wallhome() throws InterruptedException, IOException {
//	driver.findElement(By.xpath("(//mat-icon[normalize-space()='home'])[1]")).click();
//	Thread.sleep(9000);
//	}
/*	public void windowmain() throws InterruptedException, IOException {
		String realwindow = driver.getWindowHandle();
		driver.switchTo().window(realwindow);
        Thread.sleep(4000);
	}          */

	public void allanswertype() throws InterruptedException, IOException{
		// TODO Auto-generated method stub
    driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
    Thread.sleep(7000);
	Actions actoned = new Actions(driver);
	WebElement orgrown = driver.findElement(By.xpath("(//td[normalize-space()='Art 74 Qs'])[1]"));
	actoned.moveToElement(orgrown).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//td[normalize-space()='Art 74 Qs'])[1]")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[normalize-space()='In Progress']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Teraline Fidgets']")).click();
	Thread.sleep(3000);
/*	WebElement checkboxquestion = driver.findElement(By.xpath("(//div[normalize-space()='5.'])[1]"));
    actoned.moveToElement(checkboxquestion).perform();
    Thread.sleep(3000);
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
    Thread.sleep(3000);//next section    */	
	WebElement checkquestion = driver.findElement(By.xpath("(//div[normalize-space()='4.'])[1]"));
    actoned.moveToElement(checkquestion).perform();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//label[contains(text(),'Klusener')]")).click();   //checkbox
    Thread.sleep(4000);
    driver.findElement(By.xpath("//label[contains(text(),'Kumble')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//label[contains(text(),'Klusener')]")).click();
    Thread.sleep(2000);
	WebElement starquestion = driver.findElement(By.xpath("(//div[normalize-space()='5.'])[1]"));
    actoned.moveToElement(starquestion).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//i[@class='icon ion-ios-star-outline star ng-star-inserted'])[4]")).click();  //star rating
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//i[@class='icon ion-ios-star star selected ng-star-inserted'])[2]")).click();
    Thread.sleep(2000);
	WebElement npsquestion = driver.findElement(By.xpath("(//div[normalize-space()='6.'])[1]"));
    actoned.moveToElement(npsquestion).perform();
    Thread.sleep(3000);
    WebElement npsnumquestion = driver.findElement(By.xpath("(//div[normalize-space()='5.'])[1]"));
    actoned.moveToElement(npsnumquestion).perform();
    Thread.sleep(2000);
/*    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 star'][text()=' 3 '])[1]")).click();  
    Thread.sleep(2000);  
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 star'][text()=' 5 '])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 star'][text()=' 6 '])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 star'][text()=' 7 '])[1]")).click();
    Thread.sleep(2000);     */
    driver.findElement(By.xpath("(//div[@role='tab'][@aria-posinset='2'])")).click();
	Thread.sleep(3000);     
	WebElement radioquestion = driver.findElement(By.xpath("(//div[normalize-space()='4.'])[1]"));
    actoned.moveToElement(radioquestion).perform();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[8]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[9]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[7]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();
	Thread.sleep(2000);
	WebElement radionequestion = driver.findElement(By.xpath("(//div[normalize-space()='7.'])[1]"));
    actoned.moveToElement(radionequestion).perform();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[16]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[17]")).click();
	Thread.sleep(2000);
	WebElement radionumquestion = driver.findElement(By.xpath("(//div[normalize-space()='8.'])[1]"));
    actoned.moveToElement(radionumquestion).perform();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[21]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[23]")).click();
	Thread.sleep(2000);
	WebElement comment = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='chat_bubble_outline'])[7]"));
    actoned.moveToElement(comment).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='chat_bubble_outline'])[6]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//label[contains(@id,'mat-mdc-form-field-label-')]")).click();
    Thread.sleep(2000);
    Actions actionsc = new Actions(driver);
	actionsc.sendKeys("Automate comment").build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Cancel']")).click();        
	Thread.sleep(2000);	
	driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[1]")).click();
	Thread.sleep(3000);//prev section
	driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[3]")).click();
    Thread.sleep(3000);//next section
    driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[2]")).click();
    Thread.sleep(3000);//next section
	driver.findElement(By.xpath("//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base ng-star-inserted']")).click();
	Thread.sleep(3000); //prev section review
	driver.findElement(By.xpath("(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[2]")).click();
    Thread.sleep(2000);
 //   driver.findElement(By.xpath("(//mat-icon[normalize-space()='lock_open'])[1]")).click();
//	Thread.sleep(3000);
 //   driver.findElement(By.xpath("(//mat-icon[normalize-space()='lock'])[1]")).click();
 //   Thread.sleep(2000);
 //   driver.findElement(By.xpath("(//mat-icon[normalize-space()='check_circle'])[1]")).click();
 //   Thread.sleep(2000);
 //   driver.findElement(By.xpath("(//mat-icon[normalize-space()='check_circle'])[1]")).click();
 //   Thread.sleep(2000);
    driver.findElement(By.xpath("(//mat-icon[normalize-space()='file_download'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//mat-icon[normalize-space()='file_download'])[1]")).click();
    Thread.sleep(2000);
//    driver.findElement(By.xpath("//span[text()=' Organizer with Attachments ']")).click();
	}
   
//        private By checkmark = By.xpath("(//div[@class='flex-grow-1 qs-card mb-2 c-pointer'])[3]//span[normalize-space()='True']//span[@class='checkmark']");

/*    	public void organise() throws InterruptedException, IOException {

       	    driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
                Thread.sleep(5000);
    		    Actions actoned = new Actions(driver);
    		    WebElement orgrown = driver.findElement(By.xpath("(//td[normalize-space()='All Qs DLs 85 dup'])[1]"));
    		    actoned.moveToElement(orgrown).perform();
    		    Thread.sleep(4000);
    			driver.findElement(organizerdata).click();
    			Thread.sleep(4000);
    			driver.findElement(inprogresstab).click();
    			Thread.sleep(4000);
    			driver.findElement(clientorganizer).click();
    			Thread.sleep(4000);
    			driver.findElement(radiobutton).click();
    			Thread.sleep(6000);
    			JavascriptExecutor js = (JavascriptExecutor) driver;
    			js.executeScript("window.scrollBy(0,550)","");
    	//		WebElement iscrolls = driver.findElement(By.xpath("/html/body/app-root/div[1]/div[2]/div[2]/app-client-answers-qs/div/div/div[2]/mat-tab-group/div/mat-tab-body[4]"));
    		 	 //WebElement iscroll = driver.findElement(By.xpath("(//cdk-virtual-scroll-viewport[@class='cdk-virtual-scroll-viewport view-port ng-tns-c147-12 cdk-virtual-scrollable cdk-virtual-scroll-orientation-vertical'])[1]"));
    	//	 	JavascriptExecutor Jscrpt = (JavascriptExecutor) driver;
    	//	 	Jscrpt.executeScript("arguments[0].scrollIntoView(true);",iscrolls);
    		 	Thread.sleep(5000);
    			//driver.findElement(By.xpath("//label[@class='container d-flex mt-2 ng-star-inserted'][3]/span[normalize-space()='False']/following-sibling::input[@type='radio']")).click();
    			driver.findElement(By.xpath("(//div[@class='flex-grow-1 qs-card mb-2 c-pointer'])[3]//span[normalize-space()='False']//span[@class='checkmark']")).click();
    			//driver.findElement(By.xpath("(//label[@class='container d-flex mt-2 ng-star-inserted'])[3]/span[normalize-space()='False']/following-sibling::input[@type='radio']")).click();
    	//		(//div[@class='flex-grow-1 qs-card mb-2 c-pointer'])[2]
    	//		(//mat-card[@class='mat-mdc-card mdc-card py-0'])[3]
    	}     */

	public void linkopen() throws InterruptedException, IOException {

    	driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
        Thread.sleep(7000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='file_copy']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[normalize-space()='Archived']")).click();
	    Thread.sleep(6000);
	    Actions actone = new Actions(driver);
	    WebElement orgrow = driver.findElement(By.xpath("//mat-row[@class='mat-mdc-row mdc-data-table__row cdk-row ng-star-inserted'][3]"));
	    actone.moveToElement(orgrow).build().perform();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//mat-icon[@role='img'][@mattooltip='Copy Link'])[3]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//a[@class='text-primary text-decoration-underline fs-6']")).click();	
	    Thread.sleep(4000);
	    String realwindow = driver.getWindowHandle();
		driver.switchTo().window(realwindow);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
        Thread.sleep(4000);
	}

	public void orgdup() throws Exception {
    	driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='file_copy']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[normalize-space()='Archived']")).click();
	    Thread.sleep(4000);
	    Actions actone = new Actions(driver);
	    WebElement orgrow = driver.findElement(By.xpath("//mat-row[@class='mat-mdc-row mdc-data-table__row cdk-row ng-star-inserted'][3]"));
	    actone.moveToElement(orgrow).perform();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//mat-icon[@role='img'][@mattooltip='Duplicate'])[3]")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Tax form dup");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//span[normalize-space()='Duplicate']")).click();
	    Thread.sleep(2000);	    
	    String toastMessage = driver.findElement(By.xpath("(//div[@class='toast-message'])[1]")).getText();
	    System.out.println(toastMessage);
	    Thread.sleep(2000);  
	    driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
	    Thread.sleep(4000);
	}

	public void Organizerupdate() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
    driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
    Thread.sleep(5000);
	driver.findElement(By.xpath("//mat-icon[normalize-space()='file_copy']")).click();
	Thread.sleep(4000);
    driver.findElement(By.xpath("//div[normalize-space()='Archived']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[text()='Name ']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[text()='Name ']//i[normalize-space()='arrow_upward']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[text()='Name ']//i[normalize-space()='arrow_downward']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[text()='Created On ']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[text()='Created On ']//i[normalize-space()='arrow_upward']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[text()='Created On ']//i[normalize-space()='arrow_downward']")).click();
    Thread.sleep(4000);
    Actions acton = new Actions(driver);
    WebElement orgow = driver.findElement(By.xpath("//mat-row[@class='mat-mdc-row mdc-data-table__row cdk-row ng-star-inserted'][3]"));
    acton.moveToElement(orgow).perform();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='edit'])[3]")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys(Keys.NUMPAD3);
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys(Keys.NUMPAD9);
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
    Thread.sleep(4000);
    }

  		public void organizeroptions() throws InterruptedException, IOException {
  			// TODO Auto-generated method stub
  	    	driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
  	        Thread.sleep(5000);
  		    Actions actoned = new Actions(driver);
  		    WebElement orgrown = driver.findElement(By.xpath("(//td[normalize-space()='All Qs DLs 85 dup'])[1]"));
  		    actoned.moveToElement(orgrown).perform();
  		    Thread.sleep(4000);
  			driver.findElement(By.xpath("(//td[normalize-space()='All Qs DLs 85 dup'])[1]")).click();
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("//div[normalize-space()='Sent']")).click();
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[2]")).click();
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("//div[normalize-space()='MFA Settings']")).click();
  			Thread.sleep(4000);
  			//JavascriptExecutor mfajse = (JavascriptExecutor) driver;
  			//driver.findElement(By.xpath("//button[@id='mat-mdc-slide-toggle-4-button']//div[@class='mdc-switch__handle']")).click();
  			//JavascriptExecutor mfajs = (JavascriptExecutor) driver;
  			//mfajs.executeScript("document.getElementById('mat-mdc-slide-toggle-4-button').click()");
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("//div[normalize-space()='Activity']")).click();
  			Thread.sleep(5000);
  			driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("//span[normalize-space()='Resend']")).click();
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//span[normalize-space()='Set Reminder']")).click();
  			Thread.sleep(5000);
  			driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();
  			Thread.sleep(4000);
  			driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
  			Thread.sleep(4000);
  	    }

	public void dirurl() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
    	driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='file_copy']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[normalize-space()='Archived']")).click();
	    Thread.sleep(4000);
	    Actions actone = new Actions(driver);
	    WebElement orgrow = driver.findElement(By.xpath("//mat-row[@class='mat-mdc-row mdc-data-table__row cdk-row ng-star-inserted'][3]"));
	    actone.moveToElement(orgrow).perform();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='compare_arrows'])[3]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//span[normalize-space()='Cancel'])")).click();
	    Thread.sleep(4000);
	    actone.moveToElement(orgrow).perform();
	    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='bookmarks'])[3]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate mt-3 material-icons mat-ligature-font mat-icon-no-color']")).click();
	    actone.moveToElement(orgrow).perform();
	    driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='play_arrow'])[3]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("1040");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@aria-label='Clear']//span[@class='mat-mdc-button-touch-target']")).click(); 
	    Thread.sleep(4000);
    }

	public void dashorg() throws InterruptedException, IOException {

    	driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//td[normalize-space()='Hamburg new300']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[normalize-space()='In Progress']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='download'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Download Organizer']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='cdk-overlay-backdrop blue-berry-theme cdk-overlay-backdrop-showing']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@mattooltip='Secure Link'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='open'])[2]")).click();
		Thread.sleep(4000);
    }

	public void answerpage() throws InterruptedException, IOException {

    driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
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
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//i[@class='icon ion-ios-star star selected ng-star-inserted'])[2]")).click();
    Thread.sleep(4000);
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
    Thread.sleep(4000);  //nps question
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='4'])[1]")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='3'])[1]")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//div[@class='shadow-sm py-2 px-3 fw-bold c-pointer star selected'][normalize-space()='2'])[1]")).click();
    Thread.sleep(4000);
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
    Thread.sleep(4000);
    WebElement radiolike = driver.findElement(By.xpath("(//div[normalize-space()='12.'])[1]"));
    actoned.moveToElement(radiolike).perform();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//span[@class='text-black fs-8 fw-normal'][contains(text(),'Like')])[1]")).click();
    Thread.sleep(4000);
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

	public void sendattime() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
    driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
    Thread.sleep(5000);
	driver.findElement(By.xpath("//span[normalize-space()='Send']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[normalize-space()='Send to Client']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys("Croatia");
	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys(Keys.ENTER);	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys("Mighty enterprises pvt");
	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='delete'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-1-button'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-1-button'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-2-button'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-2-button'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//label[normalize-space()='Enable MFA'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//label[normalize-space()='Enable MFA'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	Thread.sleep(4000);
//	driver.findElement(By.xpath("//mat-label[normalize-space()='Subject']")).sendKeys("Sub email organizer automate");
  //  Thread.sleep(2000);
 //   driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ARROW_UP);
 //   Thread.sleep(2000);
  //  driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ARROW_UP);
 //   driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ENTER);
 //   Thread.sleep(2000);
    driver.findElement(By.xpath("//mat-icon[normalize-space()='assignment']")).click();
    Thread.sleep(4000);
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
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//li[normalize-space()='12:03 AM'])[1]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[contains(text(),'Schedule')]")).click();
    Thread.sleep(4000);
	}
 
    	public void clientsend() throws InterruptedException, IOException {
    		// TODO Auto-generated method stub
        driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
        Thread.sleep(5000);
    	driver.findElement(By.xpath("//span[normalize-space()='Send']")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//span[normalize-space()='Send to Client']")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys("Croatia");
    	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys(Keys.ARROW_DOWN);
    	driver.findElement(By.xpath("//input[@placeholder='Select Organizer']")).sendKeys(Keys.ENTER);	
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys("Mighty enterprises pvt");
    	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys(Keys.ARROW_DOWN);
    	driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys(Keys.ENTER);
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).click();
    	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ARROW_DOWN);
    	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ARROW_DOWN);
    	driver.findElement(By.xpath("//input[@placeholder='Select Branding']")).sendKeys(Keys.ENTER);
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='delete'])[1]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-1-button'])[1]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-1-button'])[1]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-2-button'])[1]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-2-button'])[1]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("(//label[normalize-space()='Enable MFA'])[1]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//label[normalize-space()='Enable MFA'])[1]")).click();
//    	JavascriptExecutor jsmfa = (JavascriptExecutor) driver;
//    	jsmfa.executeScript("document.getElementById('mat-mdc-slide-toggle-12-label').click()");
//    	driver.findElement(By.xpath("(//mat-slide-toggle[@id='mat-mdc-slide-toggle-12'])[1]")).click();
//    	driver.findElement(By.xpath("(//button[@id='mat-mdc-slide-toggle-12-button'])[1]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
    	Thread.sleep(3000);
//    	driver.findElement(By.xpath("//mat-label[normalize-space()='Subject']")).sendKeys("Sub email organizer automate");
      //  Thread.sleep(2000);
     //   driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ARROW_UP);
     //   Thread.sleep(2000);
      //  driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ARROW_UP);
     //   driver.findElement(By.xpath("//mat-label[normalize-space()='Sender Email']")).sendKeys(Keys.ENTER);
     //   Thread.sleep(2000);
        driver.findElement(By.xpath("//mat-icon[normalize-space()='assignment']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='8th August']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Select']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[normalize-space()='Send'])[2]")).click(); 
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Save as Draft']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[normalize-space()='Send']")).click();
        Thread.sleep(4000);
        }
    	public void filterorganizer() throws InterruptedException {
    		driver.findElement(By.xpath("//span[text()='# Organizers']")).click();
    	    Thread.sleep(7000);
    		Actions actoned = new Actions(driver);
    		WebElement orgrown = driver.findElement(By.xpath("(//td[normalize-space()='Org 76 Automate'])[1]"));
    		actoned.moveToElement(orgrown).perform();
    		Thread.sleep(6000);
    		driver.findElement(By.xpath("(//td[normalize-space()='Org 76 Automate'])[1]")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//div[normalize-space()='Sent']")).click();
    		Thread.sleep(3000);
    	    driver.findElement(By.xpath("//mat-icon[normalize-space()='filter_list']")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//input[@placeholder='Select Client']")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@placeholder='Select Client']")).sendKeys("Wolfox assets");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//li[normalize-space()='Wolfox assets']")).click();    		
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
    		Thread.sleep(5000);
    	}
 /*   	public void logoutqountweb() throws InterruptedException, IOException {
    		driver.findElement(userProfile).click();
    		Thread.sleep(2000);
    		driver.findElement(logout).click();
    		Thread.sleep(4000);
    		}    */
	}