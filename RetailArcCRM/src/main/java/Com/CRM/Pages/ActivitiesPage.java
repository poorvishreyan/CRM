package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class ActivitiesPage {
@FindBy(xpath="//td[contains(text(),'Activities: ')]")private WebElement activitiesText;
	
	
	public ActivitiesPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getActivitiesTextAddress() {
		return activitiesText;
	}


	public String getActivitiesText() {
			return activitiesText.getText();
	}
	

}
