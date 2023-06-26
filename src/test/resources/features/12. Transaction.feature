@transactiontest
Feature: Transaction

  #Positif - POST
  Scenario: POST - Post add new transaction
    Given I set POST api endpoints Transaction
    When I send POST HTTP request Transaction
    Then I receive valid HTTP response code 201 Transaction

      #Negatif - POST
  Scenario: POST - Post add new transaction phone empty
    Given I set POST api endpoints Transaction
    When I send POST HTTP request Transaction empty_phone
    Then I receive valid HTTP response code 400 Transaction

    Scenario: POST - Post add new transaction wrong user_id
      Given I set POST api endpoints Transaction
      When I send POST HTTP request Transaction wrong_userid
      Then I receive valid HTTP response code 500 Transaction

      #Positif - GET
    Scenario: GET - Get All User Id ( Transaction history )
      Given I set GET api endpoints All user id_history
      When I send GET HTTP request All user id_history
      Then I receive valid HTTP response code 200 transaction

  Scenario: GET - Get add new transaction By Id
    Given I set GET api endpoints Transaction_ById
    When I send GET HTTP request Transaction_ById
    Then I receive valid HTTP response code 200 transaction

  Scenario: GET - Get All Stock Details By Stock Id
        Given I set GET api endpoints All By Stock_id
        When I send GET HTTP request All By Stock_id
        Then I receive valid HTTP response code 200 transaction

    #Negatif - GET
  Scenario: GET - Get list all by id invalid url
    Given I set GET api endpoints invalid url all_byidtransaction
    When I send GET HTTP request invalid url all_byidtransaction
    Then I receive valid HTTP response code 404 stock_detail





