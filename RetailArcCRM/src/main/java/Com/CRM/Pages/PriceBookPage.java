package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class PriceBookPage {
@FindBy(xpath="//td[contains(text(),'Price Books: ')]") private WebElement pricebookPriceText;
	
	
	public PriceBookPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getPricebookPriceTextAddress() {
		return pricebookPriceText;
	}

	public String getPricebookPriceText() {
		return pricebookPriceText.getText();
	}
	

}
