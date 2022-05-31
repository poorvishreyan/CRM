package Com.CRM.Accounts;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.AccountsPage;
import Com.CRM.Pages.HomePage;

public class VerifyAccountsTab extends BaseTest{
	
	@Test
	public void VerifyAccountsTabTest() throws Throwable {
		//Login to appln
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		//click on Accounts tab
		HomePage hp =new HomePage();
		hp.clickAccountsTab();
		
		//verify accounts text is displayed
		AccountsPage ap = new AccountsPage();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.elementDisplayed(ap.getAccountsTextAddress(), "Accounts Text");
		
	}

}
