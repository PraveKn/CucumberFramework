Feature: Login Validation

  Background:
    Given User is on the login page of the application


  Scenario: Verify Admin page navigation
    When User tries to login the application with username as "Admin" and password as "admin123"
    Then  User should be succesfully login to the application
    And User click on the admin link
    And User search for the admin roles ""

#  Scenario Outline: Validate multiple User Login
#    When User tries to login the application with username as "<Admin>" and password as "<admin123>"
#    Then  User should be succesfully login to the application
#
#    Examples:
#      | username | password   |
#      | Admin    | admin123   |
#      | praveen  | praveen123 |
#      | akhil    | 123        |



