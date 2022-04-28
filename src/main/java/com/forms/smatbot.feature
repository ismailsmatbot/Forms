@Application
Feature: Login
Scenario: Login into smatbot
Given Open Application
When Login Into Smatbot
Then Close Application
@signup
	Scenario: signup
	Given Open Application
	When Signup into smatbot
	When Entering addtional Details
	Then Close Application
	@contactus
	Scenario: contactus
	Given Open Application
	When entering details on ContactUs page
	Then Close Application
	@getstarted
	Scenario: GetStarted
	Given Open Application
	When clicking try free button in GetStarted page
	When Entering additional details in get started page
	Then Close Application
	@onpremise
	Scenario: OnPremise
	Given Open Application
	When Entering details of OnPremise page
	Then Close Application
	@Partnersletstalk
	Scenario: Partnersletstalk
	Given Open Application
	When Entering details on partners lets talk page
	Then Close Application