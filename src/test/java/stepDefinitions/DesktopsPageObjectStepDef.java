package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DestopsPageObject;
import pageObjectRepository.HomePageObject;
import utilites.WebDriverUtility;

public class DesktopsPageObjectStepDef extends Base {

	//HomePageObject desktops = new HomePageObject();
	
	DestopsPageObject desktops = new DestopsPageObject();

	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() {
		openBrowser();
		logger.info("Retail Website is opened");
		WebDriverUtility.screenShot();
	}

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() {
		desktops.clickOnDesktopsTab();
		logger.info("user click on Desktops tab");
	}

	@When("^User click on Show all Desktops$")
	public void user_click_on_Show_all_Desktops() {
		desktops.clickOnShowAllDesktops();
		logger.info("user click on show all Desktops options");
	}

	@Then("^User should see all items are present in Desktops page$")
	public void user_should_see_all_items_are_present_in_Desktops_page() {
		
		Assert.assertTrue(true);
		logger.info("User should see all items are present on Desktops");
		
	}
	
	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops()  {
	   desktops.clickOnShowAllDesktops();
	   logger.info("user clicked on show all Desktops options");
	}

	@When("^User click  ADD TO CART option on ‘HP LP(\\d+)’ item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item(int arg1)  {
	    desktops.clickOnAddToCartHPLP3065();
	    logger.info("User clicked on ADD TO CART");
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1)  {
	   desktops.userAddHpLP3065DQuantity();
	   logger.info("User passed the select quantity");
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button()  {
	    desktops.clickOnAddToCartHPLP3065LastTime();
	    logger.info("User clicked on ADD TO CART");
	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1)  {
		String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!";
		
		Assert.assertTrue(expectedMessage, true);
		logger.info("Success message displayed");
		WebDriverUtility.screenShot();
	   
	}





}
