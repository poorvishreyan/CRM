package Com.CRM.Solutions;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.SolutionsPage;

public class VerifySolutionsTab extends BaseTest{
	
	@Test
	public void VerifySolutionsTabTest() throws Throwable{
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.cllickSolutionsTab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		SolutionsPage sp = new SolutionsPage();
		wlib.elementDisplayed(sp.getSolutionsTextAddress(), "Solutions Text");
		
	}

}
