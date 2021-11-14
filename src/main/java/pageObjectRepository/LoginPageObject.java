package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class LoginPageObject extends Base {
	
	// we create a constructor and inside the constructor we will
	// define PageFactory class and call InitLements method 
	// to initialize all variables of this class
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}

	//PageFactory provides @FindBy annotation to find UI elements 
	// driver.findElement(by.id('123)); 
	// @FindBy(id ='123')
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(xpath ="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath ="//a[contains(text(),'Register for an affiliate account')]")
	private WebElement registerAffiliateAccount;
	
	@FindBy(id ="input-company")
	private WebElement companyName;
	@FindBy(xpath ="//input[@id='input-website']")
	private WebElement webSite;
	@FindBy(id ="input-tax")
	private WebElement taxID;
	@FindBy(xpath ="//input[@value='cheque']")
	private WebElement cheque;
	@FindBy(xpath ="//input[@value='paypal']")
	private WebElement payPal;
	@FindBy(xpath ="//input[@value='bank']")
	private WebElement bankTransfer;
	@FindBy(id ="input-bank-name")
	private WebElement bankName;
	@FindBy(id ="input-bank-branch-number")
	private WebElement branchNumber;
	@FindBy(id ="input-bank-swift-code")
	private WebElement swiftCode;
	@FindBy(id ="input-bank-account-name")
	private WebElement accountNumber;
	@FindBy(id ="input-bank-account-number")
	private WebElement accountName;
	
	
	@FindBy(id ="input-cheque")
	private WebElement chequePayeeName;
	@FindBy(xpath ="//input[@name='agree']")
	private WebElement aboutUs;
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath ="//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessage;
	
	@FindBy(xpath ="//*[contains(text(),'Edit your affiliate information')]")
	private WebElement editYourAffiliateInformation;
	
	// edit account information
	@FindBy(xpath ="//a[contains(text(),'Edit your account information')]")
	private WebElement editYourAccountInformation;
	@FindBy(id ="input-firstname")
	private WebElement firstNameField;
	@FindBy(id ="input-lastname")
	private WebElement lastNamefield;

	@FindBy(id ="input-telephone")
	private WebElement telePhoneNumber;
	
	
	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}
	
	public void clickOnLogin() {
		WebDriverUtility.clickOnElement(login);
	}
	
	public void enterEmail(String email) {
		WebDriverUtility.clearText(emailField);
		WebDriverUtility.enterValue(emailField, email);
	}
	
	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);
	}
	
	public void clickOnLoginButton() {
		WebDriverUtility.clickOnElement(loginButton);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Register wit Affiliate Account
	public void clickOnRegisterAffiliateAccount() {
		WebDriverUtility.clickOnElement(registerAffiliateAccount);
	}
	
	public void enterCompanyName(String cName) {
		WebDriverUtility.enterValue(companyName, cName);
	}
	
	public void enterWebSite(String wSite) {
		WebDriverUtility.enterValue(webSite, wSite);
	}
	
	public void enterTaxID(String tID) {
		WebDriverUtility.enterValue(taxID, tID);
	}
	
	public void selectCheckBox() {
		WebDriverUtility.clickOnElement(cheque);
	}
	
	public void enterChequePayeeName(String cpName) {
		WebDriverUtility.enterValue(chequePayeeName, cpName);
	}
	
	public void ClickOnAboutUs() {
		WebDriverUtility.clickOnElement(aboutUs);
	}
	
	public void ClickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}
	
	public String UserShouldSeeSuccessMessage() {
		String message = successMessage.getText();
		return message;
	}
	
	
	
	// Edit Your Affiliate information from Cheque payment to Bank Transfer
	
	public void clickOnEditYourAffiliateInformation() {
		WebDriverUtility.clickOnElement(editYourAffiliateInformation);
	}
	
	public void selectCheckBoxBank() {
		WebDriverUtility.clickOnElement(bankTransfer);
	}
	public void enterBankName(String bName) {
		WebDriverUtility.enterValue(bankName, bName);
	}
	public void enterBranchNumber(String bNumber) {
		WebDriverUtility.enterValue(branchNumber, bNumber);
	}
	public void enterSwiftCode(String sCode) {
		WebDriverUtility.enterValue(swiftCode, sCode);
	}
	public void enterAccountName(String aName) {
		WebDriverUtility.enterValue(accountName, aName);
	}
	public void enterAccountNumber(String aNumber) {
		WebDriverUtility.enterValue(accountNumber, aNumber);
	}
	
	

	
	
	// Edit Account information
	public void clickOnEditAccountInformation() {
		WebDriverUtility.clickOnElement(editYourAccountInformation);
	}
	public void enterFirstName(String fName) {
		WebDriverUtility.clearText(firstNameField);
		WebDriverUtility.enterValue(firstNameField, fName);
	}
	public void enterLastName(String lName) {
		WebDriverUtility.clearText(lastNamefield);
		WebDriverUtility.enterValue(lastNamefield, lName);
	}

	public void enterTelePhoneNumber(String tNumber) {
		WebDriverUtility.clearText(telePhoneNumber);
		WebDriverUtility.enterValue(telePhoneNumber, tNumber);
	}
	
	
}






