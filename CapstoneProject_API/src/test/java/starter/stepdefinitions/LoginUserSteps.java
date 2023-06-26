package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.LoginUser;

public class LoginUserSteps {

    @Steps
    LoginUser loginUser;

    // Positive

    @Given("I set POST api endpoints login")
    public void setPostApiEndpointsLogin() {
        loginUser.setPostApiEndpointLogin();
    }

    @When("I send POST HTTP request login")
    public void sendPostHttpRequestLogin() {
        loginUser.sendPostHttpRequestLogin();
    }

    @When("I send POST HTTP request login1")
    public void sendPostHttpRequestLogin1() {
        loginUser.sendPostHttpRequestLogin1();
    }

    @When("I send POST HTTP request login2")
    public void sendPostHttpRequestLogin2() {
        loginUser.sendPostHttpRequestLogin2();
    }

    @When("I send POST HTTP request login3")
    public void sendPostHttpRequestLogin3() {
        loginUser.sendPostHttpRequestLogin3();
    }

    @When("I send POST HTTP request login4")
    public void sendPostHttpRequestLogin4() {
        loginUser.sendPostHttpRequestLogin4();
    }

    @When("I send POST HTTP request login5")
    public void sendPostHttpRequestLogin5() {
        loginUser.sendPostHttpRequestLogin5();
    }

    @Then("I receive valid HTTP response code 200 login")
    public void receiveValidHttp200Login() {
        loginUser.receiveValidHttp200Login();
    }

    @Then("I receive valid HTTP response code 401 login")
    public void receiveValidHttp401Login() {
        loginUser.receiveValidHttp401Login();
    }

    @Then("I receive valid HTTP response code 400 login")
    public void receiveValidHttp400Login() {
        loginUser.receiveValidHttp400Login();
    }
}
