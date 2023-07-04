@Register&Login
Feature: To test Login & SignIn processes on Loblaws website


#Background: Given User launches loblaws url again

@registerSingleuser  @regression  @UAT   @register
Scenario: To validate Register process on the website for single user

Given User launches new loblaws url again  
When User clicks on Sign In link
Then User lands on login page
When user clicks on Create PC ID link
Then user lands on Register page
And user enters Username and password
And user enter confirm password
And user clicks on terms chechbox
And user clicks on Create a PCID button
Then user logs in to Loblaws website



@registerSingleuser  @regression  @UAT   @register
Scenario Outline: To validate Register process on the website for multi user

Given User launches new loblaws url again  
When User clicks on Sign In link
Then User lands on login page
When user clicks on Create PC ID link
Then user lands on Register page
And user enters Username and password
And user enter confirm password
And user clicks on terms chechbox
And user clicks on Create a PCID button
Then user logs in to Loblaws website
Then User prints "<email>" address
Examples:
|email|
|abctest@gmail.com|
|abctest123@gmail.com|


@SuccessfulRegisterformultipleinputs   @regression  @UAT 
Scenario Outline: To test successful Register for multiple data inputs
Given User launches Loblaws url
#When User clicks on Sign In page
#Then User Clicks on Create PC id
#Then User creates an account by providing enter "<Email>","<Password>" and "<confirmPassword>"
#Then user clicks on Agree checkbox
#Then user clicks creates PC id button

Examples:
|Email|Password|confirmPassword|
|John_Singh05@gmail.com|FirstTest@001|FirstTest@001|



@RegisterError   @register
Scenario Outline: To test Error message on Register Page
Given User launches Loblaws url
When User clicks on Sign In page
Then User Clicks on Create PC id
Then User creates an account by providing enter "<Email>","<Password>" and "<confirmPassword>"
Then validates the error message on register page

Examples:
|Email|Password|confirmPassword|
|John_Singh01@gmail.com|FirstTest@001|FirstTest@0012|
