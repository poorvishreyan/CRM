package Com.CRM.Products;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.ProductsPage;

public class VerifyProductsTab extends BaseTest{
	
	@Test
	public void VerifyProductsTabTest() throws Throwable {
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.clickProductsTab();
		
		
		WebDriverCommonLib wlib= new WebDriverCommonLib();
		ProductsPage pp = new ProductsPage();
		wlib.elementDisplayed(pp.getProductsTextAddress(), "Products Text");
	}

}
