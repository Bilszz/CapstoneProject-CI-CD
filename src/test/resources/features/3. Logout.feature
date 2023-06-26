@logouttest
Feature: Logout
  As a user
  I want to be able to log out from the system
  So that my session is terminated and my data remains secure

   #POST - Positif ( Logout )
  Scenario: POST - Logout User with valid credential
    Given I set POST api endpoints logout_user
    When I send POST HTTP request logout_user
    Then I receive valid HTTP response code 200 logout_User

    #POST - Negatif ( Logout )
  Scenario: POST - Logout User with token expired
    Given I set POST api endpoints logout_user
    When I send POST HTTP request token user expired
    Then I receive valid HTTP response code 401 logout_User
