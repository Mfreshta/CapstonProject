package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LoginPageObject;
import utilites.WebDriverUtility;

public class EditYourAccountInfoStepDef extends Base{
	
	
	LoginPageObject editAccount = new LoginPageObject();
	
	
	@When("^User click on ‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link()  {
		editAccount.clickOnEditAccountInformation();
		logger.info("User clicked on ‘Edit your account information’ link");
	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable info) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<Map<String, String>> dataValue = info.asMaps(String.class, String.class);
		editAccount.enterFirstName(dataValue.get(0).get("firstname"));
		WebDriverUtility.screenShot();
		editAccount.enterLastName(dataValue.get(0).get("lastname"));
		WebDriverUtility.screenShot();
		editAccount.enterEmail(dataValue.get(0).get("email"));
		WebDriverUtility.screenShot();
		editAccount.enterTelePhoneNumber(dataValue.get(0).get("telephone"));
		logger.info("User modified the information");
		
	}

//	@Then("^User should see a message ‘Success: Your account has been successfully updated\\.’$")
//	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated(String message)  {
//	    
//	}
	
	

}
