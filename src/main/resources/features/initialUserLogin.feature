Feature: Initial user login
  Scenario: Login to the application
    Given  I navigate to LoginPage
    When  I input "Username" as "Instructor@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then I click Manage Access button

  Scenario: Create a new user and store password
    When I input to "First Name" as "Test"
    And I input to "Last Name" as "TestUser"
    And I input to "E-mail" as "testuser@gmail.com"
    And I select "Instructor" as a Role
    And I select "N/A" as a Batch
    Then I click Add user button

  Scenario: Login with new user first time
    Given  I navigate to LoginPage
    When  I input "Username" as "testuser@gmail.com"
    And  I input "Password" as "test.testuser$"
    And I click Login button
    Then I should see Please change the default password
