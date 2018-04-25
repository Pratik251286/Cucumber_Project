Feature: Create User Account in OrangeHR


Background: User on OrangeHR portal
Given User need to be on OrangeHR login page.
When User enters Username
And User enters Password
And User click on Login button
Then User successfully logged in.

Scenario Outline: Create new user.
When User clck on ADD button
And user select user role as Admin
And user enters "<Employeename>" as Employee name
And user enters "<UserName>" As Username
And user select status as Enabled
And user enters "<Password>" as password
And user enters "<Confirmed_Password>" as confirm password
And User click on save button
Then Close Firefox
Examples:

|Employeename 	|UserName |Password   |Confirmed_Password|
|Hannah Flores	|HannahF	|Hannah@123 |Hannah@123				 |
|Steven Edwards	|StevenE	|Steven@123 |Steven@123				 |
|Linda Anderson	|LindaA		|Linda@123	|Linda@123				 |
|Thomas Fleming	|ThomasF	|Thomas@123	|Thomas@123				 |



