package esignaturespackage;

	import java.io.IOException;
	import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import com.paulhammant.ngwebdriver.NgWebDriver;
	import com.qount.qa.proppackage.SetupProperties;

	public class EsignaturesPage extends SetupProperties {

				WebDriver driver;
	//			FluentWait<WebDriver> wait;
				JavascriptExecutor jsDriver;
				NgWebDriver ngWebDriver;
				
				private By esignatures = By.xpath("//span[text()='# eSignatures']");
				private By esignscroll = By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[10]");
				private By threedots = By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[11]");
		        private By activereminder = By.xpath("(//mat-icon[@role='img'][normalize-space()='notifications_active'])[5]");
				private By esignflow = By.xpath("//span[normalize-space()='E-Sign Flow']");
				private By esignflowclose = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/div/div/lib-esign-select-flow/div/div[1]/button/span[5]");
				private By securelink = By.xpath("(//div[@class='g-table']//mat-icon[@mattooltip='Open Secure Link' and starts-with(@class,'mat-icon')][1])[3]");
				private By opensecurelink = By.xpath("(//p[contains(text(),'open')])[1]");
				private By downloadesign = By.xpath("(//div[@class='g-table']//mat-icon[@mattooltip='Download' and starts-with(@class,'mat-icon')][1])[10]");
			    private By viewinvoice = By.xpath("(//div[@mattooltip='View Invoice'])[3]");
			    private By opensettings = By.xpath("//span[@class='mdc-list-item__primary-text']//span[normalize-space()='Settings']");
			    private By cancelsetting = By.xpath("(//span[normalize-space()='Cancel'])[1]");
			    private By historyesign = By.xpath("//span[normalize-space()='History']");
			    private By closehistory = By.xpath("(//mat-icon[@class='mat-icon notranslate mt-3 fs-6 material-icons mat-ligature-font mat-icon-no-color'])[1]");
			    private By syncesign = By.xpath("//span[@class='mdc-list-item__primary-text']//span[normalize-space()='Sync']");
			    private By kbafailed = By.xpath("//mat-icon[normalize-space()='cancel']");
				private By expired = By.xpath("//div[normalize-space()='Expired']");
				private By signed = By.xpath("//div[normalize-space()='Signed']");
				private By done = By.xpath("//div[normalize-space()='Done']");
				private By archived = By.xpath("//div[normalize-space()='Archived']"); 

			    public EsignaturesPage(WebDriver driver) {
				this.driver = driver;
				jsDriver = (JavascriptExecutor) driver;
				ngWebDriver = new NgWebDriver(jsDriver);
			    }
			   
				public void esignpage() throws InterruptedException {
					driver.findElement(esignatures).click();
					Thread.sleep(9000);
				}
				public void esignflowReorder() throws InterruptedException {
					WebElement iscroll = driver.findElement(esignscroll);
					JavascriptExecutor Jscr = (JavascriptExecutor) driver;
					Jscr.executeScript("arguments[0].scrollIntoView(true);", iscroll);
					Thread.sleep(3000);
					driver.findElement(threedots).click();
					Thread.sleep(3000);
					driver.findElement(esignflow).click();
					Thread.sleep(5000);
					// driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
					WebElement dragdropnotes = driver.findElement(By.xpath("//div[@class='mat-mdc-dialog-content mdc-dialog__content ng-star-inserted']//b[text()='Notes']"));
					WebElement dragdropdocuments = driver.findElement(By.xpath("//div[@class='mat-mdc-dialog-content mdc-dialog__content ng-star-inserted']//b[text()='Additional Documents']"));
					WebElement dragdroppayments =  driver.findElement(By.xpath("//div[@class='mat-mdc-dialog-content mdc-dialog__content ng-star-inserted']//b[text()='Payment']"));
					WebElement dragdropesignature = driver.findElement(By.xpath("//div[@class='mat-mdc-dialog-content mdc-dialog__content ng-star-inserted']//b[text()='E-Signature']"));
					Actions act = new Actions(driver);
					act.moveToElement(dragdroppayments).clickAndHold(dragdroppayments).perform();
					act.moveToElement(dragdropnotes).release(dragdropnotes).perform();
					Thread.sleep(4000);
                    act.moveToElement(dragdropesignature).clickAndHold(dragdropesignature).perform();
                    act.moveToElement(dragdropdocuments).release(dragdropdocuments).perform();
                    Thread.sleep(3000);
                    act.moveToElement(dragdropnotes).clickAndHold(dragdropnotes).perform();
                    act.moveToElement(dragdropesignature).release(dragdropesignature).perform();
                    Thread.sleep(3000);
					driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();					
				//	driver.findElement(esignflowclose).click();
					Thread.sleep(3000);
				    WebElement savedmessage = driver.findElement(By.xpath("//div[normalize-space()='Saved Successfully']"));
				    System.out.println("result is: " +savedmessage.getText());
				    Thread.sleep(3000);
				}
				public void settingspop() throws InterruptedException {
					WebElement iscroll = driver.findElement(esignscroll);
					JavascriptExecutor Jscr = (JavascriptExecutor) driver;
					Jscr.executeScript("arguments[0].scrollIntoView(true);", iscroll);
					Thread.sleep(3000);
					driver.findElement(threedots).click();
					Thread.sleep(4000);
					driver.findElement(opensettings).click();
					Thread.sleep(6000);
					driver.findElement(cancelsetting).click();
					Thread.sleep(5000);
				}
				public void historypop() throws InterruptedException {
					WebElement iscroll = driver.findElement(esignscroll);
					JavascriptExecutor Jscr = (JavascriptExecutor) driver;
					Jscr.executeScript("arguments[0].scrollIntoView(true);", iscroll);
					Thread.sleep(3000);
					driver.findElement(threedots).click();
					Thread.sleep(2000);
					driver.findElement(historyesign).click();
					Thread.sleep(6000);
					driver.findElement(closehistory).click();
					Thread.sleep(4000);
				}
				public void syncesigncloud() throws InterruptedException {
					WebElement iscroll = driver.findElement(esignscroll);
					JavascriptExecutor Jscr = (JavascriptExecutor) driver;
					Jscr.executeScript("arguments[0].scrollIntoView(true);", iscroll);
					Thread.sleep(3000);
					driver.findElement(threedots).click();
					// driver.findElement(By.xpath("//div[@class='g-table']//mat-icon[@role='img'][normalize-space()='more_vert'][normalize-space()='Prosignbug']")).click();
					Thread.sleep(4000);
					driver.findElement(syncesign).click();
					Thread.sleep(5000);
				}
				public void viewinvoicepage() throws InterruptedException {
					driver.findElement(viewinvoice).click();
					Thread.sleep(10000);
					// driver.close();
				}
				public void cancelclick() throws InterruptedException {
					driver.findElement(cancelsetting).click();
					Thread.sleep(3000);
				}				 
				
				  public void downloadepage() throws InterruptedException {
						driver.findElement(downloadesign).click();
						Thread.sleep(7000);
					}
				public void securelinkpop() throws InterruptedException {
					driver.findElement(securelink).click();
					Thread.sleep(5000);
					// driver.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/lib-secure-link[1]/mat-dialog-content[1]/div[1]/div[2]/div[1]/div[2]/div[1]/u[1]/p[1]")).click();
					driver.findElement(opensecurelink).click();
					Thread.sleep(7000);
				} 
				public void listesignstatus() throws InterruptedException {
					driver.findElement(kbafailed).click(); 
			    	Thread.sleep(6000);
			    	driver.findElement(expired).click(); 
			    	Thread.sleep(6000);
			    	driver.findElement(signed).click();
			    	Thread.sleep(6000);
			    	driver.findElement(done).click(); 
				   	Thread.sleep(6000);
				   	driver.findElement(archived).click(); 
				   	Thread.sleep(6000);
				} 
				public void checkboxesign() throws InterruptedException {
		        driver.findElement(By.xpath("(//input[@class='mdc-checkbox__native-control'])[5]")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//input[@class='mdc-checkbox__native-control'])[6]")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//input[@class='mdc-checkbox__native-control'])[7]")).click();
		        Thread.sleep(2000);
				}
				public void unmarkEsignCheckbox() throws InterruptedException {
				driver.findElement(By.xpath("(//span[@class='mat-mdc-button-touch-target'])[7]")).click();
				Thread.sleep(2000);
			}
				 public void esignSetReminder() throws Exception {
					WebElement iscroll = driver.findElement(esignscroll);
					JavascriptExecutor Jscr = (JavascriptExecutor) driver;
					Jscr.executeScript("arguments[0].scrollIntoView(true);", iscroll);
//					Thread.sleep(3000);
//					driver.findElement(activereminder).click();
					Thread.sleep(5000);
				try {  
					 WebElement reminderbellicon = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='notifications_active'])[14]"));		  			  
					 boolean remindericondisplay = reminderbellicon.isDisplayed();
			 	  	if(remindericondisplay) {
			 	  	reminderbellicon.click();
			 	  		  }}
					catch (Exception e) {
					WebElement threedotelement = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[7]"));
					threedotelement.click();
			        WebElement reminderclick = driver.findElement(By.xpath("//span[normalize-space()='Reminder']"));
		  	        reminderclick.click();
			        Thread.sleep(3000);
					  	   } 
					finally {
					System.out.println("is displayed");
					  	  }
				    Thread.sleep(4000);
//					driver.findElement(threedots).click();
//		  	        Thread.sleep(3000);
//		  	        driver.findElement(By.xpath("//span[normalize-space()='Reminder']")).click();
//		  	        Thread.sleep(3000);
		  	  		driver.findElement(By.xpath("//mat-label[normalize-space()='Set Frequency']")).click();
		  	  		Thread.sleep(8000);
		  	  try {  
		  	  WebElement periodelement = driver.findElement(By.xpath("(//span[normalize-space()='Yearly'])[1]"));		  			  
		  	  boolean perioddisplay = periodelement.isDisplayed();
 	  		  if(perioddisplay) {
 	  			 periodelement.click();
 	  		  }}
		  	   catch (ElementClickInterceptedException e) {
		  	  WebElement pseudoelement = driver.findElement(By.xpath("(//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-mdc-option-pseudo-checkbox mat-pseudo-checkbox-checked mat-pseudo-checkbox-minimal ng-star-inserted'])[1]"));
		  	  pseudoelement.click();
		  	   } 
		  	  finally {
		  		  System.out.println("is displayed");
		  	  }
		  	  Thread.sleep(4000);
	//	  	     	driver.findElement(By.xpath("(//span[normalize-space()='Yearly'])[1]")).click();
	//	  	  		Thread.sleep(3000);
//		  	     	driver.findElement(By.xpath("//mat-label[normalize-space()='Start Date']")).click();
//		  	     	Thread.sleep(4000);
		  	     	driver.findElement(By.xpath("(//mat-datepicker-toggle[starts-with(@class,'mat-datepicker-toggle ng-tns')])[1]")).click();
		  	     	Thread.sleep(4000);  		
		  	  	    driver.findElement(By.xpath("//button[@aria-current='date'][1]")).click();
		  	  	    Thread.sleep(4000);
		  	     	driver.findElement(By.xpath("//mat-label[normalize-space()='Start Time*']")).click();
 //   	  	     	Thread.sleep(2000);
    	  	     	Actions actionsrem = new Actions(driver);
    	  			actionsrem.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).
    	  			sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
    	  			Thread.sleep(2000);
    	  			actionsrem.sendKeys("05:15 PM").build().perform();
    	  			Thread.sleep(3000);
    	  			driver.findElement(By.xpath("(//li[@class='ui-menu-item ng-star-inserted'])[1]")).click();
    	  			Thread.sleep(2000);
		  	     	driver.findElement(By.xpath("(//mat-datepicker-toggle[starts-with(@class,'mat-datepicker-toggle ng-tns')])[2]")).click();
		  	     	Thread.sleep(3000);
		  	     	driver.findElement(By.xpath("(//button[@aria-label='Next month'])[1]")).click();
		  	     	driver.findElement(By.xpath("(//button[@aria-label='Next month'])[1]")).click();
		  	     	driver.findElement(By.xpath("(//button[@aria-label='Next month'])[1]")).click();
		  	     	driver.findElement(By.xpath("(//button[@aria-label='Next month'])[1]")).click();		  	     	
		  	     	driver.findElement(By.xpath("//span[normalize-space()='13']")).click();
		  	     	Thread.sleep(4000);
		  	     	driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
		  	     	Thread.sleep(4000);
				 }
				 public void esignFilter() throws InterruptedException {
					 driver.findElement(By.xpath("//i[@class='icon ion-funnel filter-icon']")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//input[@placeholder='Client']")).click();
					 driver.findElement(By.xpath("//input[@placeholder='Client']")).sendKeys("H & L Partners");
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//li[normalize-space()='H & L Partners']")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
					 Thread.sleep(4000);
				 }
		  	     	public String verifyReminderUpdateMessage() {
		  				return driver.findElement(By.xpath("//div[normalize-space()='Reminder Updated Successfully']")).getText();
				 }
	}