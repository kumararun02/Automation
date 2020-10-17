@androidTest 
Feature: Android Test
#Sample Test Scenario Description

Scenario: Launch the App
	Given Test_Base Launch the app
	
Scenario: TC001 Is Home Tab is Selected
	When Test_Home_Page is the current page
	Then Test_Home_Page I can see text Home on the main screen
	
Scenario: TC002 Navigate to Dashboard Tab
	When Test_Base Tap on Dashboard icon
	Then Test_DashBoard_Page I can see text Dashboard on the main screen 
	And Test_DashBoard_Page Only Dashboard icon is highlighted 
	
Scenario: TC003 Navigate to Notifications Tab
	When Test_Base Tap on Notifications icon
	Then Test_Notifications_Page I can see text Notifications on the main screen
	And Test_Notifications_Page Only Notifications icon is highlighted 
	