Feature: My validation on TestMe

  Scenario Outline: login validation for multiple users
    Given testme is launched user
    When user clicks on signin link in landing page
    Then user provides the valid username "<usname>"
    And user provides the valid password "<passwrd>"
    Then user clicks for the submission of tha data
    And verifies the login status for the account

    Examples: 
      | usname    | passwrd   |
      | Christ123 | Christ123 |
      | thanmay22 | friends   |
