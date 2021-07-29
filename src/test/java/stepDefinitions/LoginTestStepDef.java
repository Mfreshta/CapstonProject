package stepDefinitions;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LoginPageObject;
import utilites.WebDriverUtility;

public class LoginTestStepDef extends Base{
	
	// create object of Login Page Object in order to access its methods
	
	LoginPageObject login = new LoginPageObject();
	
	// every Step in Scenario needs to have
	// a method associated with in StepDefinitons class
	@Given("^User is on Retail Website$")
	public void user_is_on_Retail_Website() {
		openBrowser();
		logger.info("Retail Website is opened");
		WebDriverUtility.screenShot();
		
	}
	
	@When("^User click on MyAccount$")
	public void user_click_on_MyAccount() {
		login.clickOnMyAccount();
		logger.info("User clicked on MyAccount");
	}
	
	@And("^User click on Login$")
	public void user_click_on_Login() {
		login.clickOnLogin();
		logger.info("User Clicked on Login");
		
	}
	
	// in cucumber stepDefinitions we need to pass value as a parameter
	//we need to replace values with (.+)
	// we nned to pass parameters in our java methods as well
	@And("^User enter userName '(.+)' and password '(.+)'$")
	public void user_enter_userName_and_password(String userName, String password) {
		login.enterEmail(userName);
		logger.info("user entered email");
		login.enterPassword(password);
		logger.info("user entered password");
		WebDriverUtility.screenShot();
	}
	
	@And("^User click on Login button$")
	public void user_click_on_Login_button() {
		login.clickOnLoginButton();
		logger.info("user clicked on login button");
	}
	
	@Then("^User should be logged in to myAccount Dashboard$")
	public void user_should_be_logged_in_to_myAccount_Dashboard() {
		WebDriverUtility.wait(5000);
		WebDriverUtility.screenShot();
		logger.info("user logged to myAccount Dashboard");
	}
	

}



