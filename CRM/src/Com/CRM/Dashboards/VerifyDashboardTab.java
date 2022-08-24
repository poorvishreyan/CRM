package Com.CRM.Dashboards;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.DashboardsPage;
import Com.CRM.Pages.HomePage;

public class VerifyDashboardTab extends BaseTest{
	
	@Test
	public void VerifyDashboardsTabTest() throws Throwable {
		
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.clickDashboardsTab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		DashboardsPage dp = new DashboardsPage();
		wlib.elementDisplayed(dp.getDashboardTextAddress(), "Dashboard Text");
		
	}
	

}
