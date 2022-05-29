Feature: User will be able to create an account
 

  Scenario: Create an account 
    Given User navigates to the website
    Given User clicks on Sign In button
    Given User enters a valid email address
    When User clicks on create an account button
    When User enters personnal information
    When User cliks on Register button
    Then User is redirected to My Account page
