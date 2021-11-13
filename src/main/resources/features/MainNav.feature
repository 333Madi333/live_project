Feature: Main Navigation Scenarios

  Background:
    Given I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
@end
  Scenario: Instructor should be able to see Homeworks navigation button
    Then I should be able to see Homeworks button is displayed
    When I click on "homeworks" button
    Then Title of the page should be "Homework"
@end
  Scenario: Instructor should be able to see Meeting Links navigation button
    Then I should be able to see Meeting Links button is displayed
    When I click on "meeting" button
    Then Title of the page should be "Meeting Links"
@end
  Scenario: Instructor should be able to see Manage Access navigation button
    Then I should be able to see Manage Access button is displayed
    When I click on "access" button
    Then Title of the page should be "Access Management"