@stocktest
Feature: Stock

  As a admin
  I want to see the stock on store
  So that I can make see stock list

    #positif-GET
  Scenario: GET - Get all stock
    Given I set GET api endpoints stock
    When I send GET HTTP request stock
    Then I receive valid HTTP response code 200 stock


  Scenario: GET - Get stock by ID
    Given I set GET api endpoints stock_id
    When I send GET HTTP request stock_id
    Then I receive valid HTTP response code 200 stock

    #negatif-GET
  Scenario: GET - Get stock by invalid ID
    Given I set GET api endpoints invalid_id
    When I send GET HTTP request invalid_id
    Then I receive valid HTTP response code 404 stock

    Scenario: GET - Get stock by invalid URL
      Given I set GET api endpoints invalid_url
      When I send GET HTTP request invalid_url
      Then I receive valid HTTP response code 404 stock




