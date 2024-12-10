package esignatures;

		import java.io.IOException;
		import org.testng.ITestListener;
		import org.testng.annotations.BeforeClass;
		import org.testng.annotations.Listeners;
		import org.testng.annotations.Test;
		import com.qount.qa.base.TestBaseSetup;
		import com.qount.qa.listeners.MyListeners;
	    import esignaturespackage.EsignaturesPage;
	    import login.LoginWebPage;
	
		@Listeners(MyListeners.class)
		public class EsignBulkCheckbox extends TestBaseSetup implements ITestListener  {
			LoginWebPage loginwebpagekey;
			EsignaturesPage esignaturekey;

		    @BeforeClass
		    public void bulkesignsetup() throws InterruptedException, IOException {	            
		    	loginwebpagekey = new LoginWebPage(driver);
		    	esignaturekey = new EsignaturesPage(driver);
		    }	
		        @Test(priority = 1)
				public void esignCheckboxBulk() throws Exception {
				loginwebpagekey.loginqountweb();
				esignaturekey.esignpage();
				esignaturekey.checkboxesign();
				esignaturekey.unmarkEsignCheckbox();
             	}
		        @Test(priority = 2)
		        public void eSignReminderAdd() throws Exception {
		        loginwebpagekey.loginqountweb();
		        esignaturekey.esignpage();
		        esignaturekey.esignSetReminder();
		        esignaturekey.verifyReminderUpdateMessage();
		        }
}