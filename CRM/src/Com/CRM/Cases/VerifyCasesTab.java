package Com.CRM.Cases;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.CasesPage;
import Com.CRM.Pages.HomePage;

public class VerifyCasesTab extends BaseTest {
	
	@Test
	public void VerifyCasesTabTest() throws Throwable {
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.clickCasesTab();
		
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		CasesPage cp = new CasesPage();
		wlib.elementDisplayed(cp.getCasesTextAddress(), "Cases Text");
	}

}
