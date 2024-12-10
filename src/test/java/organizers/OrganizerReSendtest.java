package organizers;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.ITestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qount.qa.base.TestBaseSetup;
import com.qount.qa.listeners.MyListeners;
import login.LoginWebPage;
import organizerspackage.OrganizerReSendPage;
import organizerspackage.OrganizerStatus;

	@Listeners(MyListeners.class)
	public class OrganizerReSendtest extends TestBaseSetup implements ITestListener  {
        LoginWebPage loginwebpagekey;
        OrganizerStatus organizerkey;
		OrganizerReSendPage organizerresendkey;
		
	    @BeforeClass
	    public void setesign() throws InterruptedException, IOException {
	    	loginwebpagekey = new LoginWebPage(driver);
	    	organizerkey = new OrganizerStatus(driver);
	    	organizerresendkey = new OrganizerReSendPage(driver);
	    	
	    }	
	        @Test(priority = 1)
			public void organizerReSend() throws Exception {
	        	loginwebpagekey.loginqountweb();
	        	organizerresendkey.organizerspage();
	        	organizerresendkey.resendorganizer();
	        	organizerresendkey.verifyResendMessage();
	            AssertJUnit.assertEquals(organizerresendkey.verifyResendMessage(),"Form Resent Successfully");
	        }	        			
}