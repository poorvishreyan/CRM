Feature: FB Logiin

  Scenario Outline: Verify FB Invalid Login
    Given user on FB login Page
    When users enters username <username>
    And user enters password <password>
    And user clicks on login button
    Then error message should be displayed

    Examples: 
      | username | password |
      | shreyan  | abcd     |
