package stepDefinitions;




import org.junit.Assert;

import core.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjectRepository.HomePageObject;
import utilites.WebDriverUtility;

public class EmptyShoppingCartStepDef extends Base {

	HomePageObject cart = new HomePageObject();

	@When("^User click on shopping cart$")
	public void user_click_on_shopping_cart() {
		cart.clickOnShoppingCart();
		logger.info("User clicked on shopping cart");
		WebDriverUtility.wait(3000);

	}

	@Then("^“Your shopping cart is empty!” message should display$")
	public void your_shopping_cart_is_empty_message_should_display() {
		String expacted = "Your shopping cart is empty!";
		String actual = cart.yourShoppingCartIsEmpty();
		Assert.assertEquals(expacted, actual);
		WebDriverUtility.wait(3000);
		
	}

}
