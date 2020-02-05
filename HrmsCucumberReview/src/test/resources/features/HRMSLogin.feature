Feature: HRMS Login
  
  Description: The purpose of this feature file is to automate HRMS Login
  						To make sure that everything works as expected

  Scenario: HRMS Valid Login
    #given is used for preconditions for the test case
    Given user is already on HRMS Login page
    When user enters valid username and password
    And user clicks on Login button
    Then user sees that dashboard is displayed
