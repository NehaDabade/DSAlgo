@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

  @Login
  Scenario: Login with valid data
    Given The user navigates to login page
    When the user gives username and password
    Then The user logsin

  @ArrayPage
  Scenario: Validating Arrays in Python link 
  	Given The user is in "array" page
    When User see "Topics Covered" options
    Then The user clicks on Arrays in Python page
    #Then User scroll down the page
    When The user clicks Try Here button on the "arrays in python" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @ArrayPage
  Scenario: Validating Arrays Using List link
    Given The user is in "array" page
    When User see "Topics Covered" options
    Then The user clicks on Arrays using list page
    Then The user clicks Try Here button on the "arrays-using-list" page
    When The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
   Examples: 
      | code  | status  |
      | 0 		| valid   |
      | 1 		| Invalid |

	@ArrayPage
  Scenario: Validating Basic operations in lists link 
    Given The user is in "array" page
    When User see "Topics Covered" options
    Then The user clicks on Basic Operations In Lists page
    Then The user clicks Try Here button on the "basic operations in list" page
    When The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
   Examples: 
      | code  | status  |
      | 0 		| valid   |
      | 1 		| Invalid |

	@ArrayPage
  Scenario: Validating Applications of Array link 
    Given The user is in "array" page
    When User see "Topics Covered" options
    Then The user clicks on Applications of Arrays page 
    Then The user clicks Try Here button on the "applications of array" page
    When The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
   Examples: 
      | code  | status  |
      | 0 		| valid   |
      | 1 		| Invalid |
  
  @practiceQuestions
  Scenario: Validate Practice Questions Search the array Page
    Given User is redirected to "https://dsportalapp.herokuapp.com/array/applications-of-array/"
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "array" Page
    And User go on Search the array link
    And The user clear code text area
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
      Examples: 
      | code  | status  |
      | 2	  	| valid   |
      
    Scenario: Validate Practice Questions Search the array Page Submit button
     Given  User clicks Submit button
     Then The user will be presented with the run output <code> and status is <status>
     Examples: 
      | code  | status  |
      | 3	  	| valid |
      
    Scenario: Validate Practice Questions Max Consecutive Ones Page
    Given User is redirected to "https://dsportalapp.herokuapp.com/array/practice"
    Then The user will be directed to practice questions of "array" Page
    And User go on Max Consecutive Ones link
    And The user clear code text area
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 4 		| valid   |
      
     Scenario: Validate Practice Questions Max Consecutive Ones Page Submit button
     Given  User clicks Submit button
     Then The user will be presented with the run output <code> and status is <status>
     Examples: 
      | code  | status  |
      | 5  	| valid |
		
		Scenario: Validate Practice Questions Find Numbers with Even Number of Digit Page
		Given User is redirected to "https://dsportalapp.herokuapp.com/array/practice"
		Then The user will be directed to practice questions of "array" Page
    And User go on Find Numbers with Even Number of Digits link
    And The user clear code text area
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 6			| valid   |
      
    Scenario: Validate Practice Questions Find Numbers with Even Number of Digit Page Submit button
     Given User clicks Submit button
     Then The user will be presented with the run output <code> and status is <status>
     Examples: 
      | code  | status  |
      | 7  	  | valid |  
      
    Scenario: Validate Practice Questions Squares of a Sorted Array Page
    Given User is redirected to "https://dsportalapp.herokuapp.com/array/practice"
		Then The user will be directed to practice questions of "array" Page
    And User go on Squares of a Sorted Array link
    And The user clear code text area
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 8			| valid   |

    Scenario: Validate Practice Questions Squares of a Sorted Array Page Submit button
     Given User clicks Submit button
     Then The user will be presented with the run output <code> and status is <status>
     Then the user navigates to the "https://dsportalapp.herokuapp.com/home"
     Examples: 
      | code  | status  |
      | 9 	  | valid |  