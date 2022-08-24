package Com.CRM.Potentials;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.PotentialsPage;

public class VerifyPotentialsTab extends BaseTest {

	@Test
	public void VerifyPotentialsTabTest() throws Throwable {
		
		
		ValidSignIn vl = new ValidSignIn();
		vl.validSignInTest();
		
		
		HomePage hp = new HomePage();
		hp.clickPotentialstab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		PotentialsPage pp = new PotentialsPage();
		wlib.elementDisplayed(pp.getPotentialsTextAddress(), "Potential Text");
		
	}
}
