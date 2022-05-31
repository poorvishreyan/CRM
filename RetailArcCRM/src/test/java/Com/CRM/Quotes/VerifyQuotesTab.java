package Com.CRM.Quotes;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.QuotesPage;

public class VerifyQuotesTab extends BaseTest {
	
	@Test
	public void VerifyQuotesTabTest() throws Throwable {
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.clickQuotesElement();
		
	
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		QuotesPage qp = new QuotesPage();
		wlib.elementDisplayed(qp.getQuotesTextAddress(), "Quotes Text");
			}
		
	}

