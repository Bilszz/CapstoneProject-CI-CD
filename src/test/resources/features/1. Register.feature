@registertest
Feature: Register

  As a user or admin
  I want to create new account
  So that I can login

  Scenario: POST - Register with valid data
    Given I set POST api endpoints register
    When I send POST HTTP request register
    Then I receive valid HTTP response code 201 register

  Scenario: POST - Register without name
    Given I set POST api endpoints register
    When I send POST HTTP request register2
    Then I receive valid HTTP response code 400 register

  Scenario: POST - Register without email
    Given I set POST api endpoints register
    When I send POST HTTP request register3
    Then I receive valid HTTP response code 400 register

  Scenario: POST - Register without password
    Given I set POST api endpoints register
    When I send POST HTTP request register4
    Then I receive valid HTTP response code 400 register

  Scenario: POST - Register with existed account
    Given I set POST api endpoints register
    When I send POST HTTP request register5
    Then I receive valid HTTP response code 400 register

