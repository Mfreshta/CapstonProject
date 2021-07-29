package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.RegisterPageObject;
import utilites.WebDriverUtility;

public class RegisterTestStepDefination extends Base{

	
	RegisterPageObject register = new RegisterPageObject();
	
	
	@When("^User click on Register option$")
	public void user_click_on_Register_option()  {
		register.clickOnRegisterOption();
		logger.info("user clicked on Register option");
	   
	}

	@When("^User fill the Registration form with below information$")
	public void user_fill_the_Registration_form_with_below_information(DataTable info) {
	// Cucumber DataTables has a return of List<Map<String,String>> This is when your cucumber
	// DataTable has headers. When cucumber DataTable does not has headers we will use List<List<index>
	List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
	register.enterFirstName(dataValues.get(0).get("firstName"));
	register.enterLastName(dataValues.get(0).get("lastName"));
	register.enterRegistrationEmail(dataValues.get(0).get("eMail"));
	register.enterTelephone(dataValues.get(0).get("telephone"));
	register.enterRegistrationPassword(dataValues.get(0).get("password"));
	register.enterConfirmPassword(dataValues.get(0).get("passwordConfirm"));
	register.subscribe(dataValues.get(0).get("Subscribe"));
	logger.info("User filled the information form");
	
	}

	@When("^User accept the privacy and policy$")
	public void user_accept_the_privacy_and_policy()  {
		register.clickOnPrivacyPolicy();
	    logger.info("user accepted privacy and policy");
	    WebDriverUtility.screenShot();
	    
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button()  {
		register.clickOnContinueButton();
	   logger.info("user clicked on continue button");
	}

	@Then("^User should be registered in Retail Website$")
	public void user_should_be_registered_in_Retail_Website()  {
	  String expectedMessage = "Your Account Has Been Created!";
	  String actualMessage = register.accountCreationMessage();
	  Assert.assertEquals(expectedMessage, actualMessage);
	  logger.info("user Account has been created");
	  WebDriverUtility.screenShot();
	    
	}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
