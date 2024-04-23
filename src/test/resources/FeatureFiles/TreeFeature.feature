@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

  #Background: Successfully navigate to the dsportalapp home page
    #Given the user is on the dsportalapp main page
    #When the user clicks on the Get Started button
    #Then the user navigates to the dsportalapp home page

  @Login
  Scenario: Login with valid data
    Given The user navigates to login page
    When the user gives username and password
    Then The user logsin

  @HomePage
  Scenario: Open desired page
    Given User is on "home" page
    When The user clicks on "tree" get started button
    Then The user will be directed to "tree" Page

  ##Overview Scenario
  Scenario: Validate tryButton Page Overview
    Given The user is in "tree" page
    When the user clicks on overview-of-trees link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @StackPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  Scenario: Validate tryButton Page terminologies
    Given The user is in "tree" page
    When the user clicks on terminologies link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @StackPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  Scenario: Validate tryButton Page types-of-trees
    Given The user is in "tree" page
    When the user clicks on types-of-trees link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @StackPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  Scenario: Validate tryButton Page Tree Traversals
    Given The user is in "tree" page
    When the user clicks on Tree Traversals link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @StackPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  Scenario: Validate tryButton Page traversals-illustration
    Given The user is in "tree" page
    When the user clicks on traversals-illustration link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @StackPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  Scenario: Validate tryButton Page binary-trees
    Given The user is in "tree" page
    When the user clicks on binary-trees link
    And The user clicks Try Here button on the page
    Then The user will be redirected to tryEditor page with a Run button to test

  @StackPage
  Scenario Outline: Validate RunButton Page with  Data
    Given The user is in TryEditor page
    When The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  @TreePage
  Scenario Outline: Run print statement on Operations in Stack link
    Given The user is in binary-trees "binary-trees" page
    When The user clicks Try Here button on the "tree" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  @TreePage
  Scenario Outline: Run print statement on Operations in Stack link
    Given The user is in types-of-binary-trees "types-of-binary-trees" page
    When The user clicks Try Here button on the "tree" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  @TreePage
  Scenario Outline: Run print statement on Operations in Stack link
    Given The user is in implementation-in-python "implementation-in-python" page
    When The user clicks Try Here button on the "tree" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  @TreePage
  Scenario Outline: Run print statement on Operations in Stack link
    Given The user is in binary-tree-traversals "binary-tree-traversals" page
    When The user clicks Try Here button on the "tree" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  @TreePage
  Scenario Outline: Run print statement on Operations in Stack link
    Given The user is in implementation-of-binary-trees "implementation-of-binary-trees" page
    When The user clicks Try Here button on the "tree" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  @TreePage
  Scenario Outline: Run print statement on Operations in Stack link
    Given The user is in applications-of-binary-trees "applications-of-binary-trees" page
    When The user clicks Try Here button on the "tree" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  @TreePage
  Scenario Outline: Run print statement on Operations in Stack link
    Given The user is in implementation-of-bst "implementation-of-bst" page
    When The user clicks Try Here button on the "tree" page
    And The user will be redirected to tryEditor page with a Run button to test
    And The user enters <text> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <text> <status>

    Examples: 
      | text              | status  |
      | println 'Welcome' | Invalid |
      | print 'Welcome'   | valid   |

  @practiceQuestions
  Scenario: Validate Practice Questions Page
    Given The user is on the "<page>" page
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "tree" Page
    
        @StackPage
  Scenario: Validate Practice Questions Page
  	Given The user is in "tree" page
    When the user clicks on overview-of-trees link
    And The user is on the "OverView" page for practice question
    Then The user clicks on "<page>" to the Practice Questions link 
    And The user will be directed to practice questions of the Page "tree" 
