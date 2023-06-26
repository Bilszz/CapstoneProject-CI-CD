package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.ProfilCustomer;

public class ProfilCustomerSteps {

    @Steps
    ProfilCustomer profilCustomer;

    //GET - Get Profil Customer By Id
    @Given("I set GET api endpoints Profil_CustomerId")
    public void setGETAPIEndpointsProfilCustomerId() {
        profilCustomer.setGETAPIEndpointsProfilCustomerId();
    }

    @When("I send GET HTTP request Profil_CustomerId")
    public void sendGETHTTPRequestProfilCustomerId() {
        profilCustomer.sendGETHTTPRequestProfilCustomerId();
    }

    //GET - Get Profil Customer Picture
    @Given("I set GET api endpoints ProfilCustomer_Picture")
    public void setGETAPIEndpointsProfilCustomerPicture() {
        profilCustomer.setGETAPIEndpointsProfilCustomerPicture();
    }

    @When("I send GET HTTP request ProfilCustomer_Picture")
    public void sendGETHTTPRequestProfilCustomerPicture() {
        profilCustomer.sendGETHTTPRequestProfilCustomerPicture();
    }

    @Then("I receive valid HTTP response code 200 Profil_Customer")
    public void receiveValidHTTP200ProfilCustomer() {
        profilCustomer.receiveValidHTTP200ProfilCustomer();
    }

    //GET - Get Profil Customer By Id wrong Url
    @Given("I set GET api endpoints ProfilCustomer_WrongUrl")
    public void setGETAPIEndpointsProfilCustomerWrongUrl() {
        profilCustomer.setGETAPIEndpointsProfilCustomerWrongUrl();
    }

    @When("I send GET HTTP request ProfilCustomer_WrongUrl")
    public void sendGETHTTPREquestProfilCustomerWrongUrl() {
        profilCustomer.sendGETHTTPREquestProfilCustomerWrongUrl();
    }

    @Then("I receive valid HTTP response code 404 Profil_Customer")
    public void receiveValidHTTP404ProfilCustomer() {
        profilCustomer.receiveValidHTTP404ProfilCustomer();
    }

    //GET - Get Add Profil Picture Wrong Format
    @Given("I set GET api endpoints ProfilCustomer_Wrongformat")
    public void setGETAPIEndpointsProfilCustomerWrongFormat() {
        profilCustomer.setGETAPIEndpointsProfilCustomerWrongFormat();
    }

    @When("I send GET HTTP request ProfilCustomer_Wrongformat")
    public void sendGETHTTPRequestProfilCustomerWrongFormat() {
        profilCustomer.sendGETHTTPRequestProfilCustomerWrongFormat();
    }

    //PUT - Put Update Profil Customer
    @Given("I set PUT api endpoints UpdateProfil_Customer")
    public void setPUTAPIEndpointsUpdateProfilCustomer() {
        profilCustomer.setPUTAPIEndpointsUpdateProfilCustomer();
    }

    @When("I send PUT HTTP request UpdateProfil_Customer")
    public void sendPUTHTTPRequestUpdateProfilCustomer() {
        profilCustomer.sendPUTHTTPRequestUpdateProfilCustomer();
    }

    //PUT - Put Update password Profil Customer
    @Given("I set PUT api endpoints Update password")
    public void setPUTAPIEndpointsUpdatePassword() {
        profilCustomer.setPUTAPIEndpointsUpdatePassword();
    }

    //PUT - Put Update Picture Profil Customer
//    @Given("I set PUT api endpoints UpdatePicture_ProfilCustomer")
//    public void setPUTAPIEndpointsUPdatePIctureProfilCustomer() {
//        profilCustomer.setPUTAPIEndpointsUPdatePIctureProfilCustomer();
//    }
//
//    @When("I send PUT HTTP request UpdatePicture_ProfilCustomer")
//    public void sendPUTHTTPRequestUpdatePictureprofilCustomer() {
//        profilCustomer.sendPUTHTTPRequestUpdatePictureprofilCustomer();
//    }

    @When("I send PUT HTTP request Update password")
    public void sendPUTHTTPRequestUpdatePassword() {
        profilCustomer.sendPUTHTTPRequestUpdatePassword();
    }

    //PUT - Put Update Profil Customer Wrong Id
    @Given("I set PUT api endpoints UpdateProfil_WrongId")
    public void setPUTAPIEndpointsUPdateProfilWrongId() {
        profilCustomer.setPUTAPIEndpointsUPdateProfilWrongId();
    }

    @When("I send PUT HTTP request UpdateProfil_WrongId")
    public void sendPUTHTTPRequestUpdateProfilWrongId() {
        profilCustomer.sendPUTHTTPRequestUpdateProfilWrongId();
    }

    //PUT - Put Update Profil Customer Empty Velue

    @When("I send PUT HTTP request UpdateProfil_EmptyValue")
    public void sendPUTHTTPRequestUpateProfilEmptyValue() {
        profilCustomer.sendPUTHTTPRequestUpateProfilEmptyValue();
    }

    @Then("I receive valid HTTP response code 400 Profil_Customer")
    public void receiveValidHTTp400ProfilCustomer() {
        profilCustomer.receiveValidHTTp400ProfilCustomer();
    }

}
