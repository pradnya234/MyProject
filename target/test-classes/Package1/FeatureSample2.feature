Feature: Search product
      This feature is used to search for a product on amazon 
      Line2
      Line 3
      
         Scenario: Existing Product 
        
       Given I am able to acess "http://www.amazon.in"
       When Search for "mobile phone"
         Then I should get all my results with "mobile" keyword in it
      
     # Scenario: Existing Product2
        
      # Given I am able to acess "http://www.flipkart.com"
       #When Search for "mobile phone"
        # Then I should get all my results with "mobile" keyword in it
         
      
     Scenario Outline: Add to basket  
Given I am on the search page  "<web>"
When I should be able to add product to basket "<product>"
Then I should see product product in cart page

Examples:
|product|web|
|tv|http://amazon.in|
|mobile|http://flipkart.com|