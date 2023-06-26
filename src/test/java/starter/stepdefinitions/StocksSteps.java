package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Stocks;

public class StocksSteps {

    @Steps
    Stocks stocks;


    //GET - Get all stock
    @Given("I set GET api endpoints stock")
    public void setGETAPIEndpointsStock() {
        stocks.setGETAPIEndpointsStock();
    }

    @When("I send GET HTTP request stock")
    public void sendGETHTTPRequestStock() {
        stocks.sendGETHTTPRequestStock();
    }

    //GET - Get stock by ID

    @Given("I set GET api endpoints stock_id")
    public void setGETAPIEndpointsStock_id() {
        stocks.setGETAPIEndpointsStock_id();
    }

    @When("I send GET HTTP request stock_id")
    public void sendGETTTPRequestStock_id() {
        stocks.sendGETTTPRequestStock_id();
    }

    @Then("I receive valid HTTP response code 200 stock")
    public void receiveValidHttp200Stock() {
        stocks.receiveValidHttp200Stock();
    }

    //GET - Get stock by invalid ID
    @Given("I set GET api endpoints invalid_id")
    public void setGETAPIEndpointsInvalid_id() {
        stocks.setGETAPIEndpointsInvalid_id();
    }

    @When("I send GET HTTP request invalid_id")
    public void sendGETHTTPRequestInvalid_id() {
        stocks.sendGETHTTPRequestInvalid_id();
    }

    @Then("I receive valid HTTP response code 404 stock")
    public void receiveValidHTTP404Stock() {
        stocks.receiveValidHTTP404Stock();
    }

    //GET - Get stock by invalid URL
    @Given("I set GET api endpoints invalid_url")
    public void setGETAPIEndpointsInvalidUrl() {
        stocks.setGETAPIEndpointsInvalidUrl();
    }

    @When("I send GET HTTP request invalid_url")
    public void sendGETHTTPRequestInvalidUrl() {
        stocks.sendGETHTTPRequestInvalidUrl();
    }







}
