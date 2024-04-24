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
  	Given The user is in "queue" page
  	When User scroll down the page
    Then User see "Topics Covered" options
    Then The user clicks on Implementation of Queue in Python page
    And The user clicks Try Here button on the "implementation-lists" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

   @QueuePage
  Scenario: Validating Implementation using collections.deque link 
  		Given The user is in "queue" page
  	When User scroll down the page
    And User see "Topics Covered" options
    Then The user clicks on Implementation using collections.deque page
    And The user clicks Try Here button on the "implementation-collections" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |
     
    Scenario: Validating Implementation using array link 
  	Given The user is in "queue" page
  	When User scroll down the page
    And User see "Topics Covered" options
    Then The user clicks on Implementation using array page
    And The user clicks Try Here button on the "Implementation-array" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
     Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |
     
    
    Scenario: Validating Queue Operations link 
  	Given The user is in "queue" page
  	When User scroll down the page
    And User see "Topics Covered" options
    Then The user clicks on Queue Operations page
    And The user clicks Try Here button on the "QueueOp" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |
     
 @practiceQuestions
  	Scenario: Validate Practice Questions Page
  	Given The user is in "queue" page
    When User scroll down the page
    And The user clicks on Queue Operations page
    And The user clicks on Practice Questions link 
    Then The user will be directed to practice questions of the Page "queue" 

    