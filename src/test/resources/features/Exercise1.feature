Feature: trainline search
  As a trainline user I want to be able to define a journey
  So that I can retrieve the times and prices of the journey

  Scenario: Trainline search Exercise 1 and 2
    Given I am on "https://www.thetrainline.com"
    When I enter journey details from "Brighton" to "London"
    And click "Get times & tickets"
    Then I am given the times and prices of tickets

  Scenario: Trainline search Exercise 3
    Given I am on "https://www.thetrainline.com"
    When I enter journey details from "Brighton" to "London"
    And select the return radio element
    And click the tomorrow button
    And click the next day button
    And click "Get times & tickets"
    Then I am given the times and prices of tickets

  Scenario: Trainline search Exercise 5
    Given I am on "https://www.thetrainline.com"
    When I enter journey details from "Brighton" to "London"
    And select the return radio element
    And I select an outdate "5" days in the future
    And click the next day button
    And click "Get times & tickets"
    Then I am given the times and prices of tickets
