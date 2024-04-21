@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

  Background: Successfully navigate to the dsportalapp home page
    Given the user is on the dsportalapp main page
    When the user clicks on the Get Started button
    Then the user navigates to the dsportalapp home page
    And ensure that user is logged in

  @Login
  Scenario: Login with valid data
    Given The user navigates to login page
    When the user gives username and password
    Then The user logsin

  @HomePage
  Scenario: Open desired page
    Given User is on "<page>" page
    When The user clicks on "<page>" get started button
    Then The user will be directed to "<page>" Page

  @practiceQuestions
  Scenario: Validate Practice Questions Page
    Given The user is on the "<page>" page
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "<page>" Page

  @tryRunBtn
  Scenario Outline: Validate tryButton Page
    Given The user is in "<page>" page
    When The user clicks Try Here button on the "<page>" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Examples: 
      | text            | status |
      | print 'Welcome' | valid  |

  @RunBtnValid
  Scenario Outline: Validate try editor run Page with valid data
    Given the user is directed to "<page>" page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text            | status |
      | print 'Welcome' | valid  |

  @RunBtnInvalid
  Scenario Outline: Validate try editor run Page with invalid data
    Given the user is directed to "<page>" page
    When The user enters  <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
