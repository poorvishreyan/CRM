package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class InvoicesPage {
@FindBy(xpath="//td[contains(text(),'Invoices: ')]") private WebElement invoicesText;
	
	
	public InvoicesPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getInvoicesTextAddress() {
		return invoicesText;
	}

	public String getInvoicesText() {
		return invoicesText.getText();
	}
	

}
