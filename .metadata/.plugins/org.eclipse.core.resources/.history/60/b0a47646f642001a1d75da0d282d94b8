Feature: Report

  Background: //background is related to only the same class it is in
    Given I am logged into HRMS
    And I navigated to the Reports page

  Scenario: Search For Invalid Report
    When I enter invalid report
    And I click search button
    Then I see no record found message

  Scenario: Search For Invalid Report
    When I enter valid report
    And I click search button
    Then I see  the search report is displayed
