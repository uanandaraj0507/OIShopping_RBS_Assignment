@Shopping_Sanity
Feature: Validating OI Shopping application Functionality

@First_scenario
  Scenario: Validating Add List and Add Items Feature
    Given Launch the application and Navigates to Home screen
    When User select New list and Create the new lists
    | ShoppingList1 | ShoppingList2 |
    And Select a list and Add new list items
    
    	 | ListName | Item1 | Item2 | Item3 | Item4|Item5|
      | ShoppingList1 | Refrigerator | TV | Washing Machine |Purifier| Air conditioner|
    	| ShoppingList2 | Watch | Bracelet | Chain |Arrow| Ring|
    
    Then Delete an item from the list
    | ShoppingList2 |
 
 @Second_Scenario
  Scenario: Validating Sorting List items Functionality
  
  	Given Launch the application and Navigates to Home screen
    When User select New list and Create a new lists
    | ShoppingList2 |
    And Select a list and Add new list items
    
    | ListName | Item1 | Item2 | Item3 | Item4| Item5 |
    	| ShoppingList2 | Watch | Bracelet | Chain |Arrow| Ring|	
    
    And Select the list and Sort the list
    | ShoppingList2 |
    Then Validate the sorted list
    | ShoppingList2 |
