package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class DashboardsPage {
	
@FindBy(xpath="//td[text()='Dashboards']")private WebElement dashboardsText;
	
	
	public DashboardsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getDashboardTextAddress() {
		return dashboardsText;
	}


	public String getDashboardText() {
			return dashboardsText.getText();
	}
	
	

}
