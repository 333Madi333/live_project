Feature: Access Management scenarios
  Background:
git
    Given  I navigate to LoginPage
    When  I input "Username" as "Instructor@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then I click Manage Access button


  Scenario: Create a new user
    When I input to "First Name" as "Test"
    And I input to "Last Name" as "TestUser"
    And I input to "E-mail" as "testuser@gmail.com"
    And I select "Instructor" as a Role
    And I select "N/A" as a Batch
    Then I click Add user button

  Scenario: Delete user
    Then  I delete "testuser@gmail.com" user








