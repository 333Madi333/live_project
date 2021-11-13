Feature: Home page scenarios

<<<<<<< HEAD
  Scenario:  Verify login options with Valid credentials
=======
  Scenario:  Verify home page will display Welcome username!
>>>>>>> master
    Given  I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
<<<<<<< HEAD
    Then Title of the page should be Home Page
=======
    Then The display should say Welcome "Kuba" !
>>>>>>> master


  Scenario:  Verify that the title of the page is Student Portal
    Given  I navigate to LoginPage
    When  I input "Username" as "kuba@gmail.com"
    And  I input "Password" as "123456"
    And I click Login button
    Then The the title should be "Student Portal"


