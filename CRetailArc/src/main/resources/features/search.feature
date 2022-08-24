Feature: Google Search Feature

@smoke
  Scenario: Verify Google Search Textbox
    Given user on Google page
    When user enters data
    And press enter key
    Then user should navigate to search results page
