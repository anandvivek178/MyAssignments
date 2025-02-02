Feature: Login functionality of leaftaps application

@login @positive @regression
Scenario: Test the login functionality with valid test data
Given Setup the test env
And Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login Button
Then Login is successful

@login @negative @sanity
Scenario: Test the login functionality with invalid test data
Given Setup the test env
And Enter the username as 'demo'
And Enter the password as 'crmsfa'
When Click on Login Button
But Login is not successful