package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.StockDetail;

public class StockDetailSteps {

    @Steps
    StockDetail stockDetail;

    //POST - Add new Stock Detail
    @Given("I set POST api endpoints Stock_detail")
    public void setPOSTAPIEndpointsStockDetail() {
        stockDetail.setPOSTAPIEndpointsStockDetail();
    }

    @When("I send POST HTTP request Stock_detail")
    public void sendPOSTHTTPRequestStockDetail() {
        stockDetail.sendPOSTHTTPRequestStockDetail();
    }

    @Then("I receive valid HTTP response code 201 Stock_detail")
    public void receiveValidHTTP201StockDetail() {
        stockDetail.receiveValidHTTP201StockDetail();
    }

    //POST - Add new Stock Detail without stock id
    @When("I send POST HTTP request stock_id")
    public void sendPOSTHTTPrequestStockId() {
        stockDetail.sendPOSTHTTPrequestStockId();
    }

    @Then("I receive valid HTTP response code 400 Stock_detail")
    public void receiveValidHTTP400StockDetail() {
        stockDetail.receiveValidHTTP400StockDetail();
    }

    //POST - Add new Stock Detail without key
    @When("I send POST HTTP request key Stock_detail")
    public void sendPOSTHTTPRequestKeystockdetail() {
        stockDetail.sendPOSTHTTPRequestKeystockdetail();
    }

    //GET - Get All Stock Detail
    @Given("I set GET api endpoints Stock_detail")
    public void setGETAPIEndpoinstsStockDetail() {
        stockDetail.setGETAPIEndpoinstsStockDetail();
    }

    @When("I send GET HTTP request Stock_detail")
    public void sendGETHTTPRequestStockDetail() {
        stockDetail.sendGETHTTPRequestStockDetail();
    }

    @Then("I receive valid HTTP response code 200 Stock_detail")
    public void receiveGETHTTP200tsockDetail() {
        stockDetail.receiveGETHTTP200tsockDetail();
    }

    //GET - Get Stock Detail By id
    @Given("I set GET api endpoints Stock_detail Id")
    public void setGETAPIendpointsStockDetailId() {
        stockDetail.setGETAPIendpointsStockDetailId();
    }

    @When("I send GET HTTP request Stock_detail Id")
    public void sendGETHTTPRequestDetailId() {
        stockDetail.sendGETHTTPRequestDetailId();
    }

    //GET - Get All Stock Detail By id
    @Given("I set GET api endpoints All Stock_detail Id")
    public void setGETAPIEndpointsAllStockDetailId() {
        stockDetail.setGETAPIEndpointsAllStockDetailId();
    }

    @When("I send GET HTTP request All Stock_detail id")
    public void sendGETHTTPRequestAllStockDetailid() {
        stockDetail.sendGETHTTPRequestAllStockDetailid();
    }

    //GET - Get list all Stock with invalid url
    @Given("I set GET api endpoints invalid url stock_detail")
    public void setGETAPIEndpointsInvalidUrl() {
        stockDetail.setGETAPIEndpointsInvalidUrl();
    }

    @When("I send GET HTTP request invalid url stock_detail")
    public void sendGETHTTPRequestInvalidUrl() {
        stockDetail.sendGETHTTPRequestInvalidUrl();
    }

    @Then("I receive valid HTTP response code 404 stock_detail")
    public void receiveValidHTTP404StockDetail() {
        stockDetail.receiveValidHTTP404StockDetail();
    }

    //GET - Get Stock Detail Invalid By id
    @Given("I set GET api endpoints invalid Stock_detail Id")
    public void setGETAPIEndpointsInvalidStockDetailId() {
        stockDetail.setGETAPIEndpointsInvalidStockDetailId();
    }

    @When("I send GET HTTP request invalid Stock_detail Id")
    public void sendGETHTTPRequestInvalidStockDetailId() {
        stockDetail.sendGETHTTPRequestInvalidStockDetailId();
    }

    //GET - Get All Stock Detail invalid url By All id
    @Given("I set GET api endpoints Invalid Stock_detail All Id")
    public void setGETAPIEndpointsInvalidAllId() {
        stockDetail.setGETAPIEndpointsInvalidAllId();
    }
    @When("I send GET HTTP request Invalid Stock_detail All Id")
    public void sendGETAPIEndpointsInvalidAllId() {
        stockDetail.sendGETAPIEndpointsInvalidAllId();
    }

    //PUT - Put update stock
    @Given("I set PUT api endpoints Stock_detail")
    public void setPUTEndpointsStockDetail() {
        stockDetail.setPUTEndpointsStockDetail();
    }

    @When("I send PUT HTTP request Update_stock")
    public void sendPUTHTTPRequestUpdate() {
        stockDetail.sendPUTHTTPRequestUpdate();
    }

    //PUT - Update stock without fill stock
    @When("I send PUT HTTP request Update without stock")
    public void sendPUTHTTPrequestUpdateWithoutStock() {
        stockDetail.sendPUTHTTPrequestUpdateWithoutStock();
    }

    //DELETE - Delete all Stock Detail
    @Given("I set DELETE api endpoints stock_detail")
    public void setDELETEAPIedpointsStockDetail(){
        stockDetail.setDELETEAPIedpointsStockDetail();
    }

    @When("I send DELETE HTTP request stock_detail")
    public void sendDELETEHTTPRequestStockDetail() {
        stockDetail.sendDELETEHTTPRequestStockDetail();
    }

}