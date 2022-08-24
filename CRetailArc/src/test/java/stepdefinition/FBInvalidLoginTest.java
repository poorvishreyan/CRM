package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBInvalidLoginTest {
	
	public static WebDriver driver;
	
	@Given("^user on FB login Page$")
	public void user_on_fb_login_page() {
	    System.setProperty("webdriver.chrome.driver","D:\\\\selenium files\\\\RetailArcCucumber\\\\src\\\\main\\\\resources\\\\drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	@When("^users enters username (.*)$")
	public void users_enters_username_shreyan(String un) {
		driver.findElement(By.id("email")).sendKeys(un);
	   
	}

	@And("^user enters password (.*)$")
	public void user_enters_password_abcd(String pw) {
		driver.findElement(By.id("pass")).sendKeys(pw);
	   
	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.name("login")).click();
	   
	}

	@Then("^error message should be displayed$")
	public void error_message_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//div[@class='_9ay7']")).isDisplayed())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	    
	}

	    
	}
	
