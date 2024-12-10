package login;

	import java.io.IOException;
    import org.testng.AssertJUnit;
	import org.testng.ITestListener;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;
	import com.qount.qa.base.TestBaseSetup;
	import com.qount.qa.listeners.MyListeners;

	@Listeners(MyListeners.class)
	public class LoginWebTest extends TestBaseSetup implements ITestListener  {
		LoginWebPage loginwebpagekey;

	    @BeforeClass
	    public void loginsetup() throws InterruptedException, IOException {
            loginwebpagekey = new LoginWebPage(driver);
	    }	
	        @Test(priority = 1)
			public void loginValiduser() throws Exception {
            loginwebpagekey.loginqountweb();
			}
	        @Test(priority = 2)
            public void loginInvalidUser() throws InterruptedException, IOException {
            loginwebpagekey.loginInvalidCredentials();
            loginwebpagekey.verifyErrorMessage();
            AssertJUnit.assertEquals(loginwebpagekey.verifyErrorMessage(),"Username or Password incorrect");
            }
            @Test(priority = 3)
            public void verifyLoginWithValidCred() throws InterruptedException, IOException {	
            loginwebpagekey.loginqountweb();		
            	}
}
