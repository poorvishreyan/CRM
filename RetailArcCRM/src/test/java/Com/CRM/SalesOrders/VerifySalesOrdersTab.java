package Com.CRM.SalesOrders;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.SalesOrdersPage;

public class VerifySalesOrdersTab extends BaseTest{
	
	@Test
	public void VerifySalesOrdersTabTest() throws Throwable {
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.clickSalesOrdersElement();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		SalesOrdersPage sop = new SalesOrdersPage();
		wlib.elementDisplayed(sop.getSalesOrdersTextAddress(), "SalesOrders Text");
	}

}
