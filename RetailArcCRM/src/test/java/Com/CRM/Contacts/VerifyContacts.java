package Com.CRM.Contacts;

import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.ContactsPage;
import Com.CRM.Pages.HomePage;

public class VerifyContacts extends BaseTest{
	
	@Test
	public void VerifyContactsPage() throws Throwable{
		
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		
		HomePage hp = new HomePage();
		hp.clickContactstab();
		
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		ContactsPage cp = new ContactsPage();
		wlib.elementDisplayed(cp.getContactsTextAddress(), "Contacts Text");
	}

}
