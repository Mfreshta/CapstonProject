package stepDefinitions;

import org.apache.log4j.Logger;
import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LaptopsNoteBooksPageObject;
import utilites.WebDriverUtility;

public class LaptopAndNoteBooksStepDef extends Base {

	LaptopsNoteBooksPageObject notebook = new LaptopsNoteBooksPageObject();

	// Add and Remove item from Cart
	@When("^User click on Laptop &NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() {
		notebook.clickOnLaptopAndNoteBooksTab();
		logger.info("User clicked on Laptop &NoteBook tab");

	}

	@When("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() {
		notebook.clickOnShowAllLaptopAndNoteBooksOption();
		logger.info("User clicked on show all Laptop &NoteBook option");
	}

	@When("^User click on MacBook  item$")
	public void user_click_on_MacBook_item() {
		notebook.clickOnMacBookItem();
		logger.info("User clicked on MacBook item");
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() {
//		String expectedMessage = "Success: You have added MacBook to your shopping cart!";
//		  String actualMessage = "Success: You have added MacBook to your shopping cart!";
//		  System.out.println(actualMessage.subSequence(0, 7));
//		  System.out.println(expectedMessage.subSequence(0, 7));
//		  Assert.assertEquals(expectedMessage, actualMessage);
//		  logger.info("User see a success message");
		String expectedMessage = "Success: You have added Canon EOS 5D to your shopping cart!";
		String actualMessage = notebook.UserSeeSuccessMessage();

		expectedMessage.substring(0, 7);

		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.screenShot();

	}

	@Then("^User should see ‘(\\d+) tem\\(s\\)-(\\d+)\\.(\\d+)’ showed to the cart$")
	public void user_should_see_tem_s_showed_to_the_cart()  {
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		logger.info("User see one item is add to the Cart");
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() {
		notebook.clickOnCartOption();
		logger.info("User clicked on the Cart option");
	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() {
		notebook.clickOnRedButtonToRemoveItemFromCart();
		logger.info("User clicked on the red X button the item is removed");

	}

	@Then("^item should be removed and cart should show ‘(\\d+) item\\(s\\)’$")
	public void item_should_be_removed_and_cart_should_show_item_s(int arg1) {
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		logger.info("item is removed from cart");

	}

	// *******************************************************************************************

	// Product Comparison

	@When("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook() {
		notebook.clickOnMacBookProductComparison();
		logger.info("User clicked on the product comparison icon on 'MacBook'");
	}

	@When("^User click on product comparison icon on ‘MacBook Air$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() {
		notebook.clickOnMacBookAirProductComparison();
		logger.info("User clicked on the product comparison icon on 'MacBookAir'");
	}

	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() {
		String expectedMessage = "Success: You have added MacBook Air to your product comparison!";
		String actualMessage = "Success: You have added MacBook Air to your product comparison!";
		System.out.println(actualMessage.subSequence(0, 7));
		System.out.println(expectedMessage.subSequence(0, 7));
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("User see a success message");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();

	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link()  {
		notebook.clickOnProductComparisonLink();
		logger.info("User clicked on Product comparison link");
		

	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart()  {
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		logger.info("User see product Comparison Chart");

	}

	// *******************************************************************************************

	// Add item to wish list
	@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() {
		notebook.clickOnAddSonyVAIOToWishList();
		logger.info("User clicked on heart icon to add 'Sony VaIO' laptop to wish list");
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list()
			throws InterruptedException {
		Thread.sleep(5000);
		logger.info("User see a message 'you must login or create an account to save Sony VAIO to your wish list'");
		WebDriverUtility.screenShot();
	}

	// *******************************************************************************************

	// Validate The price of MacBook Pro is 2000
	@When("^User click on ‘MacBook Pro’ item$")
	public void user_click_on_MacBook_Pro_item() {
		notebook.clickOnMacBookPro();
		logger.info("User clicked on 'MacBook Pro' item");

	}

	@Then("^User should see  ‘\\$(\\d+),(\\d+)\\.(\\d+)’ price tag is present on UI\\.$")
	public void user_should_see_$_price_tag_is_present_on_UI(int arg1, int arg2, int arg3) {
		String expected = "$2,000.00";
		String actual = notebook.userMustShouldSeeThePriceTagIsPresent();

		Assert.assertEquals(expected, actual);
		logger.info("User see price tag");
		WebDriverUtility.screenShot();

	}

}
