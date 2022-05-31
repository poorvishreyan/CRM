package Com.CRM.Leads;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.LeadsPage;
//open browser enter url verify login page
public class VerifyLeadsTab extends BaseTest{

@Test
	public void verifyLeadstabTest() throws Throwable
	{
	//Login to Appln and verify home page
	ValidSignIn vs= new ValidSignIn();
	vs.validSignInTest();
	
	//click on Leads tab
	HomePage hp = new HomePage();
	hp.clickLeadsTab();
	
	//verify Leads page
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	LeadsPage ldp = new LeadsPage();
	wlib.elementDisplayed(ldp.getLeadsTextAddress(), "Leads Text");
	}









}
