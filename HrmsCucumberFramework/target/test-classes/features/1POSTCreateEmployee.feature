Feature: Validating Syntax /createEmployee.php HRMS API

  Background: 
    Given user generates token

  @SyntaxHRMSAPIEndToEnd17
  Scenario: This test will check to see if an Employee was created
    Given user calls createEmployee API to verify that an employee was created
    When User retrieves response for createEmployee API
    Then status code is 200 for createEmployeeAPI
    Then user validates employee was created
