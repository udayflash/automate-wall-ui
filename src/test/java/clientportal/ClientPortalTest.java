package clientportal;
import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.ITestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qount.qa.base.TestBaseSetup;
//import com.qount.qa.pages.LoginPage;
import com.qount.qa.listeners.MyListeners;
import com.qount.qa.pages.ClientPortalPage;
//import propertypackage.Propertylist;
import com.qount.qa.pages.EsignPage;

@Listeners(MyListeners.class)
public class ClientPortalTest extends TestBaseSetup implements ITestListener  {
	
	ClientPortalPage clientportalpagekey;

    @BeforeClass
    public void setclientportal() throws InterruptedException, IOException {

    	clientportalpagekey = new ClientPortalPage(driver);
    }	
        @Test(priority = 1)
		public void clientportal() throws Exception {

		clientportalpagekey.portallogin();

	}
}
// new changes added from eclipse project