package Coom.CRM.Campaign;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.CampaignPage;
import Com.CRM.Pages.HomePage;

public class VerifyCampaign extends BaseTest{

	@Test
	public void VerifyCampaignTest() throws Throwable {
		
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
	
		HomePage hp = new HomePage();
		hp.clickCampaignsTab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		CampaignPage cp = new CampaignPage();
		
		wlib.elementDisplayed(cp.getCampaignTextAddress(), "Campaign Text");
	}
}
