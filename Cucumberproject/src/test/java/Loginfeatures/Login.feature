
Feature: User will be able to login into the website using the email and password
 

  Scenario: Login using a valid email and password
    Given User navigates to the website
    And User clicks on sign in button
    When User enters a valid email address and a valid password
    Then User should be able to login successfully
