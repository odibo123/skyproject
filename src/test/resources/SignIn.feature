Feature: Sign In test
  
  Discription: This test is to prove that a user is able to sign in with the right credentials

  Scenario Outline: As a user I want to log in by entering correct login details
    Given User is on Home Page
    When user log into signin page
    And user log in by entering correct "<emailId>"  and "<password>"
    Then the dashboard should display that "<user>" is logged in successfullly
    And user signs out

    Examples: 
      | emailId                  | password  | user              |
      | christophodibo@yahoo.com | Tkogl1979 | odibo christopher |
