@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

  Background: Successfully navigate to the dsportalapp home page
    Given the user is on the dsportalapp main page
    When the user clicks on the Get Started button
    Then the user navigates to the dsportalapp home page

	@Login
  Scenario: Login with valid data
    Given The user navigates to login page
    When the user gives username and password
    Then The user logsin

  @HomePage
  Scenario: Open desired page
    Given User is on "home" page
    When The user clicks on "graph" get started button
    Then The user will be directed to "graph" Page
    
  @GraphPage
  Scenario: Validating Graph link 
  	Given The user will be directed to "graph" Page
    And User see "Topics Covered" options
    And User go on "graph" link
    And The user clicks Try Here button on the "Graph" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  | 
      
  @GraphPage
  Scenario: Validating Graph Representations link 
  	Given The user will be directed to "graph" Page
    And User see "Topics Covered" options
    And User go on "graph-representations" link 
    And The user clicks Try Here button on the "Graph Representations" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |

  @practiceQuestions
  Scenario: Validate Practice Questions Page
    Given The user will be directed to "graph" Page
    And User see "Topics Covered" options
    And User go on "graph-representations" link
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "graph" Page
		Then User is on "home" page
    
    