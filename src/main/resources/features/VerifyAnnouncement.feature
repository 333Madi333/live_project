Feature: Announcement Scenarios
  Background:
    Given I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button


# Jack Testing
  Scenario: Verify Announcement Title is Display in HomePage
    Then Verify Announcement title should be Display

  Scenario: Verify Announcement Message is Display in HomePage
    Then Verify Announcement message should be Display

  Scenario: Verify Announcement TimeStamp is Display in HomePage
    Then Verify Announcement timestamp should be Display

