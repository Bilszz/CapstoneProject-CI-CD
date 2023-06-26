@stocktransactiontest
Feature: Stock Transaction

  As a admin
  I want to create new Stock Transaction
  So that I can make more Stock Transaction

  #POST - Positif
  Scenario: POST - Add new Stock Transaction
    Given I set POST api endpoints Stock_transaction
    When I send POST HTTP request Stock_transaction
    Then I receive valid HTTP response code 201 Stock_transaction

    #POST - Negatif
  Scenario: POST - Add new Stock Transaction without user id
    Given I set POST api endpoints Stock_transaction
    When I send POST HTTP request user_id
    Then I receive valid HTTP response code 400 Stock_transaction

  Scenario: POST - Add new Stock Transaction without key
    Given I set POST api endpoints Stock_transaction
    When I send POST HTTP request key Stock_transaction
    Then I receive valid HTTP response code 400 Stock_transaction

    Scenario: POST - add stock by adding a minimum credit
      Given I set POST api endpoints Stock_transaction
      When I send POST HTTP request add minimum credit
      Then I receive valid HTTP response code 500 Stock_transaction

      #GET - Positif
  Scenario: GET - Get All Stock Transaction
    Given I set GET api endpoints Stock_transaction
    When I send GET HTTP request Stock_transaction
    Then I receive valid HTTP response code 200 Stock_transaction

    Scenario: GET - Get Stock Transaction By Id
      Given I set GET api endpoints Stock_transactionbyid
      When I send GET HTTP request Stock_transactionbyid
      Then I receive valid HTTP response code 200 Stock_transaction

    #GET - Negatif
  Scenario: GET - Get list all Stock transaction with invalid url
    Given I set GET api endpoints invalid url stock_transaction
    When I send GET HTTP request Invalid url Stock_transaction
    Then I receive valid HTTP response code 404 stock_transaction

  Scenario: GET - Get Stock Transaction Invalid Id
    Given I set GET api endpoints Invalid Id Stock_transaction
    When I send GET HTTP request Invalid Id Stock_transaction
    Then I receive valid HTTP response code 404 stock_transaction

