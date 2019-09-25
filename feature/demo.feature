Feature: Login Action  
Scenario Outline:  susseccfully Login with Valid Credentialsd
Given the login page is opened
When user click on signin link
And user enters "<username>" and "<password>"
Then message displayed Login Successfully