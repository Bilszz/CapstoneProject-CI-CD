@stockdetailtest
Feature: Stock Details

  As a Admin
  I want to create new Stock Detail
  So that I can make more Stock Detail

  #positif - POST
  Scenario: POST - Add new Stock Detail
    Given I set POST api endpoints Stock_detail
    When I send POST HTTP request Stock_detail
    Then I receive valid HTTP response code 201 Stock_detail

    #negatif - POST
    Scenario: POST - Add new Stock Detail without stock id
      Given I set POST api endpoints Stock_detail
      When I send POST HTTP request stock_id
      Then I receive valid HTTP response code 400 Stock_detail

      Scenario: POST - Add new Stock Detail without key
        Given I set POST api endpoints Stock_detail
        When I send POST HTTP request key Stock_detail
        Then I receive valid HTTP response code 400 Stock_detail

      #Positif - GET
  Scenario: GET - Get All Stock Detail
      Given I set GET api endpoints Stock_detail
      When I send GET HTTP request Stock_detail
      Then I receive valid HTTP response code 200 Stock_detail

    Scenario: GET - Get Stock Detail By id
      Given I set GET api endpoints Stock_detail Id
      When I send GET HTTP request Stock_detail Id
      Then I receive valid HTTP response code 200 Stock_detail

  Scenario: GET - Get All Stock Detail By id
    Given I set GET api endpoints All Stock_detail Id
    When I send GET HTTP request All Stock_detail id
    Then I receive valid HTTP response code 200 Stock_detail

    #Negatif - GET
  Scenario: GET - Get list all Stock with invalid url
    Given I set GET api endpoints invalid url stock_detail
    When I send GET HTTP request invalid url stock_detail
    Then I receive valid HTTP response code 404 stock_detail

  Scenario: GET - Get Stock Detail Invalid By id
    Given I set GET api endpoints invalid Stock_detail Id
    When I send GET HTTP request invalid Stock_detail Id
    Then I receive valid HTTP response code 404 stock_detail

  Scenario: GET - Get All Stock Detail invalid url By All id
    Given I set GET api endpoints Invalid Stock_detail All Id
    When I send GET HTTP request Invalid Stock_detail All Id
    Then I receive valid HTTP response code 404 stock_detail

      #positif-PUT
  Scenario: PUT - Put update stock
    Given I set PUT api endpoints Stock_detail
    When I send PUT HTTP request Update_stock
    Then I receive valid HTTP response code 200 Stock_detail

        #negatif-PUT
  Scenario: PUT - Update stock without fill stock
    Given I set PUT api endpoints Stock_detail
    When I send PUT HTTP request Update without stock
    Then I receive valid HTTP response code 400 Stock_detail

     #positif-DELETE
  Scenario: DELETE - Delete by id stock detail
    Given I set DELETE api endpoints stock_detail
    When I send DELETE HTTP request stock_detail
    Then  I receive valid HTTP response code 200 Stock_detail





