package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.StockTransaction;

public class StockTransactionSteps {
    @Steps
    StockTransaction stockTransaction;

    //POST - Add new Stock Transaction
    @Given("I set POST api endpoints Stock_transaction")
    public void setPOSTAPIEndpointsStockTransaction() {
        stockTransaction.setPOSTAPIEndpointsStockTransaction();
    }

    @When("I send POST HTTP request Stock_transaction")
    public void sendPOSTAPIEndpointsStockTransaction(){
        stockTransaction.sendPOSTAPIEndpointsStockTransaction();
    }

    @Then("I receive valid HTTP response code 201 Stock_transaction")
    public void receiveValidHTTP201StockTransaction() {
        stockTransaction.receiveValidHTTP201StockTransaction();
    }

    //POST - Add new Stock Transaction without user id
    @When("I send POST HTTP request user_id")
    public void sendPOSTHTTPRequestUserId() {
        stockTransaction.sendPOSTHTTPRequestUserId();
    }

    //POST - Add new Stock Transaction without key

    @When("I send POST HTTP request key Stock_transaction")
    public void sendPOSTHTTPRequestkeyStockTransaction() {
        stockTransaction.sendPOSTHTTPRequestkeyStockTransaction();
    }

    @Then("I receive valid HTTP response code 400 Stock_transaction")
    public void receiveValidHTTP400StockTransaction() {
        stockTransaction.receiveValidHTTP400StockTransaction();
    }

    //POST - add stock by adding a minimum credit
    @When("I send POST HTTP request add minimum credit")
    public void sendPOSTHTTPRequestAddMinimumCredit() {
        stockTransaction.sendPOSTHTTPRequestAddMinimumCredit();
    }

    @Then("I receive valid HTTP response code 500 Stock_transaction")
    public void receiveValidHTTP500StockTransaction() {
        stockTransaction.receiveValidHTTP500StockTransaction();
    }

    //GET - Get All Stock Transaction
    @Given("I set GET api endpoints Stock_transaction")
    public void setGETAPIEndpoitsStockTransaction() {
        stockTransaction.setGETAPIEndpoitsStockTransaction();
    }

    @When("I send GET HTTP request Stock_transaction")
    public void sendGETHTTPRequestStockTransaction() {
        stockTransaction.sendGETHTTPRequestStockTransaction();
    }

    @Then("I receive valid HTTP response code 200 Stock_transaction")
    public void receiveValidHTTP200StockTransacion() {
        stockTransaction.receiveValidHTTP200StockTransacion();
    }

    //GET - Get Stock Transaction By Id
    @Given("I set GET api endpoints Stock_transactionbyid")
    public void setGETAPIEndpointsStockTransactionById() {
        stockTransaction.setGETAPIEndpointsStockTransactionById();
    }

    @When("I send GET HTTP request Stock_transactionbyid")
    public void sendGETHTTPRequestStockTransactionById(){
        stockTransaction.sendGETHTTPRequestStockTransactionById();
    }

    //GET - Get list all Stock transaction with invalid url
    @Given("I set GET api endpoints invalid url stock_transaction")
    public void setGETAPIEndpointsInvalidUrlStockTransaction() {
        stockTransaction.setGETAPIEndpointsInvalidUrlStockTransaction();
    }

    @When("I send GET HTTP request Invalid url Stock_transaction")
    public void sendGETHTTPRequestIvalidUrlStockTransaction() {
        stockTransaction.sendGETHTTPRequestIvalidUrlStockTransaction();
    }

    //GET - Get Stock Transaction Invalid Id
    @Given("I set GET api endpoints Invalid Id Stock_transaction")
    public void setGETAPIEndpointsInvalidIdStockTransaction() {
        stockTransaction.setGETAPIEndpointsInvalidIdStockTransaction();
    }

    @When("I send GET HTTP request Invalid Id Stock_transaction")
    public void sendGETHTTPRequestInvalidIdStockTransaction(){
        stockTransaction.sendGETHTTPRequestInvalidIdStockTransaction();
    }

    @Then("I receive valid HTTP response code 404 stock_transaction")
    public void receiveValidHTTP404StockTransaction() {
        stockTransaction.receiveValidHTTP404StockTransaction();
    }



}