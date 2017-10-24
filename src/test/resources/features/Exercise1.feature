Feature: trainline search
  As a trainline user I want to be able to define a journey
  So that I can retrieve the times and prices of the journey

  Scenario: trainline search
    Given I am on "https://www.thetrainline.com"
    When I enter journey details from "Brighton" to "London"
    And click "Get times & tickets"
    Then I am given the times and prices of tickets