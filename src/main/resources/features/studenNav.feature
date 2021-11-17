Feature: Student Navigation scenarios

  Background:
    Given I navigate to LoginPage
    When I input "username" as "adrio@hotmail.com"
    And I input "password" as "12345"
    Then I click "login" button

@end
  Scenario: Verify if Student is able to see Homeworks navigation button
    Then I should be able to see Homework button is displayed
    When I click on "homeworks" button
    Then I should be able to see title of the page as "Homework"
@end
  Scenario: Verify if Student is able to see Meeting links navigation button
    Then I should be able to see Meeting Links  button is displayed
    When I click on "meeting" button
    Then I should be able to see title of the page as "Meeting Links"
