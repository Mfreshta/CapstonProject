package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LoginPageObject;
import utilites.WebDriverUtility;

public class RetailPageStepDef extends Base{

	LoginPageObject retail = new LoginPageObject();
	
	
	@Given("^User click  on MyAccount$")
	public void user_click_on_MyAccount()  {
		retail.clickOnMyAccount();
		logger.info("User clicked on MyAccount");
	  
	}

//	@When("^User enter username 'ahmed@tekschool.us\\.us' and password 'ahmed123'$")
//	public void user_enter_username_eagles_tekschool_us_and_password_eagles(String email, String password) throws InterruptedException  {
//		retail.enterEmail(email);
//		logger.info("user entered email");
//		retail.enterPassword(password);
//		logger.info("user entered password");
//		Thread.sleep(2000);
//		WebDriverUtility.screenShot();
//	}
	
	@When("^User enter username 'ahmed@tekschool\\.us' and password 'ahmed(\\d+)'$")
	public void user_enter_username_ahmed_tekschool_us_and_password_ahmed(int arg1)   {
		retail.enterEmail("ahmed@tekschool.us");
		logger.info("user entered email");
		retail.enterPassword("ahmed123");
		logger.info("user entered password");
		//WebDriverUtility.wait(3000);
		//WebDriverUtility.screenShot();
	}

	@Then("^User should be logged in to MyAccount dashboard$")
	public void user_should_be_logged_in_to_MyAccount_dashboard()  {
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		logger.info("user logged to myAccount Dashboard");
	}

	@When("^User click on ‘Register for an Affiliate Account’ link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link()  {
		retail.clickOnRegisterAffiliateAccount();
		logger.info("User clicked on 'Register for an Affiliate Account'");
		
	    
	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable info)   {
	   
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		retail.enterCompanyName(dataValues.get(0).get("company"));
		retail.enterWebSite(dataValues.get(0).get("webSite"));
		retail.enterTaxID(dataValues.get(0).get("taxID"));
		retail.selectCheckBox();
		logger.info("User filled the affiliate information form");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		
	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box()  {
		retail.ClickOnAboutUs();
		logger.info("user checked on About us check box");
	}

	@When("^User click on Continue button$")
	public void user_click_on_Continue_button()  {
		retail.ClickOnContinueButton();
		logger.info("user clicked on continue button");
		WebDriverUtility.wait(3000);
	   
	}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message()  {
		String expectedMessage = "Success: Your account has been successfully updated.";
		String actualMessage = retail.UserShouldSeeSuccessMessage();
		
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("success message is displayed");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	    
	}
	
	
	//****************************************************************************************
	
	// Edit your Affiliate Information
	

	@When("^User click on ‘Edit your affiliate information’ link$")
	public void user_click_on_Edit_your_affiliate_informationlink()  {
		retail.clickOnEditYourAffiliateInformation();
		logger.info("user clicked on Edit your affiliate information'");
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button()  {
		retail.selectCheckBoxBank();
		logger.info("user clicked on bank Transfer radio button'");
	   
	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable info)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		retail.enterBankName(dataValues.get(0).get("bankName"));
		retail.enterBranchNumber(dataValues.get(0).get("abaNumber"));
		retail.enterSwiftCode(dataValues.get(0).get("swiftCode"));
		retail.enterAccountName(dataValues.get(0).get("accountName"));
		retail.enterAccountNumber(dataValues.get(0).get("accountNumber"));
		logger.info("User filled Bank information form");
		WebDriverUtility.screenShot();
	}
	
	
	// Edit your account information

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
