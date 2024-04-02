Feature: Verify given API call
 Scenario: Verify Statucode
    Given user hits url
    When an event happens
    Then I should get <code> as expectedcode
    
 Scenario: Verify Prices
    Given user hits url1
    When user gets all prices
    Then user should get INT price 