Feature: View Deals test

  Scenario Outline: As a user I want to be able to link my id when I choose to upgrade my phone
    Given User is on Home Page
    When User log into product and package page
    And user log into mobile page
    And user log into view deal page
    And user chooses a product
    #And user chooses a "<monthlyDeals>" from View deals page
    #When user logs into choose your plan page by entering "<colour>" and "<capacity>" and "<monthlySwap>"
    #And user continue to your basket page
    #Then user validate the price
    #Then user checks out into sign in page
    #When user validates no transaction was made

    Examples: 
      | colour | capacity | monthlySwap | monthlyDeals   |
      | Black  | 64GB     |          12 | iphone11       |
     # | Green  | 128GB    |          24 | iphone11Pro    |
     # | White  | 256GB    |          12 | iphone11ProMax |
