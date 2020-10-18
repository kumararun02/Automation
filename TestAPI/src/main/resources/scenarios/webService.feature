@WebService 
Feature: Demo for Web Service example 



@employee 
Scenario Outline: Add new order 
	Given user request with json data '<get.employee>' 
	When I check response code 
	And I validate the application Urls for logged of users in response
	Then Test response should have status 'OK' 
	Then Test response should have value contains "Nixon" at "$.data.employee_name" 
	
	
	Examples: {'datafile' : 'src/main/resources/data/sampleServicesData2.json'} 
	
	
	
	
