@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

@Login
  Scenario: Login with valid data
    Given The user navigates to login page
    When the user gives username and password
    Then The user logsin

  @QueuePage
  Scenario: Validating Implementation of Queue in Python link 
  	Given The user will be directed to "queue" Page
  	When User scroll down the page
    And User see "Topics Covered" options
    And User go on "implementation-lists" link
    And The user clicks Try Here button on the "implementation-lists" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

   @QueuePage
  Scenario: Validating Implementation using collections link 
  	Given The user will be directed to "queue" Page
  	When User scroll down the page
    And User see "Topics Covered" options
    And User go on "implementation-collections" link
    And The user clicks Try Here button on the "implementation-collections" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |
     
    Scenario: Validating Implementation using array link 
  	Given The user will be directed to "queue" Page
  	When User scroll down the page
    And User see "Topics Covered" options
    And User go on "Implementation-array" link
    And The user clicks Try Here button on the "Implementation-array" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
     Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |
     
    
    Scenario: Validating Queue Operations link 
  	Given The user will be directed to "queue" Page
  	When User scroll down the page
    And User see "Topics Covered" options
    And User go on "QueueOp" link
    And The user clicks Try Here button on the "QueueOp" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |
     
     @practiceQuestions
  	Scenario: Validate Practice Questions Page
  	Given User is redirected to "https://dsportalapp.herokuapp.com/queue/QueueOp/"
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "queue" Page
    Then the user navigates to the "https://dsportalapp.herokuapp.com/home"

    