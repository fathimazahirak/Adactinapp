Feature: User Login to Adactin app   
  Scenario: With valid credentials 
    Given User launch url and maximize the site
    When User enters valid username
    And enter valid password
    Then User click on login button
    When User select the location
    And Select the hotel
    When User select the room type
    And Number of rooms
    When user select check in date
    And checkout date
    When User select the adult room
    And child rooms
    Then User clicks on search button
    When User select hotel
    Then User Click on continue
    When Use enters first name 
    And lastname
    And Billing Address
    And Credit card number
    And User select credit card type 
    And Enter expiry month 
    And enter expiry year
    And Credit card cvv
    Then User click on book now
    Then User need to logout 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    