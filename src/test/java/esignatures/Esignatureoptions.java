package esignatures;

	import java.io.IOException;
//	import org.apache.xmlbeans.impl.xb.xsdschema.Public;
	import org.testng.ITestListener;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;
	import com.qount.qa.base.TestBaseSetup;
	//import com.qount.qa.pages.LoginPage;
	import com.qount.qa.listeners.MyListeners;
	//import propertypackage.Propertylist;
//	import com.qount.qa.pages.EsignPage;
    import esignaturespackage.EsignaturesPage;
import login.LoginWebPage;
import proposalspackage.ProposalStatusPage;

	@Listeners(MyListeners.class)
	public class Esignatureoptions extends TestBaseSetup implements ITestListener  {
		LoginWebPage loginwebpagekey;
		EsignaturesPage esignaturekey;

	    @BeforeClass
	    public void esignsetup() throws InterruptedException, IOException {
	    	loginwebpagekey = new LoginWebPage(driver);
	    	esignaturekey = new EsignaturesPage(driver);
	    }	
	        @Test(priority = 1)
			public void esignoptions() throws Exception {
	        	loginwebpagekey.loginqountweb();
				esignaturekey.esignpage();
				esignaturekey.esignflowReorder();				
				loginwebpagekey.wallhome();
	        }
	        @Test(priority = 2)
	        public void invoiceview() throws Exception {
	        	loginwebpagekey.loginqountweb();
	        	esignaturekey.esignpage();
	        	esignaturekey.viewinvoicepage();
	        	loginwebpagekey.windowmain();
	        	loginwebpagekey.wallhome();
	        }
	        @Test(priority = 3)
	        public void pagedownload() throws Exception {

	        	esignaturekey.esignpage();
	        	esignaturekey.downloadepage();
	        	loginwebpagekey.wallhome();
	        }
	        @Test(priority = 4)
	        public void securelink() throws Exception {

	        	esignaturekey.esignpage();
	        	esignaturekey.securelinkpop();
	        	loginwebpagekey.windowmain();
	        	esignaturekey.cancelclick();
	        	loginwebpagekey.wallhome();
	        }
	        @Test(priority = 5)
	        public void esignstatuslist() throws Exception {

	        	esignaturekey.esignpage();
	        	esignaturekey.listesignstatus();
	        	loginwebpagekey.wallhome();
            }
	        @Test(priority = 6)
	        public void esignsync() throws Exception {
	
	        	esignaturekey.esignpage();
	        	esignaturekey.syncesigncloud();
	        	loginwebpagekey.wallhome();
	        }
	        @Test(priority = 7)
	        public void esignhistory() throws Exception {

	        	esignaturekey.esignpage();
	        	esignaturekey.historypop();
	        	loginwebpagekey.wallhome();
	        }
	        @Test(priority = 8)
	        public void esignfilter() throws InterruptedException, IOException {
	        	loginwebpagekey.loginqountweb();
				esignaturekey.esignpage();
				esignaturekey.esignFilter();
	        }
	        @Test(priority = 9)
	        public void esignflowreorder() throws InterruptedException, IOException {
	        	loginwebpagekey.loginqountweb();
				esignaturekey.esignpage();
				esignaturekey.esignflowReorder();
	        }
	        
	}
