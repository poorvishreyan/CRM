package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class VendorsPage {
@FindBy(xpath="//td[contains(text(),'Vendors: ')]") private WebElement vendorsText;
	
	
	public VendorsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getVendorsTextAddress() {
		return vendorsText;
	}

	public String getVendorsText() {
		return vendorsText.getText();
	}
	

}
