package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class ForecastsPage {

@FindBy(xpath="//td[contains(text(),'Forecasts: ')]") private WebElement forecastsText;
	
	
	public ForecastsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getForecastsTextAddress() {
		return forecastsText;
	}

	public String getForecastsText() {
		return forecastsText.getText();
	}
	
}
