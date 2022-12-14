package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class LeadsPage {
	
	@FindBy(xpath="//td[contains(text(), 'Leads: ')]") private WebElement leadsText;
	@FindBy(xpath="//input[@value='New Lead']") private WebElement newLeadButton;

	public LeadsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getLeadsTextAddress() {
		return leadsText;
	}
	
	public String getLeadsText()
	{
		return leadsText.getText();
	}

	public WebElement getNewLeadButton() {
		return newLeadButton;
	}
	
	public void clickNewLeadButton() {
		newLeadButton.click();
	}
}
