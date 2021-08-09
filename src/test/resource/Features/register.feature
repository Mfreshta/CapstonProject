@CompleteTest
Feature: Login to Retail website 


# Below is the tag @register 
@RegisterTestCase
Scenario: Register new user to Retail Website 
	
	Given User is on Retail Website	
	When User click on MyAccount
	And User click on Register option
	And User fill the Registration form with below information
	|firstName|lastName|eMail|telephone|password|passwordConfirm|Subscribe|
	|ahmed|khan|ahmed@tekschool.us|2021039411|ahmed123|ahmed123|no|
	And User accept the privacy and policy
	And User click on continue button
	Then User should be registered in Retail Website