Feature: Login Functionality

  Background: Open Chrome Browser
    Given Chrome Browser is opened

Scenario: Validate the Login Functionality

  Given User is on Orange HRM Login Page
  When <Username> and <Password> is entered
  Then User should be logged into Homepage