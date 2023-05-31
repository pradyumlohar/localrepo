Feature: Verify actitime login functionality

  Scenario Outline: validate acititime login with <flow> data as <username> and <password>
    Given As a user I am in actitime login page
    When I entered user name as <username>
    And entered password as <password>
    And clicked on login button
    Then I should navigate to Acititime home with title <pagetitle>

    Examples: 
      | flow    | username | password | pagetitle                   |
      | valid   | admin    | manager  | actiTIME - Enter Time-Track |
      | invalid | Admin    | Manager  | actiTIME - Login            |
      | invalid | null     | null     | actiTIME - Login            |
