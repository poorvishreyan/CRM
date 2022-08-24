package Com.CRM.Login;

import javax.security.auth.spi.LoginModule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.FileLib;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Pages.SignInPage;

@Listeners(Com.CRM.GenericLib.MyListeners.class)
public class ValidSignIn extends BaseTest{
	
	
	
	public void validSignInTest() throws Throwable {
		
		//open the browser
		//enter the test url
		//verify signin page displayed
		
		FileLib flib = new FileLib();
		
		//SignIn to Appln
		
		SignInPage sip= new SignInPage();
		sip.login(flib.readPropertyData(PROP_PATH, "username"), 
				flib.readPropertyData(PROP_PATH, "password"));
		
		//verify HomePage is Displayed
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.waitforPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		
		wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "homeTitle") , "Home Page");
		
		
	}

}
