package esignatures;
import java.io.IOException;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.ITestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qount.qa.base.TestBaseSetup;
//import com.qount.qa.pages.LoginPage;
import com.qount.qa.listeners.MyListeners;
//import propertypackage.Propertylist;
import com.qount.qa.pages.EsignPage;

@Listeners(MyListeners.class)
public class Esignlists extends TestBaseSetup implements ITestListener  {
	
	EsignPage esignpagekey;

    @BeforeClass
    public void setesign() throws InterruptedException, IOException {

    	esignpagekey = new EsignPage(driver);
    }	
        @Test(priority = 1)
		public void esignoptions() throws Exception {

//			esignpagekey.loginqountweb();
			esignpagekey.esignpage();
			esignpagekey.esignflowpop();
			esignpagekey.settingspop();
			esignpagekey.historypop();
			esignpagekey.syncesigncloud();
			
        }
        @Test(priority = 2)
        public void invoiceview() throws Exception {
 //       	esignpagekey.loginqountweb();
			esignpagekey.esignpage();
        	esignpagekey.viewinvoicepage();
			esignpagekey.windowmain();
			esignpagekey.quitQtio();
        }
        @Test(priority = 3)
        public void pagedownload() throws Exception {
 //       	esignpagekey.loginqountweb();
			esignpagekey.esignpage();
        	esignpagekey.downloadepage();
        	esignpagekey.quitQtio();
        }
        @Test(priority = 4)
        public void securelink() throws Exception {
 //       	esignpagekey.loginqountweb();
			esignpagekey.esignpage();
        	esignpagekey.securelinkpop();
			esignpagekey.windowmain();
			esignpagekey.quitQtio();
        }
        @Test(priority = 5)
        public void esignstatuslist() throws Exception {
 //       	esignpagekey.loginqountweb();
			esignpagekey.esignpage();
			esignpagekey.listesignstatus();
			esignpagekey.quitQtio();
//			esignpagekey.listesignstatus();
}
}
// sample code write access 