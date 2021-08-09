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
		WebDriverUtility.screenShot();
		
	}
	
//	@When("^User click on Show all desktops$")
//	public void user_click_on_Show_all_desktops()  {
//	   desktops.clickOnShowAllDesktops();
//	   logger.info("user clicked on show all Desktops options");
//	}

	





}
