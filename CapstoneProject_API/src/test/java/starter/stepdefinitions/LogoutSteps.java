package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Logout;

public class LogoutSteps {

    @Steps
    Logout logout;

    //POST - Logout User with valid credential
    //Ganti token saat ingin run
    @Given("I set POST api endpoints logout_user")
    public void setPostApiEndpointsLogoutUser() {
        logout.setPostApiEndpointsLogoutUser();
    }

    @When("I send POST HTTP request logout_user")
    public void sendPostHttpRequestLogoutUser() {
        logout.sendPostHttpRequestLogoutUser();
    }

    @Then("I receive valid HTTP response code 200 logout_User")
    public void receiveValidHttp200LogoutUser() {
        logout.receiveValidHttp200LogoutUser();
    }

    //POST - Logout User with token expired
    @When("I send POST HTTP request token user expired")
    public void sendPOSTHTTPRequestTokenExpired() {
        logout.sendPOSTHTTPRequestTokenExpired();
    }

    @Then("I receive valid HTTP response code 401 logout_User")
    public void receiveValidHTTP401LogoutUser(){
        logout.receiveValidHTTP401LogoutUser();
    }


}
