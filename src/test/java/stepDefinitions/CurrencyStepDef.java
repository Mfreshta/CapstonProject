package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.HomePageObject;

public class CurrencyStepDef extends Base {

	HomePageObject currency = new HomePageObject();

	@When("^User click on Currency$")
	public void user_click_on_Currency() {
		currency.clickOnCurrency();
		logger.info("User Clicked on currency");

	}

	@When("^User Chose Euro from dropdown$")
	public void user_Chose_Euro_from_dropdown() {
		currency.userSelectEuroFromDropDown();
		logger.info("User Chosed Euro from dropdown");
	}

	@Then("^currency value should change to Euro$")
	public void currency_value_should_change_to_Euro() {
		String expacted = "€";
		String actual = currency.currencyValueIsChanged();

		Assert.assertEquals(expacted, actual);
	}

}
