@customerdatatest
Feature: Customer Data

  As a admin
  I want to view All Customer Data
  So that I can update Customer data

  #positif - GET
  Scenario: GET - Get All Customers
    Given I set GET api endpoints Customer_data
    When I send GET HTTP request Customer_data
    Then I receive valid HTTP response code 200 Customer_data

  Scenario: GET - Get All Customer Data By Id
    Given I set GET api endpoints Customer_data by id
    When I send GET HTTP request Customer_data by id
    Then I receive valid HTTP response code 200 Customer_data

  Scenario: GEt - Get Recent Activities
    Given I set GET api endpoints Recent_activities
    When I send GET HTTP request Recent_activities
    Then I receive valid HTTP response code 200 Customer_data

    #Negatif - GET
  Scenario: GET - Get Invalid Url All Customers
    Given I set GET api endpoints Invalid Url Customer_data
    When I send GET HTTP request Invalid Url Customer_data
    Then I receive valid HTTP response code 404 Customer_data

    Scenario: GET - Get Invalid All Customer Data By Id
      Given I set GET api endpoints Invalid Customer_data by id
      When I send GET HTTP request Invalid Customer_data by id
      Then I receive valid HTTP response code 404 Customer_data

      #Positif - PUT
  Scenario: PUT - Put update Customer Data
    Given I set PUT api endpoints Customer_data
    When I send PUT HTTP request Customer_data
    Then I receive valid HTTP response code 200 Customer_data

    #Negatif - PUT
  Scenario: PUT - Update customer data without email
    Given I set PUT api endpoints Customer_data
    When I send PUT HTTP request customer_datawithoutemail
    Then I receive valid HTTP response code 400 Customer_data

  Scenario: DELETE - Delete customer data
    Given I set DELETE api endpoints Customer_data
    When I send DELETE HTTP request Customer_data
    Then  I receive valid HTTP response code 200 Customer_data


