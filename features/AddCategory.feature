@tag
Feature: Add Stock Category
  I want to use this template for Adding Category

  @tag1
  Scenario: Adding Stock Category
    Given login to app
    Then click on stock items
    Then click on stock categories
    When click on add button
    Then enter category name "Mobiles"
    And click on add btn
    Then accept confirm msg
    And validate success msg
    Then user should check whether added or not with name "Mobiles"
		And user logout app