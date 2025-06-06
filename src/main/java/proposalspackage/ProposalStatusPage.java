package proposalspackage;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;

	public class ProposalStatusPage extends SetupProperties {
	    WebDriver driver; 
//	    FluentWait<WebDriver> wait;
		JavascriptExecutor jsDriver;
		NgWebDriver ngWebDriver;
		
		private By leftarrow = By.xpath("//i[@class='icon ion-ios-arrow-left']");
		
		public ProposalStatusPage(WebDriver driver) {
        this.driver = driver;
		jsDriver = (JavascriptExecutor) driver;
		ngWebDriver = new NgWebDriver(jsDriver);
		}
		public void Proposalsclick() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='# Proposals']")).click();
		Thread.sleep(7000);	
		}
		public void Proposaltabs() throws InterruptedException {
		driver.findElement(By.xpath("//div[normalize-space()='Pending Signature']")).click();
	    Thread.sleep(8000);
		driver.findElement(By.xpath("//div[normalize-space()='Pending Payment']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[normalize-space()='Verify']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[normalize-space()='Draft']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[normalize-space()='Declined']")).click();
		Thread.sleep(8000);
	    driver.findElement(By.xpath("//div[normalize-space()='Trash']")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//div[normalize-space()='Done']")).click();
	    Thread.sleep(8000);
	    }
		public void searchProposal() throws InterruptedException, IOException {
			driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("test pro");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
			Thread.sleep(4000);
		}
		public void resendProposal() throws InterruptedException {
			driver.findElement(By.xpath("//div[normalize-space()='Pending Signature']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//mat-icon[normalize-space()='more_vert'])[3]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[normalize-space()='Resend Proposal']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@role='combobox']")).click();
			driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
		}
		public void proposalOrganizer() throws InterruptedException {
			try { 
				WebElement downloadorganizer = driver.findElement(By.xpath("(//mat-icon[@role='img'][@class='mat-icon notranslate fs-5 text-primary material-icons-outlined mat-icon-no-color'])[2]"));
		        boolean downloadorg = downloadorganizer.isDisplayed();
		        if(downloadorg) {
		        WebElement threedots = driver.findElement(By.xpath("(//mat-icon[normalize-space()='more_vert'])[3]"));
		        threedots.click();
		        Thread.sleep(2000);
		        WebElement vieworganizer = driver.findElement(By.xpath("//span[normalize-space()='View Organizer']"));
		        vieworganizer.click();
		        Thread.sleep(5000);
		        driver.findElement(leftarrow).click();
		        Thread.sleep(9000);
		        }}
			catch (Exception e) {
				System.out.println("Proposal was not linked to Organizer");
			}
    		finally {
				System.out.println("Proposal Organizer");
			}
		}
		public void ProposalReminder() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[normalize-space()='Pending Signature']")).click();
		Thread.sleep(6000);
			WebElement iscroll = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[9]"));
			JavascriptExecutor Jscr = (JavascriptExecutor) driver;
			Jscr.executeScript("arguments[0].scrollIntoView(true);", iscroll);
			Thread.sleep(5000);
		try {  
			 WebElement reminderbellicon = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='notifications_active'])[13]"));		  			  
	 	  	reminderbellicon.click();
	 	  		  }
			catch (Exception e) {
			WebElement threedotelement = driver.findElement(By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[10]"));
			threedotelement.click();
	        WebElement reminderclick = driver.findElement(By.xpath("//span[normalize-space()='Reminder']"));
  	        reminderclick.click();
	        Thread.sleep(3000);
			  	   } 
  	  		driver.findElement(By.xpath("//mat-label[normalize-space()='Set Frequency']")).click();
  	  		Thread.sleep(8000);
  	  try {  
  	  WebElement periodelement = driver.findElement(By.xpath("(//span[normalize-space()='Yearly'])[1]"));		  			  
			 periodelement.click();
		  }
  	   catch (ElementClickInterceptedException e) {
  	  WebElement pseudoelement = driver.findElement(By.xpath("(//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-mdc-option-pseudo-checkbox mat-pseudo-checkbox-checked mat-pseudo-checkbox-minimal ng-star-inserted'])[1]"));
  	  pseudoelement.click();
  	   } 
  	  Thread.sleep(4000);
  	     	driver.findElement(By.xpath("(//mat-datepicker-toggle[starts-with(@class,'mat-datepicker-toggle ng-tns')])[1]")).click();
  	     	Thread.sleep(4000);  		
  	  	    driver.findElement(By.xpath("//button[@aria-current='date'][1]")).click();
  	  	    Thread.sleep(4000);
  	     	driver.findElement(By.xpath("//mat-label[normalize-space()='Start Time*']")).click();
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
  	      try {  
  	    	  WebElement periodelement = driver.findElement(By.xpath("//span[normalize-space()='Create']"));		  			  
  	    	  periodelement.click();
  	    	  Thread.sleep(2000);
  	  		  }
  	    	   catch (Exception e) {
  	    	  WebElement updateelement = driver.findElement(By.xpath("//span[normalize-space()='Update']"));
  	    	  updateelement.click();
  	    	  Thread.sleep(2000);
  	    	   }
  	      
  	    	String reminderadd = driver.findElement(By.xpath("//div[normalize-space()='Reminder Added Successfully']")).getText();
    	  	System.out.println("message is: " +reminderadd); 
  	    	}   
  	    }