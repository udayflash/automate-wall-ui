package organizers;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qount.qa.base.TestBaseSetup;
import com.qount.qa.listeners.MyListeners;

import login.LoginWebPage;
import organizerspackage.OrganizerCases;
import organizerspackage.OrganizerRedirectURL;
import organizerspackage.OrganizerStatus;
import proposalspackage.ProposalStatusPage;


	@Listeners(MyListeners.class)
	public class Organizertest extends TestBaseSetup implements ITestListener  {
		LoginWebPage loginwebkey;
		OrganizerStatus organizerkey;
		ProposalStatusPage proposalkey;
		OrganizerCases organizercasekey;
		OrganizerRedirectURL organizerurlkey;
		
	    @BeforeClass
	    public void setesign() throws InterruptedException, IOException {
	    	loginwebkey = new LoginWebPage(driver);
	    	organizerkey = new OrganizerStatus(driver);
	    	proposalkey =new ProposalStatusPage(driver);
			organizercasekey = new OrganizerCases(driver);
			organizerurlkey = new OrganizerRedirectURL(driver);
	    }	
	        @Test(priority = 1)
			public void organizeropt() throws Exception {
				loginwebkey.loginqountweb();
				organizerkey.statustabs();
				loginwebkey.wallhome();
				loginwebkey.logoutqountweb();
	        }
	        	
	        @Test(priority = 2)
	        public void orgupdate() throws Exception {
				loginwebkey.loginqountweb();
	        	organizerkey.Organizerupdate();
	        	loginwebkey.wallhome();
				loginwebkey.logoutqountweb();
	        }
	        @Test(priority = 3)
	        public void orgoption() throws Exception {
				loginwebkey.loginqountweb();
	        	organizerkey.organizeroptions();
	        	loginwebkey.wallhome();
				loginwebkey.logoutqountweb();
	        }
	        @Test(priority = 4)
	        public void directurl() throws Exception {
				loginwebkey.loginqountweb();
	        	organizerkey.dirurl();
	     //   	loginwebkey.windowmain();
	        	loginwebkey.wallhome();
				loginwebkey.logoutqountweb();
	        }
	        @Test(priority = 5)
	        public void securelinkorg() throws Exception {
				    loginwebkey.loginqountweb();
	 	        	organizerkey.dashorg();
	 	        	loginwebkey.wallhome();
				    loginwebkey.logoutqountweb();
	        }
	        @Test(priority = 6)
	        public void scheduleorg() throws Exception {
				loginwebkey.loginqountweb();
	        	organizerkey.sendattime();
	        	loginwebkey.wallhome();
				loginwebkey.logoutqountweb();
	        }
	        @Test(priority = 7)
	        public void sendorg() throws Exception {
				loginwebkey.loginqountweb();
	        	organizerkey.clientsend();
	        	loginwebkey.windowmain();
	        	loginwebkey.wallhome();
				loginwebkey.logoutqountweb();
	        }
	        @Test(priority = 8)
	        public void organizerdup() throws Exception {
	        	loginwebkey.loginqountweb();
	        	organizerkey.orgdup();
//	        	organizerkey.windowmain();
	        	loginwebkey.wallhome();
	        	loginwebkey.logoutqountweb();
	        }
	        @Test(priority = 9)
	        public void selectorg() throws InterruptedException, IOException {
	        	loginwebkey.loginqountweb();
	        	organizerkey.filterorganizer();
				loginwebkey.wallhome();
				loginwebkey.logoutqountweb();
	        }
	        @Test(priority = 10)
	        public void organizerlink() throws Exception {
	        	loginwebkey.loginqountweb();
	        	organizerkey.linkopen();
	        	loginwebkey.windowmain();
	        	loginwebkey.wallhome();
	        	loginwebkey.logoutqountweb();
	}
			@Test(priority = 11)
			public void orgcases() throws Exception {
			loginwebkey.loginqountweb();
			organizercasekey.orgzer();
			loginwebkey.wallhome();
			loginwebkey.logoutqountweb();
			}
			@Test(priority = 12)
			public void orgfilter() throws Exception {
			loginwebkey.loginqountweb();
			organizerkey.filterorganizer();
			loginwebkey.wallhome();
			loginwebkey.logoutqountweb();
			}
}