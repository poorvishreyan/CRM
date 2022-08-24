package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class CampaignPage {
	
	@FindBy(xpath="//td[contains(text(),'Campaigns: ')]")private WebElement campaignText;
	
	public CampaignPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCampaignTextAddress() {
		return campaignText;
	}

	public String getCampaignTest() {
		return campaignText.getText();
	}

	
}
