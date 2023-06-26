@authadmintest
Feature: Auth Admin

  As a Admin
  I want to see the stock
  So that I can request to the api endpoints to login
  After updating my stock logout

  #POST - Positif ( Login )
  Scenario: POST - Login Admin with valid credential
    Given I set POST api endpoints login_admin
    When I send POST HTTP request login_admin
    Then I receive valid HTTP response code 200 login_admin

    #POST - Negatif ( Login )
  Scenario: POST - Login Admin wrong password
    Given I set POST api endpoints login_admin
    When I send POST HTTP request invalid password admin
    Then I receive valid HTTP response code 401 login_admin

  Scenario: POST - Login Admin with empty email
    Given I set POST api endpoints login_admin
    When I send POST HTTP request invalid email admin
    Then I receive valid HTTP response code 400 login_admin

  Scenario: POST - Login Admin with empty value
    Given I set POST api endpoints login_admin
    When I send POST HTTP request empty value admin
    Then I receive valid HTTP response code 400 login_admin

    #POST - Positif ( Logout )
  Scenario: POST - Logout Admin with valid credential
    Given I set POST api endpoints logout_admin
    When I send POST HTTP request logout_admin
    Then I receive valid HTTP response code 200 logout_admin

    #POST - Negatif ( Logout )
  Scenario: POST - Logout Admin with token expired
    Given I set POST api endpoints logout_admin
    When I send POST HTTP request token admin expired
    Then I receive valid HTTP response code 401 login_admin
