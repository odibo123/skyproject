Feature: Phone upgrade test

  Scenario Outline: As a user I want to be able to link my id when I choose to upgrade my phone
    Given User is on Home Page
    When User log into product and package page
    And user log into mobile page
    And user clicks on upgrade
    When user chooses to upgrade his account
    Then user validates sign in page
    And user log in entering correct "<email>"  and "<passwd>"
    And user confirm details is displayed
    And user attempts to link his id
    Then user validates mobile account page
    When user attempts to continue  by entering inaccurate   "<surname>" or "<postcode>" or "<billingDetails>"
    Then user should see an error message

    Examples: 
      | email                    | passwd    | surname | postcode | billingDetails |
      | christophodibo@yahoo.com | Tkogl1979 | peter   | se2d 6uy |         676543 |
