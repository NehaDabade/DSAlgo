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
    When The user clicks on "stack" get started button
    Then The user will be directed to "stack" Page

  @StackPage 
 Scenario Outline: Run print statement on Operations in Stack link
    Given The user is in "Operation" page
    When The user clicks Try Here button on the "stack" page
    And The user will be redirected to tryEditor page with a Run button to test
     And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Examples: 
      | text            | status |
      | print 'Welcome' | valid  |
    
    @StackPage
  	Scenario Outline: Run print statement on Operations in Stack link
    Given The user is in implementation "Implementation" page
    When The user clicks Try Here button on the "stack" page
    And The user will be redirected to tryEditor page with a Run button to test
     And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Examples: 
      | text            | status |
      | print 'Welcome' | valid  |
    
    @StackPage
  	Scenario Outline: Run print statement on Operations in Stack link
    Given The user is in Application "Application" page
    When The user clicks Try Here button on the "stack" page
    And The user will be redirected to tryEditor page with a Run button to test
     And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>
    Examples: 
      | text            | status |
      | print 'Welcome' | valid  |
    
    
  @practiceQuestions
  Scenario: Validate Practice Questions Page
    Given The user is on the "<page>" page
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "stack" Page
#
 #
  #@RunBtnValid
  #Scenario Outline: Validate try editor run Page with valid data
    #Given the user is directed to "stack" page
    #When The user enters <text> in tryEditor and user clicks Run button
    #Then The user will be presented with the Run output <text> <status>
#
    #Examples: 
      #| text            | status |
      #| print 'Welcome' | valid  |
  #@RunBtnInvalid
  #Scenario Outline: Validate try editor run Page with invalid data
    #Given the user is directed to "<page>" page
    #When The user enters  <text> in tryEditor and user clicks Run button
    #Then The user will be presented with the Run output <text> <status>
#
    #Examples: 
      #| text              | status  |
      #| println 'Welcome' | Invalid |
