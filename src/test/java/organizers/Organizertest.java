package organizers;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qount.qa.base.TestBaseSetup;
import com.qount.qa.listeners.MyListeners;

import login.LoginWebPage;
import organizerspackage.OrganizerStatus;
import proposalspackage.ProposalStatusPage;


	@Listeners(MyListeners.class)
	public class Organizertest extends TestBaseSetup implements ITestListener  {
		LoginWebPage loginwebkey;
		OrganizerStatus organizerkey;
		ProposalStatusPage proposalkey;
		
	    @BeforeClass
	    public void setesign() throws InterruptedException, IOException {
	    	loginwebkey = new LoginWebPage(driver);
	    	organizerkey = new OrganizerStatus(driver);
	    	proposalkey =new ProposalStatusPage(driver);
	    }	
	        @Test(priority = 1)
			public void organizeropt() throws Exception {
				
				organizerkey.statustabs();
				organizerkey.wallhome();
				proposalkey.Proposaltabs();
				
	        }
	        	
	        @Test(priority = 2)
	        public void orgupdate() throws Exception {
	        	
	        	organizerkey.Organizerupdate();
	        	organizerkey.wallhome();
	        }
	        @Test(priority = 3)
	        public void orgoption() throws Exception {
	        	
	        	organizerkey.organizeroptions();
	        	organizerkey.wallhome();
	        }
	        @Test(priority = 4)
	        public void directurl() throws Exception {
	        	
	        	organizerkey.dirurl();
	        	organizerkey.windowmain();
	        	organizerkey.wallhome();
	        }
	        @Test(priority = 5)
	        public void securelinkorg() throws Exception {
	 	        	
	 	        	organizerkey.dashorg();
	 	        	organizerkey.wallhome();
	        }
	        @Test(priority = 6)
	        public void scheduleorg() throws Exception {
	        	
	        	organizerkey.sendattime();
	        	organizerkey.wallhome();
	        }
	        @Test(priority = 7)
	        public void sendorg() throws Exception {
	        	
	        	organizerkey.clientsend();
	        	organizerkey.windowmain();
	        	organizerkey.wallhome();
	        }
	        @Test(priority = 8)
	        public void organizerdup() throws Exception {
	        	loginwebkey.loginqountweb();
	        	organizerkey.orgdup();
//	        	organizerkey.windowmain();
//	        	organizerkey.wallhome();
//	        	organizerkey.logoutqountweb();
	        }
	        @Test(priority = 9)
	        public void selectorg() throws InterruptedException, IOException {
	        	loginwebkey.loginqountweb();
	        	organizerkey.filterorganizer();
	        }
	        @Test(priority = 10)
	        public void organizerlink() throws Exception {
	        	
	        	organizerkey.linkopen();
	        	organizerkey.windowmain();
	        	organizerkey.wallhome();
	        	organizerkey.logoutqountweb();
	}
}