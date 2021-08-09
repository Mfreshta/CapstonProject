package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DestopsPageObject;
import utilites.WebDriverUtility;

public class CanonAddToCartStepDef extends Base{
	
	DestopsPageObject canon = new DestopsPageObject();
	
	
	// Canon Add to Cart
	@When("^User click  ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws InterruptedException  {
	   canon.clickAddToCartCanon();
	   logger.info("Use clicked on ADD TO CART");
	   Thread.sleep(2000);
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws InterruptedException  {
	   canon.userSelectRedColorFromDropDown();
	   logger.info("Use selected RED color");
	   Thread.sleep(2000);
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart() {
	   String expectedMessage = "Success: You have added Canon EOS 5D to your shopping cart!";
	   String actualMessage = canon.UserSeeSuccessMessage();
	   
	   expectedMessage.substring(0, 7); 
	   
	   Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.screenShot();
		logger.info("Success message displayed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
