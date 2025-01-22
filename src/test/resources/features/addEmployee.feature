Feature: Adding an employee using different methods


  Background:
    #Given user is able to access HRMS application#it include in the hooks
    When user enters admin username and password
    And user clicks on login button
    Then user is able to see dashboard page
    When user clicks on PIM button
    And user clicks on Add Employee option

  @smoke
  Scenario: Adding an employee using hardcode data
    When user enters firstname and middlename and lastname
    And user clicks on save button
    Then employee added successfully

 @feature
  Scenario: adding an employee using feature file
    And users enters data "andrey" and "ms" and "ziad"
    And user clicks on save button
    Then employee added successfully

  @example
  Scenario Outline: Adding multiple employees using features file
    And users enters "<firstname"> and <"middlename"> and <"lastname">.
    And  user clicks on save button
    Then employee added successfully
    Examples:
      | firstname |middlename    |lastname |
      |andrew      |ms           |symonds  |
      | matthew  |ms           |hayden   |
      |steve       |ms           |smith    |
  @datatable
  Scenario: Adding employees using data table
    When user add multiple employees using data table and verify them
      |firstName   |middleName   |lastName |
      |andrew      |ms           |symonds  |
      |matthew     |ms           |hayden   |
      |steve       |ms           |smith    |
  @excel
  Scenario: Add employee from excel file
    When user adds employee from excel file and verify them