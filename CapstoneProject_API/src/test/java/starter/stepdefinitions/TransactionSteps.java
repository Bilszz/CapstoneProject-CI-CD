package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.Transaction;

public class TransactionSteps {

    //POST = Post add new transaction
    @Steps
    Transaction transaction;

    @Given("I set POST api endpoints Transaction")
    public void setPOSTAPIEndpointsTransation() {
        transaction.setPOSTAPIEndpointsTransation();
    }

    @When("I send POST HTTP request Transaction")
    public void sendPOSTHTTPrequestTransaction() {
        transaction.sendPOSTHTTPrequestTransaction();
    }


    @Then("I receive valid HTTP response code 201 Transaction")
    public void receiveValidHTTP201Transaction() {
        transaction.receiveValidHTTP201Transaction();
    }

    //POST - Pos Add new transaction phone empty
    @When("I send POST HTTP request Transaction empty_phone")
    public void sendPOSTHTTPRequestTransactionEmptyPhone() {
        transaction.sendPOSTHTTPRequestTransactionEmptyPhone();
    }

    @Then("I receive valid HTTP response code 400 Transaction")
    public void receiveHTTP400Transaction() {
        transaction.receiveHTTP400Transaction();
    }

    //POST - Post add new transaction wrong user_id
    @When("I send POST HTTP request Transaction wrong_userid")
    public void sendPOSTHTTPRequestTransactionWrongUserId() {
        transaction.sendPOSTHTTPRequestTransactionWrongUserId();
    }

    @Then("I receive valid HTTP response code 500 Transaction")
    public void receiveValidHTTP500Transaction() {
        transaction.receiveValidHTTP500Transaction();
    }


    //GET - Get All User Id ( Transaction history )
    @Given("I set GET api endpoints All user id_history")
    public void setGETAPIEndpointsAllUserId() {
        transaction.setGETAPIEndpointsAllUserId();
    }

    @When("I send GET HTTP request All user id_history")
    public void sendGETHTTPRequestAllUserId() {
        transaction.sendGETHTTPRequestAllUserId();
    }

    //GET - Get add new transaction By Id
    @Given("I set GET api endpoints Transaction_ById")
    public void setGETAPIEndpointsTransactionById() {
        transaction.setGETAPIEndpointsTransactionById();
    }

    @When("I send GET HTTP request Transaction_ById")
    public void sendGETHTTPrequestTransactionById() {
        transaction.sendGETHTTPrequestTransactionById();
    }

    @Then("I receive valid HTTP response code 200 transaction")
    public void receiveValidHTTP200Transaction() {
        transaction.receiveValidHTTP200Transaction();
    }

    //GET - Get All Stock Details By Stock Id
    @Given("I set GET api endpoints All By Stock_id")
    public void setGETAPIEndpointsAllByStockId() {
        transaction.setGETAPIEndpointsAllByStockId();
    }

    @When("I send GET HTTP request All By Stock_id")
    public void sendGETHTTPRequestAllByStockId() {
        transaction.sendGETHTTPRequestAllByStockId();
    }

    //GET - Get list all by id invalid url
    @Given("I set GET api endpoints invalid url all_byidtransaction")
    public void setGETEndpointsInvalidUrlTransactionById() {
        transaction.setGETEndpointsInvalidUrlTransactionById();
    }

    @Then("I send GET HTTP request invalid url all_byidtransaction")
    public void sendGETHTTPRequestInvalidUrlransactionById() {
        transaction.sendGETHTTPRequestInvalidUrlransactionById();
    }
}
