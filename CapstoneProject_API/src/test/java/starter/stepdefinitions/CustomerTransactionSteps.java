package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.CustomerTransaction;

public class CustomerTransactionSteps {

    @Steps
    CustomerTransaction customerTransaction;

    // GET - Get list all Customer Transaction
    @Given("I set GET api endpoints Customer Transaction")
    public void setGETAPIEndpointsCustomerTransaction() {
        customerTransaction.setGETAPIEndpointsCustomerTransaction();
    }

    @When("I send GET HTTP request Customer Transaction")
    public void sendGETGTTPRequestCustomerTransaction() {
        customerTransaction.sendGETGTTPRequestCustomerTransaction();
    }

    //GET - Get list all Customer Transaction with wrong url
    @Given("I set GET api endpoints Customer Transaction wrong url")
    public void setGETAPIEndpointsCustomerTransactionWrong() {
        customerTransaction.setGETAPIEndpointsCustomerTransactionWrong();
    }

    @When("I send GET HTTP request Customer Transaction wrong url")
    public void sendGETHTTPRequestCustomerTransactionWrong() {
        customerTransaction.sendGETHTTPRequestCustomerTransactionWrong();
    }

    @Then("I receive valid HTTP response code 404 Customer Transaction")
    public void receiveValidHTTP404CustomerTransaction() {
        customerTransaction.receiveValidHTTP404CustomerTransaction();
    }


    @Then("I receive valid HTTP response code 200 Customer Transaction")
    public void receiveValidHTTP200CustomerTransaction() {
        customerTransaction.receiveValidHTTP200CustomerTransaction();
    }

    //GET - Get list all Customer Transaction by ID
    @Given("I set GET api endpoints Customer Transaction ID")
    public void setGETAPIEndpointsCustomerTransactionId() {
        customerTransaction.setGETAPIEndpointsCustomerTransactionId();
    }
    @When("I send GET HTTP request Customer Transaction ID")
    public void sendGETHTTPRequestCustomerTransactionId() {
        customerTransaction.sendGETHTTPRequestCustomerTransactionId();
    }

    //PUT - Put Update Point Customer Transaction
    @Given("I set PUT api endpoints Update Point")
    public void setPUTAPIEndpointsUpdatePoint() {
        customerTransaction.setPUTAPIEndpointsUpdatePoint();
    }

    @When("I send PUT HTTP request Update Point")
    public void sendPUTHTTPRequestUPdataePoint() {
        customerTransaction.sendPUTHTTPRequestUPdataePoint();
    }

    @Then("I receive valid HTTP response code 201 Customer Transaction")
    public void receiveValidHTTP201CustomerTransaction() {
        customerTransaction.receiveValidHTTP201CustomerTransaction();
    }

  //GET - Get list Customer Transaction wihout ID
    @Given("I set GET api endpoints Customer Transaction Whithout ID")
    public void setGETapiEndpointsCustomerTrasactionWithoutid() {
        customerTransaction.setGETapiEndpointsCustomerTrasactionWithoutid();
    }

    @When("I send GET HTTP request Customer Transaction Whithout ID")
    public void sendGETHTTPRequestCustomerTransactionWithoutid() {
        customerTransaction.sendGETHTTPRequestCustomerTransactionWithoutid();
    }

    //PUT - Put Update Point Empty

    @When("I send GET HTTP request Update Point Empty")
    public void sendGETHTTPRequestUPdatePointEmpty() {
        customerTransaction.sendGETHTTPRequestUPdatePointEmpty();
    }

    @Then("I receive valid HTTP response code 400 Customer Transaction")
    public void receiveValidHTTP400CustomerTransaction() {
        customerTransaction.receiveValidHTTP400CustomerTransaction();
    }

}
