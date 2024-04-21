@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

  @Login
  Scenario: Login with valid data
  	Given the user navigates to the dsportalapp home page
    Then The user navigates to login page
    When the user gives username and password
    Then The user logsin

  @ArrayPage
  Scenario: Validating Arrays in Python link 
  	Given The user will be directed to "array" Page
    And User see "Topics Covered" options
    And User go on "arrays-in-python" link
    And The user clicks Try Here button on the "arrays in python" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @ArrayPage
  Scenario: Validating Arrays Using List link 
  	Given The user will be directed to "array" Page
    And User see "Topics Covered" options
    And User go on "arrays-using-list" link 
    And The user clicks Try Here button on the "arrays-using-list" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
   Examples: 
      | code  | status  |
      | 0 		| valid   |
      | 1 		| Invalid |

	@ArrayPage
  Scenario: Validating Basic operations in lists link 
  	Given The user will be directed to "array" Page
    And User see "Topics Covered" options
    And User go on "basic-operations-in-lists" link 
    And The user clicks Try Here button on the "basic operations in list" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
   Examples: 
      | code  | status  |
      | 0 		| valid   |
      | 1 		| Invalid |

	@ArrayPage
  Scenario: Validating Applications of Array link 
  	Given The user will be directed to "array" Page
    And User see "Topics Covered" options
    And User go on "applications-of-array" link 
    And The user clicks Try Here button on the "applications of array" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
   Examples: 
      | code  | status  |
      | 0 		| valid   |
      | 1 		| Invalid |
  
  @practiceQuestions
  Scenario: Validate Practice Questions Search the array Page
    Given User is redirected to "https://dsportalapp.herokuapp.com/array/applications-of-array/"
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "array" Page
    And User go on "/question/1" link
    And The user clear code text area
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 2	  	| valid   |
		
    Scenario: Validate Practice Questions Max Consecutive Ones Page
    Given User is redirected to "https://dsportalapp.herokuapp.com/array/practice"
    Then The user will be directed to practice questions of "array" Page
    And User go on "/question/2" link
    And The user clear code text area
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 4 		 | valid   |
		
		Scenario: Validate Practice Questions Find Numbers with Even Number of Digit Page
		Given User is redirected to "https://dsportalapp.herokuapp.com/array/practice"
		Then The user will be directed to practice questions of "array" Page
    And User go on "/question/3" link
    And The user clear code text area
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 6			| valid   |
      
    Scenario: Validate Practice Questions Squares of a Sorted Array Page
    Given User is redirected to "https://dsportalapp.herokuapp.com/array/practice"
		Then The user will be directed to practice questions of "array" Page
    And User go on "/question/4" link
    And The user clear code text area
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Then the user navigates to the "https://dsportalapp.herokuapp.com/home"
    Examples: 
      | code  | status  |
      | 8			| valid   |
    