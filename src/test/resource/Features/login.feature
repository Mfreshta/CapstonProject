@CompleteTest
Feature: Login to Retail website 
	# In feature will be use a comment 
	#Every Feature file starts with Feature: <Name of Feature>

Background:
	Given User is on Retail Website

	# Below is the tag @login
@login 
Scenario: Login to MyAccount

	
	When User click on MyAccount  
	And  User click on Login 
	And User enter userName 'eagles@tekschool.us' and password 'eagles'
	And User click on Login button
	Then User should be logged in to myAccount Dashboard

	# Instead of Writing this scenario 3 times and just canging values
	# Cucumber provides scenario Outline with Examples keyword to do data Driven Testing
	
  # Below is the tag @test
@test
Scenario Outline: Login to MyAccount with Multiple users
	
	
	When User click on MyAccount
	And  User click on Login
	And User enter userName '<userName>' and password '<password>'
	And User click on Login button
	Then User should be logged in to myAccount Dashboard
	
	Examples:
	|userName|password|
	|eagles@tekschool.us|eagles|
	|hawks@tekschool.us|hawks|
	|falcons@tekschool.us|falcons|

	
	
	
	
	
	
	
	
	
	
	
	
	
	
