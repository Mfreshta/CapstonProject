package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class RegisterPageObject extends Base {

	public RegisterPageObject() {
		PageFactory.initElements(driver, this);
	}

	// My Account
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	// Register
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	@FindBy(id = "input-firstname")
	private WebElement firstName;
	@FindBy(id = "input-lastname")
	private WebElement lastName;
	@FindBy(id = "input-email")
	private WebElement email;
	@FindBy(id = "input-telephone")
	private WebElement telephone;
	@FindBy(id = "input-password")
	private WebElement password;
	@FindBy(id = "input-confirm")
	private WebElement confirmPassword;
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement yesSubscribe;
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement noSubscribe;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicy;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath ="//h1[text()='Your Account Has Been Created!']")
	private WebElement successMessage;


	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}

	public void clickOnRegisterOption() {
		WebDriverUtility.clickOnElement(register);
	}

	public void enterFirstName(String fName) {
		WebDriverUtility.enterValue(firstName, fName);
	}

	public void enterLastName(String lName) {
		WebDriverUtility.enterValue(lastName, lName);
	}

	public void enterRegistrationEmail(String emailvalue) {
		WebDriverUtility.enterValue(email, emailvalue);
	}

	public void enterTelephone(String telephoneValue) {
		WebDriverUtility.enterValue(telephone, telephoneValue);
	}

	public void enterRegistrationPassword(String passwordValue) {
		WebDriverUtility.enterValue(password, passwordValue);
	}

	public void enterConfirmPassword(String confirmPasswordValue) {
		WebDriverUtility.enterValue(confirmPassword, confirmPasswordValue);

	}

	public void subscribe(String subscribeValue) {
		if (subscribeValue.equalsIgnoreCase("yes")) {
			if (!yesSubscribe.isSelected())
				WebDriverUtility.clickOnElement(yesSubscribe);
		} else
			if (!noSubscribe.isSelected())
			WebDriverUtility.clickOnElement(noSubscribe);
	}
	
	public void clickOnPrivacyPolicy() {
		WebDriverUtility.clickOnElement(privacyPolicy);
	}
	
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}
	
	public String accountCreationMessage() {
		String message = successMessage.getText();
		return message;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
