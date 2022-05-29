Feature: User will be able to retrieve password

 Scenario: Create an account 
    Given User navigates to the website
    Given User clicks on Sign In button
    When User clicks on Forgot you Password link
    When User enters a valid email address
    Then User receives an email to retrieve password
    
