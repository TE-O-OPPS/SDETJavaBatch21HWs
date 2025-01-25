Feature: Login Validation
  Validate the login functionality for the HRMS portal with clear error messages.

@invalidCredential
  Scenario: Validate error messages for various login attempts
    Given the user is on the login page

    When the user attempts to log in with the following credentials:
      | Username     | Password       |
      | ""           | validPassword  |
      | validUser    | ""             |
      | invalidUser  | invalidPass    |
    Then the system should display the following error messages:
      | Username     | Password       | Error Message                  |
      | ""           | validPassword  | Username cannot be empty.      |
      | validUser    | ""             | Password is empty.             |
      | invalidUser  | invalidPass    | Invalid credentials.           |


    When the user attempts to log in with valid credentials:
      | Username    | Password        |
      | Admin        |  Hum@nhrm123  |
    Then the user should be successfully logged in
