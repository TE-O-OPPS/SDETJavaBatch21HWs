Feature: Add Employee to HRMS

  @all
  Background:
    Given the admin user is logged into the HRMS application

  Scenario: Add an employee without providing an employee ID
    When the admin clicks on the PIM option
    And the admin clicks on the Add Employee option
    And the admin enters the employee details:
      | First Name | Middle Name | Last Name |
      | John       | A.          | Doe       |
    And the admin clicks on the Save button
    Then the system should save the employee with the provided employee details

  @smoke
  Scenario: Add an employee with an employee ID
    When the admin clicks on the PIM option
    And the admin clicks on the Add Employee option
    And the admin enters the employee details:

      | First Name | Last Name | Employee ID |
      | Alice      | Smith     | 12345       |
    And the admin clicks on the Save button
    Then the system should save the employee with the provided ID

  @error
  Scenario Outline: Validate required fields and error message
    And the admin enters the employee details:
  | First Name | Middle Name | Last Name | Employee ID |
  | <First>    | <Middle>    | <Last>    | <EmpID>     |
    And the admin clicks on the Save button
    Then the system should display "<ErrorMessage>"

    Examples:
      | First   | Middle | Last   | EmpID | ErrorMessage             |
      |         | A.     | Doe    |       | First Name is required.  |
      | John    | A.     |        |       | Last Name is required.   |
      | Michael |        | Connor |       | last name doesn't match. |
