Feature: Create lead functionality in leaftaps application

@createLead @positive @smoke
Scenario: Create lead functionality with valid test data

Given Setup the test env
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login Button
Then Login is successful
When click on the crmsfa link
And click on the leads tab
And click on the create lead link
Given enter the company name as Testleaf
And enter the first name as Gokul
And enter the last name as Sekar
When click on the submit button
Then verify the lead is created successful