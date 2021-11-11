Feature: Access Management scenarios
  Background:
    Given  I navigate to LoginPage
    When  I input "Username" as "Instructor@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then I click Manage Access button


  Scenario: Create a new user

    When I input "Test" to the "First Name" field
    And I input "TestUser" to the "Last Name" field
    And I input "testuser@gmail" to the "E-mail" field


