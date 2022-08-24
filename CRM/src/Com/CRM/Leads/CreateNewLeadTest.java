package Com.CRM.Leads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.FileLib;
import Com.CRM.GenericLib.WebDriverCommonLib;
import Com.CRM.Login.ValidSignIn;
import Com.CRM.Pages.CreateNewLeadPage;
import Com.CRM.Pages.HomePage;
import Com.CRM.Pages.LeadsDetailsPage;
import Com.CRM.Pages.LeadsPage;

@Listeners(Com.CRM.GenericLib.MyListeners.class)
public class CreateNewLeadTest extends BaseTest{
	
	@Test
	public void VerifyNewLeadCreation() throws Throwable {
		
		//login to appln and verify homepage
		ValidSignIn vs = new ValidSignIn();
		vs.validSignInTest();
		
		
		//click on lead button
		HomePage hp = new HomePage();
		hp.clickLeadsTab();
		
		//click on new lead button
		LeadsPage lp = new LeadsPage();
		lp.clickNewLeadButton();
		
		//create new lead by giving mandatory details
		CreateNewLeadPage cnl = new CreateNewLeadPage();
		FileLib flib = new FileLib();
		String firstname = flib.readExcelData(EXCEL_PATH, "Leads", 0, 1);
		String companyname = flib.readExcelData(EXCEL_PATH, "Leads", 1, 1);
		String lastname = flib.readExcelData(EXCEL_PATH, "Leads", 2, 1);
		cnl.createNewLead(firstname, companyname, lastname);
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		LeadsDetailsPage ldp = new LeadsDetailsPage();
		wlib.verify(ldp.getLeadNameText(),
				flib.readExcelData(EXCEL_PATH, "Leads", 3, 1),
				"Lead Name text");
	}
	
	
	

}
