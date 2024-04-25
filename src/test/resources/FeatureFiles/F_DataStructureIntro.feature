@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

  @Login
  Scenario: Login with valid data
    #Background:
    Given The user navigates to login page
    When the user gives username and password
    Then The user logsin

  @HomePage
  Scenario: Open desired page
    #Background:
    Given User is on "home" page
    When The user clicks on "data-structures-introduction" get started button
    Then The user will be directed to "data-structures-introduction" Page

  @DataStructureIntroPage
  Scenario: Validate tryButton Page Time Complexity
    Given The user is in "data-structures-introduction" page
    When the user clicks on Time Complexity page
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @DataStructureIntroPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  @DataStructureIntroPage
  Scenario: Validate Practice Questions Page
    Given The user is in "data-structures-introduction" page
    When the user clicks on Time Complexity page
    And The user clicks on Practice Questions link
    Then The user will be directed to practice questions of the Page "data-structures-introduction"
