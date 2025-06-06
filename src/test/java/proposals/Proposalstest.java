package proposals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.qount.qa.base.TestBaseSetup;
import com.qount.qa.listeners.MyListeners;

import login.LoginWebPage;
import proposalspackage.ProposalStatusPage;
        
        @Listeners(MyListeners.class)
        public	class Proposalstest extends TestBaseSetup implements ITestListener  {
        LoginWebPage loginpagekey;
		ProposalStatusPage proposalkey;
		
	    @BeforeClass
	    public void setproposal() throws Exception {// InterruptedException, IOException {
            loginpagekey = new LoginWebPage(driver);
	    	proposalkey = new ProposalStatusPage(driver);
	    }	
	        @Test(priority = 1)
			public void proposallists() throws Exception {
				loginpagekey.loginqountweb();
				proposalkey.Proposalsclick();
				proposalkey.Proposaltabs();
				loginpagekey.wallhome();
				loginpagekey.logoutqountweb();	
	}
	        @Test(priority = 2)
	        public void proposalreminder() throws Exception {
	        	loginpagekey.loginqountweb();
				proposalkey.Proposalsclick();
				proposalkey.ProposalReminder();
	        }
	        @Test(priority = 3)
	        public void searchproposal() throws Exception {
	        	loginpagekey.loginqountweb();
				proposalkey.Proposalsclick();
				proposalkey.searchProposal();
	        }
	        @Test(priority = 4)
	        public void organizerproposal() throws InterruptedException, IOException {
	        	loginpagekey.loginqountweb();
				proposalkey.Proposalsclick();
				proposalkey.proposalOrganizer();
	        }
	        @Test(priority = 5)
	        public void proposalresend() throws InterruptedException, IOException {
	        	loginpagekey.loginqountweb();
				proposalkey.Proposalsclick();
				proposalkey.resendProposal();
	        }
}   
