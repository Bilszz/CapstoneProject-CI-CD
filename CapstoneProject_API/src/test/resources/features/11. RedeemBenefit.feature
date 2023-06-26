@redeembenefittest
Feature: Redeem Benefit

  As a User
  I want to Redeem voucher
  So that I can get benefit

     #Positif - POST
  Scenario: POST - Add Redeem Voucher
    Given I set POST api endpoints Redeem Voucher
    When I send POST HTTP request Redeem Voucher
    Then I receive valid HTTP response code 201 voucher

     #Negatif - POST
  Scenario: POST - Add Redeem Voucher User_Id Empty
    Given I set POST api endpoints Redeem Voucher
    When I send POST HTTP request Redeem Voucher User_Id Empty
    Then I receive valid HTTP response code 400 voucher

#Positif - GET
  Scenario: GET - Get Voucher
    Given I set GET api endpoints Voucher
    When I send GET HTTP request voucher
    Then I receive valid HTTP response code 200 voucher

    Scenario: GET - Get By Id Voucher
    Given I set GET api endpoints Voucher By Id
    When I send GET HTTP request Voucher By Id
    Then I receive valid HTTP response code 200 voucher

     Scenario: GET - Get By Id Redeem
        Given I set GET api endpoints Redeem By Id
        When I send GET HTTP request Redeem By Id
        Then I receive valid HTTP response code 200 voucher

       Scenario: GET - Get All Redeem
         Given I set GET api endpoints All Redeem
         When I send GET HTTP request All Redeem
         Then I receive valid HTTP response code 200 voucher

         #Negatif - GET
  Scenario: GET - Get wrong url voucher
    Given I set GET api endpoints wrong url Voucher
    When I send GET HTTP request  wrong url Voucher
    Then I receive valid HTTP response code 404 voucher







