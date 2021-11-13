Feature: Home page scenarios

@end
  Scenario:  Verify home page will display Welcome username!
    Given  I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then The display should say Welcome "Kuba" !


@end
  Scenario:  Verify that the title of the page is Student Portal
    Given  I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then The the title should be "Student Portal"


