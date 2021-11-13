Feature: Home page scenarios

  Scenario:  Verify login options with Valid credentials
    Given  I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then Title of the page should be Home Page



