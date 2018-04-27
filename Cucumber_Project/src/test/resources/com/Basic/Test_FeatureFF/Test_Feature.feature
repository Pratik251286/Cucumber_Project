Feature: Create Account in OrangeHR

#Scenario: Create User account and validate the same.
#Given User need to be on OrangeHR login page.
#When User enters Username
#And User enters Password
#And User click on Login button
#Then User successfully logged in.


#Scenario: Create new user.
#When User clck on ADD button
#And user select user role as Admin
#And user enters Employee name
#And user enters Username
#And user select status as Enabled
#And user enters password
#And user enters confirm password
#And User click on save button

Background: User on OrangeHR portal
Given User need to be on OrangeHR login page 1.

Scenario: Validate user and password
When user enters following data 1
|Username |Password|
|Admin		|admin	 |
And User click on Login button 1

