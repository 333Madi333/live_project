Feature: Announcement Scenarios
  Background:

    Given I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button

@end
  Scenario: Adding Announcement
    When I click Add announcement
    Then I input title
    Then I input announcement
    And I click Post button
    Then I should see Update announcement title
    And I should see Update announcement description
    Then I click delete button
@end
  Scenario: Add Announcement without title
    When I click Add announcement
    Then I input announcement
    And I should not be able to click Post button

@end
  Scenario: Add Announcement without description
    When I click Add announcement
    Then I input title
    And I should not be able to click Post button

  @end
  Scenario: Delete Announcement
    When I should see announcement list
    Then I click delete button
