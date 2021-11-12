Feature: Access Management scenarios

#  Background:
#    Given  I navigate to LoginPage
#    When  I input "Username" as "kuba@gmail.com"
#    And  I input "Password" as "123456"
#    And I click Login button
#    Then I click Manage Access button

  Scenario: Add new user so I can test if I can edit user information
    Given  I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then I click Manage Access button
    Given I create new user
      | first name | Kuba              |
      | last name  | TheGreat          |
      | e-mail     | kuba@thegreat.com |
      | role       | Instructor        |
      | batch      | 4                 |
    And I click Add User button

  Scenario: Verify user update popup window
    When I click on Action dropdown menu
    And I click on Edit option
    Then I should see a popup window with Update User displayed

  Scenario: I Input new information for the newly added user
    When I input new firstname as "Kai"
    And I input new lastname as "Iem"
    And I input new e-mail "kaiiem@kubathegreat.com"
    And I change new role to "Student"
    And I change new batch to "3"
    Then I click on Update ser button
    Then I should see the new update information





