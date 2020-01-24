Feature: Test login functionality of demowebshop
 @validlogin
  Scenario: Test demowebshop with valid credentials
    Given open chrome and start application
    When enter usename and password
    Then User should be able to login
  @invalidlogin
  Scenario: Test demowebshop with invalid credentials
   Given open chrome and start the chrome browser
   When enter the invalid crdendials
   Then User should not  be able to login
   