Feature: Customer navigation through product categories: Phones, Laptops and Monitors

  Scenario: Sign up
    Given User Launch Chrome Browser
    When User opens url "https://www.demoblaze.com/index.html"
    And User click on sign up
    Then User can view sign up pop up window
    When User enter new username
    And User enter new password
    And User click on Sign Up button
    Then User sign up pop window should be disappear
    And close browser

    Scenario: Log in
      Given User Launch Chrome Browser
      When User opens url "https://www.demoblaze.com/index.html"
      And User click on log in
      Then User can view log in pop up window
      When User enter username
      And User enter password
      And User click on Log in button
      Then User can view user dashboard
      And close browser

  Scenario: Add Sony to Cart
    Given User Launch Chrome Browser
    When User opens url "https://www.demoblaze.com/index.html"
    And User click on log in
    When User enter username
    And User enter password
    And User click on Log in button
    And User navigates to Laptop
    And User clicks on "Sony vaio i5"
    And click on add to cart and accept pop up confirmation
    And User navigates back to home page
    And User navigates back to home page
    And close browser

  Scenario: Add Dell to Cart
    Given User Launch Chrome Browser
    When User opens url "https://www.demoblaze.com/index.html"
    And User click on log in
    When User enter username
    And User enter password
    And User click on Log in button
    And User navigates to Laptop
    And User clicks on "Dell i7 8gb"
    And click on add to cart and accept pop up confirmation
    And User navigates back to home page
    And close browser

  Scenario: Remove item from cart
    Given User Launch Chrome Browser
    When User opens url "https://www.demoblaze.com/index.html"
    And User click on log in
    When User enter username
    And User enter password
    And User click on Log in button
    And User navigates to cart
    And User deletes "Dell i7 8gb" from cart
    And User navigates back to home page
    And close browser

  Scenario: Fill in place order form and place an order
    Given User Launch Chrome Browser
    When User opens url "https://www.demoblaze.com/index.html"
    And User click on log in
    When User enter username
    And User enter password
    And User click on Log in button
    And User navigates to cart
    When User click on place order
    Then User can view pop up web form window
    When User fill in web form fields
    And User click on purchase
    Then User can verify amount equals expected
    And close browser
