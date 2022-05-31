package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class PurchaseOrdersPage {
@FindBy(xpath="//td[contains(text(),'Purchase Orders: ')]") private WebElement purchaseOrdersText;
	
	
	public PurchaseOrdersPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getPurchaseOrdersTextAddress() {
		return purchaseOrdersText;
	}

	public String getPurchaseOrdersText() {
		return purchaseOrdersText.getText();
	}
	

}
