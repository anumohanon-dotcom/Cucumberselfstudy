Feature: Login Feature

  @smoketest
  Scenario: Successful login
    Given user is on login page
    When user enters valid credentials
    Then user is able to login
