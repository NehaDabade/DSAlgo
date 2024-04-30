@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

#	@Login
  #Scenario: Login with valid data
    #Given The user navigates to login page
    #When the user gives username and password
    #Then The user logsin
#
  #@LinkedListPage
  Scenario: Validating Introduction link 
  	Given The user is in "linked-list" page
    When User see "Topics Covered" options
    Then The user clicks on Introduction page
    When The user clicks Try Here button on the "introduction" page
    When The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @LinkedListPage
  Scenario: Validating Creating linked list link 
  	Given The user is in "linked-list" page
    When User see "Topics Covered" options
    Then The user clicks on Creating Linked List page
    When The user clicks Try Here button on the "creating-linked-list" page
    When The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
   Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @LinkedListPage
  Scenario: Validating Types of Linked List link 
  	Given The user is in "linked-list" page
    When User see "Topics Covered" options
    Then The user clicks on Types of Linked List page
    When The user clicks Try Here button on the "types-of-linked-list" page
		When The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>   
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @LinkedListPage
  Scenario: Validating Implement linked list in python link 
  	Given The user is in "linked-list" page
    When User see "Topics Covered" options
    Then The user clicks on Implement Linked List in Python page
    When The user clicks Try Here button on the "implement-linked-list-in-python" page
    When The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @LinkedListPage
  Scenario: Validating Traversal link 
  	Given The user is in "linked-list" page
    When User see "Topics Covered" options
    Then The user clicks on Traversal page
    When The user clicks Try Here button on the "traversal" page
    When The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
     Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @LinkedListPage
  Scenario: Validating Insertion link 
  	Given The user is in "linked-list" page
    When User see "Topics Covered" options
    Then User scroll down the page
    Then The user clicks on Insertion page
    When The user clicks Try Here button on the "insertion-in-linked-list" page
    When The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |


  @LinkedListPage
  Scenario: Validating Deletion link 
  	Given The user is in "linked-list" page
    When User see "Topics Covered" options
    Then User scroll down the page
    Then The user clicks on Deletion page
    When The user clicks Try Here button on the "deletion-in-linked-list" page
    When The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor page and user clicks Run button
    Then The user will be presented with the run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @practiceQuestions
  Scenario: Validate Practice Questions Page
    Given The user is in "linked-list" page
    When User see "Topics Covered" options
    Then User scroll down the page
    Then The user clicks on Insertion page
    And The user clicks on Practice Questions link 
     Then The user will be directed to practice questions of the Page "linked-list"
    
    

    