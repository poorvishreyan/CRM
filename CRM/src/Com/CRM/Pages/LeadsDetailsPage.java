package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;
import Com.CRM.GenericLib.WebDriverCommonLib;

public class LeadsDetailsPage {
	
	@FindBy(xpath="//td[contains(text(), 'Lead Name')]/following-sibling::td") private WebElement leadName;
	
	public LeadsDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getLeadName() {
		return leadName;
	}
	public String getLeadNameText() {
		return leadName.getText();
		
	}
	
	
	
}
