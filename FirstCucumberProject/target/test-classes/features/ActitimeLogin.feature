Feature: Verify actitime login functionality

Scenario: validate acititime login with valid data
Given As a user I am in actitime login page
When I entered user name as "admin"
And entered password as "manager"
And clicked on login button
Then I should navigate to Acititime home with title "actiTIME - Enter Time-Track"

Scenario: validate acititime login with invalid data
Given As a user I am in actitime login page
When I entered user name as "Admin"
And entered password as "Manager"
And clicked on login button
Then I should navigate to Acititime home with title "actiTIME - Login"

Scenario: validate acititime login with blank data
Given As a user I am in actitime login page
When I entered user name as " "
And entered password as " "
And clicked on login button
Then I should navigate to Acititime home with title "actiTIME - Login"