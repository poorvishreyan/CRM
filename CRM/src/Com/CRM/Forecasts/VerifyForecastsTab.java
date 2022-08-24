package Com.CRM.Forecasts;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.ForecastsPage;
import Com.CRM.Pages.HomePage;

public class VerifyForecastsTab extends BaseTest {
	
	@Test
	public void VerifyForecastsTabTest() throws Throwable {
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		HomePage hp = new HomePage();
		hp.clickForecastsTab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		ForecastsPage fp = new ForecastsPage();
		wlib.elementDisplayed(fp.getForecastsTextAddress(), "Forecasts Text");
	}
	

}
