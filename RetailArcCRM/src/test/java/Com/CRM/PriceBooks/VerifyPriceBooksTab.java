package Com.CRM.PriceBooks;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.PriceBookPage;

public class VerifyPriceBooksTab extends BaseTest{
	
	@Test
	public void VerifyPriceBooksTabTest() throws Throwable {
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.clickPriceBookTab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		PriceBookPage pbp = new PriceBookPage();
		wlib.elementDisplayed(pbp.getPricebookPriceTextAddress(), "PriceBook Text");
	}

}
