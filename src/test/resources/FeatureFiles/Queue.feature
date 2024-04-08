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
    When User scroll down the page
    Then The user clicks on "queue" get started button
    Then The user will be directed to "queue" Page

  @QueuePage
  Scenario: Validating Implementation of Queue in Python link 
  	Given The user will be directed to "queue" Page
  	When User scroll down the page
    And User see "Topics Covered" options
    And User go on "Implementation of Queue in Python" link
    And The user clicks Try Here button on the "Implementation of Queue in Python" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    And The user will be presented with the Run output <text> <status>
    Then User clear the text
    Then The user will be directed to "queue" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |

   @LinkedListPage
  Scenario: Validating Implementation using collections link 
  	Given The user will be directed to "queue" Page
  	When User scroll down the page
    And User see "Topics Covered" options
    And User go on "Implementation using collections.deque" link
    And The user clicks Try Here button on the "Implementation using collections" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Then The user will be directed to "queue" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |
      
    Scenario: Validating Implementation using array link 
  	Given The user will be directed to "queue" Page
  	When User scroll down the page
    And User see "Topics Covered" options
    And User go on "Implementation using array" link
    And The user clicks Try Here button on the "Implementation using array" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Then The user will be directed to "queue" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |
    
    Scenario: Validating Queue Operations link 
  	Given The user will be directed to "queue" Page
  	When User scroll down the page
    And User see "Topics Covered" options
    And User go on "Queue Operations" link
    And The user clicks Try Here button on the "Queue Operations" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Then The user will be directed to "queue" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |
     
     @practiceQuestions
  Scenario: Validate Practice Questions Page
  Given The user will be directed to "queue" Page
  	When User scroll down the page
    And User see "Topics Covered" options
    And User go on "Queue Operations" link
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "queue" Page
    Then User is on "home" page

    