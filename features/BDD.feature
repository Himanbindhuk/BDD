

Feature: HotelApp Login

  
  Scenario: Login successfull
    Given I am on the HotelApp login page
    When user Enter username as "KhbSaiSri"
    And user Enter password as "Hima@123"
    And user click on the login button
    Then user gets login successful message
   
  

   