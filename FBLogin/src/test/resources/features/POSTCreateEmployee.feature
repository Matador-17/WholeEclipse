Feature: Validating Syntax HRMS APIs

Background:
Given User generates token

@APITEST
Scenario: This test will check to see if an Employee is created
Given User calls createEmployee API
When User retrieves response
Then Status code is 200
Then User validates employee is created