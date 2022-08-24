package Com.CRM.Activities;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.ActivitiesPage;
import Com.CRM.Pages.HomePage;

public class VerifyActivitiesTab extends BaseTest{
	
	@Test
	public void VerifyActivitiesTabTest() throws Throwable {
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		
		HomePage hp = new HomePage();
		hp.clickActivitiesTab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		ActivitiesPage ap = new ActivitiesPage();
		wlib.elementDisplayed(ap.getActivitiesTextAddress(), "Activities Text");
	}

}
