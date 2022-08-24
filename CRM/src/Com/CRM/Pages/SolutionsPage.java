package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class SolutionsPage {
@FindBy(xpath="//td[contains(text(),'Solutions: ')]")private WebElement solutionsText;
	
	
	public SolutionsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getSolutionsTextAddress() {
		return solutionsText;
	}


	public String getSolutionsText() {
			return solutionsText.getText();
	}
	

}
