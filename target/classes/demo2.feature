Feature: This is the demo2 feature test

  #Background:
  #Given Signin as a user
  @Demo2
  Scenario: This is the create a ticket scenario
    Given Signin as a user
    When At Redmine Home, select the Projects Link
    Then Select a project
    Then Select the New Issues Link
    Then Create a Redmine ticket
      | Fields      | Values                                     |
      | Title       | System error after click the review button |
      | Priority    | High                                       |
      | Description | How to repeat the steps                    |
    Then Close the Browser

  @Demo2
  Scenario: This is the search a ticket scenario
    Given Signin as a user
    When At Redmine Home, select the Projects Link
    Then Select a project
    Then Search for a redmine ticket
    Then Verify the search result
    Then Close the Browser and Cleanup
