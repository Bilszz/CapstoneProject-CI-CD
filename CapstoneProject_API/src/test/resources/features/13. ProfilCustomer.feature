@profilcustomertest
Feature: Profil Customer


  #Positif - GET
  Scenario: GET - Get Profil Customer By Id
    Given I set GET api endpoints Profil_CustomerId
    When I send GET HTTP request Profil_CustomerId
    Then I receive valid HTTP response code 200 Profil_Customer

    Scenario: GET - Get Add Profil Customer Picture
      Given I set GET api endpoints ProfilCustomer_Picture
      When I send GET HTTP request ProfilCustomer_Picture
      Then I receive valid HTTP response code 200 Profil_Customer

      #Negatif - GET
  Scenario: GET - Get Profil Customer By Id wrong Url
    Given I set GET api endpoints ProfilCustomer_WrongUrl
    When I send GET HTTP request ProfilCustomer_WrongUrl
    Then I receive valid HTTP response code 404 Profil_Customer

    Scenario: GET - Get Add Profil Picture Wrong Format
      Given I set GET api endpoints ProfilCustomer_Wrongformat
      When I send GET HTTP request ProfilCustomer_Wrongformat
      Then I receive valid HTTP response code 404 Profil_Customer

      #Positif - PUT
  Scenario: PUT - Put Update Profil Customer
    Given I set PUT api endpoints UpdateProfil_Customer
    When I send PUT HTTP request UpdateProfil_Customer
    Then I receive valid HTTP response code 200 Profil_Customer

  Scenario: PUT - Put Update password Profil Customer
    Given I set PUT api endpoints Update password
    When I send PUT HTTP request Update password
    Then I receive valid HTTP response code 200 Profil_Customer

#    Scenario: PUT - Put Update Picture Profil Customer
#      Given I set PUT api endpoints UpdatePicture_ProfilCustomer
#      When I send PUT HTTP request UpdatePicture_ProfilCustomer
#      Then I receive valid HTTP response code 200 Profil_Customer

    #Negatif - PUT
  Scenario: PUT - Put Update password Profil Customer Wrong Id
    Given I set PUT api endpoints UpdateProfil_WrongId
    When I send PUT HTTP request UpdateProfil_WrongId
    Then I receive valid HTTP response code 404 Profil_Customer

    Scenario: PUT - Put Update Profil Customer Empty Value
      Given I set PUT api endpoints UpdateProfil_Customer
      When I send PUT HTTP request UpdateProfil_EmptyValue
      Then I receive valid HTTP response code 400 Profil_Customer