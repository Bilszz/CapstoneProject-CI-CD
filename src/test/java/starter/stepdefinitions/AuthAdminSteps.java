package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.AuthAdmin;

public class AuthAdminSteps {

    @Steps
    AuthAdmin authAdmin;

    //POST - Login Admin with valid credential
    @Given("I set POST api endpoints login_admin")
    public void setPOSTAPIEndpointsLoginAdmin() {
        authAdmin.setPOSTAPIEndpointsLoginAdmin();
    }

    @When("I send POST HTTP request login_admin")
    public void sendPOSTHTTPRequestLoginAdmin() {
        authAdmin.sendPOSTHTTPRequestLoginAdmin();
    }

    @Then("I receive valid HTTP response code 200 login_admin")
    public void receiveValidHTTP200LoginAdmin() {
        authAdmin.receiveValidHTTP200LoginAdmin();
    }

    //POST - Login Admin wrong password
    @When("I send POST HTTP request invalid password admin")
    public void sendPOSTHTTPRequestInvalidLoginAdmin() {
        authAdmin.sendPOSTHTTPRequestInvalidLoginAdmin();
    }

    @Then("I receive valid HTTP response code 401 login_admin")
    public void receivePOSTHTTP401LoginAdmin() {
        authAdmin.receivePOSTHTTP401LoginAdmin();
    }


    //POST - Login Admin with empty email
    @When("I send POST HTTP request invalid email admin")
    public void sendPOSTHTTPRequestInvalidEmailAdmin() {
        authAdmin.sendPOSTHTTPRequestInvalidEmailAdmin();
    }


    //POST - Login Admin with empty value
    @When("I send POST HTTP request empty value admin")
    public void sendPOSTHTTPRequestEmptyValueAdmin() {
        authAdmin.sendPOSTHTTPRequestEmptyValueAdmin();
    }

    @Then("I receive valid HTTP response code 400 login_admin")
    public void receiveValidHTTP400LoginAdmin() {
        authAdmin.receiveValidHTTP400LoginAdmin();
    }

    //POST - Logout Admin with valid credential
    @Given("I set POST api endpoints logout_admin")
    public void setPOSTAPIEndpointsLogout_admin() {
        authAdmin.setPOSTAPIEndpointsLogout_admin();
    }

    @When("I send POST HTTP request logout_admin")
    public void sendPOSTHTTPRequestLogoutAdmin() {
        authAdmin.sendPOSTHTTPRequestLogoutAdmin();
    }

    @Then("I receive valid HTTP response code 200 logout_admin")
    public void receiveValidHTTP200LogoutAdmin() {
        authAdmin.receiveValidHTTP200LogoutAdmin();
    }

    //POST - Logout Admin with token expired
    @When("I send POST HTTP request token admin expired")
    public void sendPOSTHTTPRequestTokenAdminExpired() {
        authAdmin.sendPOSTHTTPRequestTokenAdminExpired();
    }
}
