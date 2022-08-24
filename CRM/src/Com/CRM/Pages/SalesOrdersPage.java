package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class SalesOrdersPage {

@FindBy(xpath="//td[contains(text(),'Sales Orders: ')]") private WebElement salesOrdersText;
	
	
	public SalesOrdersPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getSalesOrdersTextAddress() {
		return salesOrdersText;
	}

	public String getSalesOrdersText() {
		return salesOrdersText.getText();
	}
	
}
