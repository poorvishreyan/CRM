package Com.CRM.Reports;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.ReportsPage;

public class VerifyReportsTab extends BaseTest{
	
	@Test
	public void verifyReportsTabTest() throws Throwable
	{
	//Login to Appln and verify home page
	ValidSignIn vs= new ValidSignIn();
	vs.validSignInTest();
	
	//click on Leads tab
	HomePage hp = new HomePage();
	hp.clickReportsTab();
	
	//verify Leads page
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	ReportsPage rp= new ReportsPage();
	wlib.elementDisplayed(rp.getReportsTextAddress(), "Reports Text");
	}


}
