package Com.CRM.PurchaseOrders;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.PurchaseOrdersPage;

public class VerifyPurchaseOrdersTab extends BaseTest{
	
	@Test
	public void VerifyPurchaseOrdrersTabTest() throws Throwable {
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.clickPurchaseOrdersElement();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		PurchaseOrdersPage pop = new PurchaseOrdersPage();
		wlib.elementDisplayed(pop.getPurchaseOrdersTextAddress(), "PurchaseOrders Text");
	}

}
