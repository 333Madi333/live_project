Feature: Initial user login

  Scenario: Login to the application
    Given  I navigate to LoginPage
    When  I input "Username" as "Instructor@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then I click Manage Access button

 @end
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

  Scenario: Change password for initial user login
    Given I should see Please change the default password
    When I input new password  as "abc123"
    And I click on Submit button
    Then The display message should say Welcome "Welcome Test!"

  Scenario: Verify that value of password for testuser@gmail.com are all stars
    Given I click on "access" button
    Then Password for user "testuser@gmail.com" should be "********"

  @end
  Scenario: Delete test user when test is finished
    Given I delete "testuser@gmail.com" user





