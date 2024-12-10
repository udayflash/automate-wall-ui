package com.qount.qa.pages;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.paulhammant.ngwebdriver.NgWebDriver;
import com.qount.qa.proppackage.SetupProperties;

public class EsignPage extends SetupProperties {
			WebDriver driver;
			FluentWait<WebDriver> wait;
			JavascriptExecutor jsDriver;
			NgWebDriver ngWebDriver;
			
			private By username = By.cssSelector("input[placeholder='Username']");
			private By password = By.id("input__password");
     		private By submit = By.xpath("//button[@type='submit']");
			private By esignatures = By.xpath("//span[text()='# eSignatures']");
			private By esignscroll = By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[6]");
			private By threedots = By.xpath("(//mat-icon[@role='img'][normalize-space()='more_vert'])[7]");
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

		    public EsignPage(WebDriver driver) {
			this.driver = driver;
			jsDriver = (JavascriptExecutor) driver;
			ngWebDriver = new NgWebDriver(jsDriver);
		    }

			public void esignpage() throws InterruptedException {
				driver.findElement(esignatures).click();
				Thread.sleep(9000);
			}
			public void esignflowpop() throws InterruptedException {
				WebElement iscroll = driver.findElement(esignscroll);
				JavascriptExecutor Jscr = (JavascriptExecutor) driver;
				Jscr.executeScript("arguments[0].scrollIntoView(true);", iscroll);
				Thread.sleep(3000);
				driver.findElement(threedots).click();
				Thread.sleep(3000);
				driver.findElement(esignflow).click();
				Thread.sleep(5000);
				// driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
				driver.findElement(esignflowclose).click();
				Thread.sleep(5000);	
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
			 
			  public void windowmain() throws InterruptedException {
					String realwindow = driver.getWindowHandle();
					driver.switchTo().window(realwindow);
	                Thread.sleep(4000);
				}
			  public void downloadepage() throws InterruptedException {
					driver.findElement(downloadesign).click();
					Thread.sleep(6000);
				}
			public void securelinkpop() throws InterruptedException {
				driver.findElement(securelink).click();
				Thread.sleep(5000);
				// driver.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/lib-secure-link[1]/mat-dialog-content[1]/div[1]/div[2]/div[1]/div[2]/div[1]/u[1]/p[1]")).click();
				driver.findElement(opensecurelink).click();
				Thread.sleep(7000);
			} 
			
//		public void actwindow() throws InterruptedException {
			// Get the current window handle
//			String windowHandle = driver.getWindowHandle();
			// Get the list of window handles
//			ArrayList tabs = new ArrayList(driver.getWindowHandles());
//			System.out.println(tabs.size());
//		}
		// Use the list of window handles to switch between windows
//		driver.switchTo().window(tabs.get(0));
		// Switch back to original window
//		public void primaryTab() {
//			ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
//			driver.switchTo().window(tab.get(0));
			// driver.close();
//		driver.switchTo().window(mainWindowHandle);
//		}
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
		
		   public void quitQtio() {
				driver.close();
		    	
			}
			    
	//		}
			}
