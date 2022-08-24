package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class SignInPage {
	
	@FindBy(id="userName") private WebElement userNameTextBox;
	@FindBy(id="passWord") private WebElement passwordTextBox;
	@FindBy(xpath="//input[@title='Sign In']") private WebElement signInButton;



	public SignInPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public void login(String un, String pw)
	{
		userNameTextBox.sendKeys(un);
		passwordTextBox.sendKeys(pw);
		signInButton.click();
		
	}

	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	
	
	
	
}
