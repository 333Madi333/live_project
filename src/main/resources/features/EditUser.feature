Feature: Access Management scenarios

#  Need to disable hook file before testing
  Scenario: Add new user so I can test if I can edit user information
    Given  I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then I click Manage Access button
    Given I create new user
      | first name | Dada          |
      | last name  | Mama          |
      | e-mail     | dada@mama.com |
      | role       | Instructor    |
      | batch      | 4             |
    And I click Add User button

  Scenario: Verify user update popup window
    When I search for the user email "dada@mama.com" so I can work with his or her info
    When I click on Action dropdown menu
    And I click on Edit option
    Then I should see a popup window with Update User displayed

  Scenario: I Input new information for the newly added user
    When I input new firstname as "Kai"
    And I input new lastname as "Iem"
    And I input new e-mail "kaiiem@kubathegreat.com"
    And I change new role to "Student"
    And I change new batch to "3"
    Then I click on Update user button
    Then I should see the new update information

  Scenario: Verify Reset Password button
    When I search for the user email "kaiiem@kubathegreat.com" so I can work with his or her info
    When I click on Action dropdown menu
    When I click on Reset Password button
    Then Password should be "kai.iem$"

  Scenario: I delete newly updated user information
    When I search for the user email "kaiiem@kubathegreat.com" so I can work with his or her info
    When I click on Action dropdown menu
    And I click on Delete option
    Then I should see Delete popup window
    When I click on Delete button
    Then I should not see the newest user information I just added
