@tag
Feature: Reusable Feature
  I want to use this template for my all feature file

	@Login
  Scenario: Login with valid data
    Given The user navigates to login page
    When the user gives username and password
    Then The user logsin

  @LinkedListPage
  Scenario: Validating Introduction link 
  	Given The user will be directed to "linked-list" Page
    When User see "Topics Covered" options
    Then User go on "introduction" link
    When The user clicks Try Here button on the "introduction" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @LinkedListPage
  Scenario: Validating Creating linked list link 
  	Given The user will be directed to "linked-list" Page
    When User see "Topics Covered" options
    Then User go on "creating-linked-list" link
    When The user clicks Try Here button on the "creating-linked-list" page
    Then The user will be redirected to tryEditor page with a Run button to test
  	And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
   Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @LinkedListPage
  Scenario: Validating Types of Linked List link 
  	Given The user will be directed to "linked-list" Page
    When User see "Topics Covered" options
    Then User go on "types-of-linked-list" link
    When The user clicks Try Here button on the "types-of-linked-list" page
    Then The user will be redirected to tryEditor page with a Run button to test
   	And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @LinkedListPage
  Scenario: Validating Implement linked list in python link 
  	Given The user will be directed to "linked-list" Page
    When User see "Topics Covered" options
    Then User go on "implement-linked-list-in-python" link
    When The user clicks Try Here button on the "implement-linked-list-in-python" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @LinkedListPage
  Scenario: Validating Traversal link 
  	Given The user will be directed to "linked-list" Page
    When User see "Topics Covered" options
    Then User go on "traversal" link
    When The user clicks Try Here button on the "traversal" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
     Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @LinkedListPage
  Scenario: Validating Insertion link 
  	Given The user will be directed to "linked-list" Page
    When User see "Topics Covered" options
    Then User scroll down the page
    Then User go on "insertion-in-linked-list" link
    When The user clicks Try Here button on the "insertion-in-linked-list" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |


  @LinkedListPage
  Scenario: Validating Deletion link 
  	Given The user will be directed to "linked-list" Page
    When User see "Topics Covered" options
    Then User scroll down the page
    Then User go on "deletion-in-linked-list" link
    When The user clicks Try Here button on the "deletion-in-linked-list" page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters <code> in tryEditor and user clicks Run button
    Then The user will be presented with the Run output <code> and status is <status>
    Examples: 
      | code  | status  |
      | 0			| valid   |
      | 1			| Invalid |

  @practiceQuestions
  Scenario: Validate Practice Questions Page
    Given User is redirected to "https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/"
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of "linked-list" Page
    Then the user navigates to the "https://dsportalapp.herokuapp.com/home"

    