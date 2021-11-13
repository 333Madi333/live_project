Feature: Announcement Scenarios
  Background:
    Given I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button



  Scenario: Adding Announcement
    When I click Add announcement
    Then I input title
    Then I input announcement
    And I click Post button
    Then I should see Update announcement


  Scenario: Delete Announcement
    When I should see Update announcement
    Then I click delete button
