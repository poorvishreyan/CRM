package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchTest {
	
	public static WebDriver driver;
	WebElement searchTB;
	
	@Given("user on Google page")
	public void user_on_google_page() {
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\RetailArcCucumber\\src\\main\\resources\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	}

	@When("user enters data")
	public void user_enters_data() {
		 searchTB = driver.findElement(By.name("q"));
	    searchTB.sendKeys("qspiders");
	}

	@And("press enter key")
	public void press_enter_key() {
		searchTB.sendKeys(Keys.ENTER);
	    
	}

	@Then("user should navigate to search results page")
	public void user_should_navigate_to_search_results_page() {
		String expTitle="qspiders - Google Search";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle,expTitle );
		Reporter.log("QSPIDERS SEARCH PAGE IS DISPLAYED, PASS", true);
	    
	}
	
}
