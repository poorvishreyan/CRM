package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class CasesPage {
@FindBy(xpath="//td[contains(text(),'Cases: ')]")private WebElement casesText;
	
	
	public CasesPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getCasesTextAddress() {
		return casesText;
	}


	public String getCasesText() {
			return casesText.getText();
	}
	

}
