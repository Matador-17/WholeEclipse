Feature: Get All Employees

Background:
Given user generates token

@allemployees
Scenario:
Given User calls for the getAllEmployees API
When The user retrieves all Employees
Then the status code should be 200
Then User validates that all Employees has been retrieved