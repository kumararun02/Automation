@androidTest 
Feature: Android Test - Top bar is always visible
#Sample Test Scenario Description

Scenario: Launch the App
	Given Test_Base Launch the app
	
Scenario: TC004 Top bar is visible on home page
	When Test_Base Top bar is visible
	Then Test_Base I can see text testApplication on the bar
	
Scenario: TC005 Top bar is visible on Dashboard Page
	When Test_Base Tap on Dashboard icon
	Then Test_Base Top bar is visible
	And Test_Base I can see text testApplication on the bar
	
Scenario:  TC006 Top bar is visible on Notifications Page
	When Test_Base Tap on Notifications icon
	Then Test_Base Top bar is visible
	And Test_Base I can see text testApplication on the bar
