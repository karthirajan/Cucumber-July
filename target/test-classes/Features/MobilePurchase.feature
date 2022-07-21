#Author: karthi@your.domain.com
@Electronics
Feature: Mobile Purchase
  I want to use this template for my feature file
  
  Background:
    Given user launches flipkart application
    And user login into flipkart

@smoke
  Scenario: Mobile
    When user search mobile
    And user choose the mobile and doing payments
    Then user receive order confirmation message

@smoke @sanity @regression
  Scenario: Mobile one dim list
    When user search mobile by using one dim list
      | SAMSUNG | iPhone | realme |
    And user choose the mobile and doing payments
    Then user receive order confirmation message

  Scenario: Mobile one dim map
    When user search mobile by using one dim map
      | phone1 | iPhone  |
      | phone2 | SAMSUNG |
      | phone3 | realme  |
    And user choose the mobile and doing payments
    Then user receive order confirmation message

  Scenario Outline: All Mobiles
    When user search mobile "<Phones>"
    And user choose the mobile and doing payments
    Then user receive order confirmation message

    Examples: 
      | Phones  |
      | iPhone  |
      | SAMSUNG |
      | realme  |
