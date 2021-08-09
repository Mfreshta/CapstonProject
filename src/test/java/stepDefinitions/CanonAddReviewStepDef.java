package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DestopsPageObject;
import utilites.WebDriverUtility;

public class CanonAddReviewStepDef extends Base {

	DestopsPageObject review = new DestopsPageObject();
	


	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item(int arg1) {
		review.clickOnCanon();
		logger.info("User clicked on Canon");

	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws InterruptedException {
		review.clickOnReviewLink();
		logger.info("User clicked on Review Link");
		Thread.sleep(3000);
	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable info)  {

		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);

		review.enterYourName(dataValues.get(0).get("yourname"));
		WebDriverUtility.wait(3000);
		review.enterYourReview(dataValues.get(0).get("yourReview"));
		WebDriverUtility.wait(3000);
		review.choseRating(dataValues.get(0).get("Rating"));
		logger.info("User Filled the review information");
	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() {
		review.UserClickOnContinueButton();
		logger.info("User clicked on Continue Button");
	}

	@Then("^User should see a message with ‘Thank you for your review\\. It has been submitted to the webmaster for approval\\.”$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()
			throws Throwable {
		String expectedMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
		String actualMessage = review.UserShouldSeeReviewMessage();

		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.screenShot();
		logger.info("Success message displayed");

	}

}
