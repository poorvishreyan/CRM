package Com.CRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.CRM.GenericLib.BaseTest;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Leads']")private WebElement leadsTab;
	@FindBy(xpath="//a[text()='Accounts']") private WebElement accountsTab;
	@FindBy(xpath="//a[text()='Contacts']") private WebElement contactsTab;
	@FindBy(xpath="//a[text()='Potentials']") private WebElement potentialsTab;
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement campaignsTab;
	@FindBy(xpath="//a[text()='Reports']") private WebElement reportsTab;
	@FindBy(xpath="//a[text()='Dashboards']") private WebElement dashboardsTab;
	@FindBy(xpath="//a[text()='Forecasts']") private WebElement forecastsTab;
	@FindBy(xpath="//a[text()='Activities']") private WebElement activitiesTab;
	@FindBy(xpath="//a[text()='Products']") private WebElement productsTab;
	@FindBy(xpath="//a[text()='Cases']") private WebElement casesTab;
	@FindBy(xpath="//a[text()='Solutions']") private WebElement solutionsTab;
	@FindBy(xpath="//a[text()='Vendors']") private WebElement vendorsTab;
	@FindBy(xpath="//a[text()='Price Books']") private WebElement priceBookTab;
	@FindBy(id="scrollright") private WebElement scrollRightButton;
	@FindBy(xpath="//a[text()='Quotes']") private WebElement quotesTab;
	@FindBy(xpath="//a[text()='Sales Orders']") private WebElement salesOrdersTab;
	@FindBy(xpath="//a[text()='Purchase Orders']") private WebElement purchaseOrdersTab;
	@FindBy(xpath="//a[text()='Invoices']") private WebElement invoicesTestTab;
	
	
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getLeadstab() {
		return leadsTab;
	}

	
	public void clickLeadsTab()
	{
		leadsTab.click();
	}

	public WebElement getAccountsTab() {
		return accountsTab;
	}
	
	public void clickAccountsTab()
	{
		accountsTab.click();
	}

	public WebElement getContactsTab() {
		return contactsTab;
	}
	
	public void clickContactstab() {
		contactsTab.click();
	}

	public WebElement getPotentialstab() {
		return potentialsTab;
	}
	
	public void clickPotentialstab() {
		potentialsTab.click();
		
	}

	public WebElement getCampaignsTab() {
		return campaignsTab;
	}
	
	

	public void clickCampaignsTab() {
		campaignsTab.click();	
	}

	public WebElement getReportsTab() {
		return reportsTab;
	}
	
	public void clickReportsTab() {
		reportsTab.click();
	}

	public WebElement getDashboardsTab() {
		return dashboardsTab;
	}
	
	public void clickDashboardsTab() {
		dashboardsTab.click();
	}

	public WebElement getForecastsTab() {
		return forecastsTab;
	}
	
	public void clickForecastsTab() {
		forecastsTab.click();
	}

	public WebElement getActivitiesTab() {
		return activitiesTab;
	}
	
	public void clickActivitiesTab() {
		activitiesTab.click();
	}

	public WebElement getProductsTab() {
		return productsTab;
	}
	
	public void clickProductsTab() {
		productsTab.click();
	}

	public WebElement getCasesTab() {
		return casesTab;
	}
	
	public void clickCasesTab() {
		casesTab.click();
	}

	public WebElement getSolutionsTab() {
		return solutionsTab;
	}

	public void cllickSolutionsTab() {
		solutionsTab.click();
	}

	public WebElement getVendorsTab() {
		return vendorsTab;
	}

	public void clickVendorsTab() {
		vendorsTab.click();
	}

	public WebElement getPriceBookTab() {
		return priceBookTab;
	}

	public void clickPriceBookTab() {
		priceBookTab.click();
	}

	
	public WebElement getScrollRightButton() {
		return scrollRightButton;
	}

	public void clickScrollRightButton() {
		scrollRightButton.click();
	}
	public WebElement getQuotesTab() {
		return quotesTab;
	}

	public void clickQuotesTab() {
		quotesTab.click();
	}

	public void clickQuotesElement()
	{
		for(int i=0;i<=20;i++)
		{
			
			if(getQuotesTab().isDisplayed())
			{
				clickQuotesTab();
				break;
			}
			else
			{
				clickScrollRightButton();
			}
		}
	}
	
	public WebElement getSalesOrdersTab() {
		return salesOrdersTab;
	}

	public void clickSalesOrdersTab() {
		salesOrdersTab.click();
	}

	public void clickSalesOrdersElement() {
		for(int i=0;i<=20;i++)
		{
			if(getSalesOrdersTab().isDisplayed())
			{
				clickSalesOrdersTab();
				break;
			}
			else
			{
				clickScrollRightButton();
			}
		}
	}
	public WebElement getPurchaseOrdersTab() {
		return purchaseOrdersTab;
	}

	public void clickPurchaseOrdersTab() {
		purchaseOrdersTab.click();
	}

	public void clickPurchaseOrdersElement() {
		for(int i=0;i<=20;i++)
		{
			if(getPurchaseOrdersTab().isDisplayed()){
				clickPurchaseOrdersTab();
				break;
			}
			else {
				clickScrollRightButton();
			}
		}
	}
	public WebElement getInvoicesTab() {
		return invoicesTestTab;
	}

	public void clickInvoicesTab() {
		invoicesTestTab.click();
	}

	public void clickInvoicesElement() {
		for(int i=0;i<=40;i++) 
		{
			if(getInvoicesTab().isDisplayed()) {
				clickInvoicesTab();
				break;
			}
			else {
				clickScrollRightButton();
			}
		}
	}
	
	
}
