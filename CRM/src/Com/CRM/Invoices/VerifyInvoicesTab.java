package Com.CRM.Invoices;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.InvoicesPage;

public class VerifyInvoicesTab extends BaseTest{
	
	@Test
	public void VerifyInvoiceTabTest() throws Throwable {
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.clickInvoicesElement();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		InvoicesPage ip = new InvoicesPage();
		wlib.elementDisplayed(ip.getInvoicesTextAddress(), "Invoices Text");
	}

}
