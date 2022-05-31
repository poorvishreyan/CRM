package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class CreateNewLeadPage {
	
	@FindBy(name="property(First Name)") private WebElement firstNameTextBox;
	@FindBy(name="property(Company)") private WebElement companyTextBox;
	@FindBy(name="property(Last Name)") private WebElement lastNameTextBox;
	@FindBy(xpath="//td[contains(text(),' Create Lead')]/ancestor::table/following-sibling::table[2]//input[@value='Save']")private WebElement saveButton;
	
	public CreateNewLeadPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}
	
	public WebElement getCompanyTextBox() {
		return companyTextBox;
	}
	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}
	
	public WebElement getSaveButtonAddress() {
		return saveButton;
	}
	
	
	public void typeFirstName(String firstname) {
		firstNameTextBox.sendKeys(firstname);
	}
	
	public void typeCompanyName(String company) {
		companyTextBox.sendKeys(company);
	}
	public void typeLastName(String lastname) {
		lastNameTextBox.sendKeys(lastname);
	}
	public void clickSaveButton() {
		saveButton.click();
	}
	
	public void createNewLead(String firstname, String company, String lastname) {
		firstNameTextBox.sendKeys(firstname);
		companyTextBox.sendKeys(company);
		lastNameTextBox.sendKeys(lastname);
		saveButton.click();
	}
	
}
