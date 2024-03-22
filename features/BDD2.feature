
    
    
Feature: HotelApp Login


  
  Scenario Outline: Login successfull
    Given I am on the HotelApp login page
    When user Enter username as <username>
    And user Enter password as <password>
    And user click on the login button
    Then user gets login successful message
   

    Examples: 
      | username    | password   |  

      | "KhbSaiSri" | "Hima@123" |
      |"JMamatha123"| "corp@123" |
      
