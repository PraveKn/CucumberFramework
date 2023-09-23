Feature: Leave Validation
  Background:
    Given User is leave page of the application
    @leave @regression
    Scenario: Verify leave page navigation
      When The user tries to login the application with username as "Admin" and password as "admin123"
      Then User should be successfully logged into the application
      And user  clicking on leave button
     # And user search for leave role
