Feature: Announcement Scenarios
  Background:
    Given I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button



  Scenario: Adding & Delete Announcement
    When I click Add announcement
    Then I input title
    Then I input announcement
    And I click Post button
    Then I should see Update announcement
    Then I should be able to delete announcement



# Jack Testing
  Scenario: Verify Announcement Title is Display in HomePage
    Then Verify Announcement title should be Display

  Scenario: Verify Announcement Message is Display in HomePage
    Then Verify Announcement message should be Display

  Scenario: Verify Announcement TimeStamp is Display in HomePage
    Then Verify Announcement timestamp should be Display

