Feature: Clairvoyance E2E Test

  Background:
    When I open the clairvoyance
    And I press the Clairvoyance progress bar

  Scenario: select the General as topic and verify homePage is open
    And I click on General
    And I click on Send
    Then I should see homePage is open

  Scenario: select the Love as topic and verify homePage is open
    And I click on Love
    And I click on Send
    Then I should see homePage is open

  Scenario: select the CareerMoney as topic and verify homePage is open
    And I click on CareerMoney
    And I click on Send
    Then I should see homePage is open

  Scenario: select the Health as topic and verify homePage is open
    And I click on Health
    And I click on Send
    Then I should see homePage is open

  Scenario: don't select a topic and verify page elements
    And  I click on Send
    Then I should see Clairvoyance Topic Page elements