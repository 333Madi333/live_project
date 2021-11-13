Feature: Access Management scenarios
  Background:

    Given  I navigate to LoginPage
    When  I input "Username" as "Instructor@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then I click Manage Access button


  Scenario: Create a new user
    When I input to "First Name" as "Jack"
    And I input to "Last Name" as "GaRm"
    And I input to "E-mail" as "Jack@GaRm.com"
    And I select "Instructor" as a Role
    And I select "4" as a Batch
    And I click Add user button
    Then default password should be "jack.garm$"










