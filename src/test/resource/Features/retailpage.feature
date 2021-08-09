@CompleteTest
Feature: Retail website

Background:
	Given User is on Retail website 
	And User click  on MyAccount
	When  User click on Login 
	And User enter username 'ahmed@tekschool.us' and password 'ahmed123'
	And User click on Login button
	Then User should be logged in to MyAccount dashboard
	
@AffiliateRegistration
Scenario: Register as an Affiliate user with Cheque Payment Method
	When User click on ‘Register for an Affiliate Account’ link 
	And User fill affiliate form with below information
	|company|website|taxID|paymentMethod|
	|Tek|tekschool.com|12345|Cheque|
	And User check on About us check box 
	And User click on Continue button 
	Then User should see a success message 
	
@EditAffiliate	
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
	When User click on ‘Edit your affiliate information’ link	
	And user click on Bank Transfer radio button
	And User fill Bank information with below information
	|bankName|abaNumber|swiftCode|accountName|accountNumber|
	|tBank|23457|99999|ahmed|0002345678910|
	And User click on Continue button 
	Then User should see a success message 
	
@EditYourAccountInformation	
Scenario: Edit your account Information 
	When User click on ‘Edit your account information’ link 
	And User modify below information 
	|firstname|lastname|email|telephone|
	|khan|kaka|ahmed@tekschool.us|123456789|
	And User click on continue button 
	Then User should see a success message
	
	
	
	
	
	
	
	
	
	