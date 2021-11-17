Feature: Login page scenarios

  @end
  Scenario:  Verify login options with Valid credentials
    Given  I navigate to LoginPage
    When  I input "username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then I should see the Welcome message
  @end
  Scenario: Verify login options with valid credentials as Student
    Given I navigate to LoginPage
    When I input "username" as "user@test.com"
    And I input "password" as "123456"
    And I click Login button
    Then I should see the Welcome message
  @end
  Scenario: Verify login options with Invalid credentials
    Given  I navigate to LoginPage
    When  I input "Username" as "test@gmail.com"
    And  I input "Password" as "test1"
    And I click Login button
    Then I should see error message



