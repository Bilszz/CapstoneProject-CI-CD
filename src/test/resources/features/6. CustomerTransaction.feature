@customertransaction
Feature: Customer Transaction

  As a admin
  I want to view all list customer transaction
  So that I can see list customer transaction

  Scenario: GET - Get list all Customer Transaction
    Given I set GET api endpoints Customer Transaction
    When I send GET HTTP request Customer Transaction
    Then I receive valid HTTP response code 200 Customer Transaction

  Scenario: GET - Get list all Customer Transaction with wrong url
      Given I set GET api endpoints Customer Transaction wrong url
      When I send GET HTTP request Customer Transaction wrong url
      Then I receive valid HTTP response code 404 Customer Transaction

  Scenario: GET - Get list all Customer Transaction by ID
    Given I set GET api endpoints Customer Transaction ID
    When I send GET HTTP request Customer Transaction ID
    Then I receive valid HTTP response code 200 Customer Transaction

    Scenario: GET - Get list Customer Transaction wihout ID
      Given I set GET api endpoints Customer Transaction Whithout ID
      When I send GET HTTP request Customer Transaction Whithout ID
      Then I receive valid HTTP response code 404 Customer Transaction

  Scenario: PUT - Put Update Point Customer Transaction
    Given I set PUT api endpoints Update Point
    When  I send PUT HTTP request Update Point
    Then I receive valid HTTP response code 201 Customer Transaction
#
  Scenario: PUT - Put Update Point Empty
    Given I set PUT api endpoints Update Point
    When I send GET HTTP request Update Point Empty
    Then I receive valid HTTP response code 400 Customer Transaction