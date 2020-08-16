Feature: Test login with valid credentials

  #@TestCaseKey=BDD-T1
  Scenario: Test login with valid credentials
    Given User is able to acess login page
    And user is on login page
    When user enters username and password
    And clicks on login button
    And user is on home page
    And user access menu test data
    And user clicks on logout
    Then user logged out of application and back to login page
