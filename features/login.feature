@tag
Feature: APP Login
  I want to use this template for Appliaction Login

  Scenario: Login with valid credentials
    Given user should see loginpage
    When user click on reset button
    And user enter username "admin"
    And user enter password "master"
    And user click on login button
    Then user should validate dashboard page

  Scenario Outline: Login with invalid credentials
    Given user should see loginpage
    When user click on reset button
    And user enter username "<username>"
    And user enter password "<password>"
    And user click on login button
    Then user should see error message

    Examples: 
      | username | password |
      | Admin    | master1  |
      | Admin1   | Master   |
