Feature: Reusable Feature
  I want to use this template for my all feature file

	@Login
  Scenario: Login with valid data
    Given The user navigates to login page
    When the user gives username and password
    Then The user logsin
    
  @GraphPage
  Scenario: Validating Graph link 
  	Given The user is in "graph" page
    When User see "Topics Covered" options
    Then The user clicks on Graph page
    When The user clicks Try Here button on the "Graph" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |
      
  @GraphPage
  Scenario: Validating Graph Representations link 
  	Given The user is in "graph" page
    When User see "Topics Covered" options
    Then The user clicks on Graph Representation page
    Then User scroll down the page
    When The user clicks Try Here button on the "Graph Representations" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @practiceQuestions
  Scenario: Validate Practice Questions Page
    Given User is redirected to "https://dsportalapp.herokuapp.com/graph/graph-representations/"
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "graph" Page
    Then the user navigates to the "https://dsportalapp.herokuapp.com/home"
    