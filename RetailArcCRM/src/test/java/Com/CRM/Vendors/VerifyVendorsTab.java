package Com.CRM.Vendors;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.VendorsPage;

public class VerifyVendorsTab extends BaseTest{
	
	@Test
	public void VerifyVendorsTabTest() throws Throwable {
		
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.clickVendorsTab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		VendorsPage vp = new VendorsPage();
		wlib.elementDisplayed(vp.getVendorsTextAddress(), "Vendors Text");
	}

}
