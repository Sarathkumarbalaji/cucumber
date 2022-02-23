Feature: Validation of Fb Login page

Background:
Given User Launch fb Application

Scenario: Validation of Login page with Invalid Credientials
When User Enters UserName and passWord
And Clicks Login Page
Then Error Page Should be Displayed