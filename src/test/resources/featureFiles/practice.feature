Feature: User Login and Logout

  Scenario: successful Login
    Given user is on login page
    When user entered valid "standard_user" and "secret_sauce"
    Then user click on login button
    And user should see logout link

  Scenario: Logout
    Given User is logged in
    When User clicks the logout link
    Then User should be redirected to the login page
    And User should not see the products page

  Scenario Outline: Login with different user roles
    Given User is on the login page
    When User enters valid username "<username>" and password "<password>"
    And User clicks the login button
    Then User should be logged in and see the "<expected_page>" page

    Examples:
      | username                | password     | expected_page |
      | standard_user           | secret_sauce | Swag Labs      |
      | performance_glitch_user | secret_sauce | Swag Labs      |
