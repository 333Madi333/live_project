Feature: Access Management scenarios
  Background:
    Given  I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then I click Manage Access button

    Scenario: Verify Update User pop up window when select Edit in Action menu
      Given I create new user
        | first name | Kuba              |
        | lastname   | TheGreat          |
        | e-mail     | kuba@thegreat.com |
        | role       | Instructor        |
        | batch      | 4                 |
      And I click Add User button
      When I click on Action dropdown menu
      And I click on Edit option
      Then I should see a popup window with Update User displayed
