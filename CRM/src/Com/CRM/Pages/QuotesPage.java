package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class QuotesPage {
@FindBy(xpath="//td[@class='title hline']") private WebElement QuotesText;
	
	
	public QuotesPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getQuotesTextAddress() {
		return QuotesText;
	}

	public String getQuotesText() {
		return QuotesText.getText();
	}
	

}
