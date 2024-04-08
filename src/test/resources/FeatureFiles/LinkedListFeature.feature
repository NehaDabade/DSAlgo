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
    When The user clicks on "linked-list" get started button
    Then The user will be directed to "linked-list" Page
   
  @LinkedListPage
  Scenario: Validating Introduction link 
  	Given The user will be directed to "linked-list" Page
    And User see "Topics Covered" options
    And User go on "Introduction" link
    And The user clicks Try Here button on the "Introduction" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Then The user will be directed to "linked-list" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |
    
   @LinkedListPage
  Scenario: Validating Creating linked list link 
  	Given The user will be directed to "linked-list" Page
    And User see "Topics Covered" options
    And User go on "Creating Linked LIst" link
    And The user clicks Try Here button on the "Creating Linked LIst" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Then The user will be directed to "linked-list" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |
      
    Scenario: Validating Types of Linked List link 
  	Given The user will be directed to "linked-list" Page
    And User see "Topics Covered" options
    And User go on "Types of Linked List" link
    And The user clicks Try Here button on the "Types of Linked List" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Then The user will be directed to "linked-list" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |
    
    Scenario: Validating Implement linked list in python link 
  	Given The user will be directed to "linked-list" Page
    And User see "Topics Covered" options
    And User go on "Implement Linked List in Python" link
    And The user clicks Try Here button on the "Implement Linked List in Python" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Then The user will be directed to "linked-list" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |
      
   Scenario: Validating Traversal link 
  	Given The user will be directed to "linked-list" Page
    And User see "Topics Covered" options
    And User go on "Traversal" link
    And The user clicks Try Here button on the "Traversal" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Then The user will be directed to "linked-list" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |
    
    Scenario: Validating Insertion link 
  	Given The user will be directed to "linked-list" Page
    And User see "Topics Covered" options
    And User go on "Insertion" link
    And The user clicks Try Here button on the "Insertion" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Then The user will be directed to "linked-list" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |
    
   Scenario: Validating Deletion link 
  	Given The user will be directed to "linked-list" Page
    And User see "Topics Covered" options
    And User go on "Deletion" link
    And The user clicks Try Here button on the "Deletion" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Then The user will be directed to "linked-list" Page
    Examples: 
      | text            | status |
      | println 'Welcome' | Invalid  |
      | print 'Welcome' | valid  |
    
     @practiceQuestions
  Scenario: Validate Practice Questions Page
    Given The user is on the "<page>" page
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "linked list" Page
    Then User is on "home" page

    