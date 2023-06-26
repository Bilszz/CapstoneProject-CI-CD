package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class StockTransaction {

    protected String url = "https://3.0.59.152.nip.io/";

    //POST - Add new Stock Transaction
    @Step("I set POST api endpoints Stock_transaction")
    public String setPOSTAPIEndpointsStockTransaction() {
        return url + "stocks/add";
    }

    @Step("I send POST HTTP request Stock_transaction")
    public void sendPOSTAPIEndpointsStockTransaction() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 2);
        requestBody.put("stock_id", 2);
        requestBody.put("provider_name", "Telkomsel");
        requestBody.put("input_stock", 100000);
        requestBody.put("payment_method", "Shopeepay");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5NDMxMjQ2fQ.qNzFnjeuUS55mdE6xaCmQddUnjyMKUhycROa0kZcbcA")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsStockTransaction());
    }

    @Step("I receive valid HTTP response code 201 Stock_transaction")
    public void receiveValidHTTP201StockTransaction() {
        restAssuredThat(response -> response.statusCode(201));
    }

    //POST - Add new Stock Detail without user id
    @Step("I send POST HTTP request user_id")
    public void sendPOSTHTTPRequestUserId() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", "");
        requestBody.put("stock_id", 2);
        requestBody.put("provider_name", "Telkomsel");
        requestBody.put("input_stock", 100000);
        requestBody.put("payment_method", "Shopeepay");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5NDMxMjQ2fQ.qNzFnjeuUS55mdE6xaCmQddUnjyMKUhycROa0kZcbcA")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsStockTransaction());
    }

    //POST - Add new Stock Transaction without key
    @Step("I send POST HTTP request key Stock_transaction")
    public void sendPOSTHTTPRequestkeyStockTransaction() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("", 2);
        requestBody.put("stock_id", 2);
        requestBody.put("provider_name", "Telkomsel");
        requestBody.put("input_stock", 100000);
        requestBody.put("payment_method", "Shopeepay");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5NDMxMjQ2fQ.qNzFnjeuUS55mdE6xaCmQddUnjyMKUhycROa0kZcbcA")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsStockTransaction());
    }

    @Step("I receive valid HTTP response code 400 Stock_transaction")
    public void receiveValidHTTP400StockTransaction() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //POST - add stock by adding a minimum credit
    @Step("I send POST HTTP request add minimum credit")
    public void sendPOSTHTTPRequestAddMinimumCredit() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 2);
        requestBody.put("stock_id", 2);
        requestBody.put("provider_name", "Telkomsel");
        requestBody.put("input_stock", 100);
        requestBody.put("payment_method", "Shopeepay");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5NDMxMjQ2fQ.qNzFnjeuUS55mdE6xaCmQddUnjyMKUhycROa0kZcbcA")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsStockTransaction());
    }

    @Step("I receive valid HTTP response code 500 Stock_transaction")
    public void receiveValidHTTP500StockTransaction() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //GET - Get All Stock Transaction
    @Step("I set GET api endpoints Stock_transaction")
    public String setGETAPIEndpoitsStockTransaction() {
        return url + "stocks/transactions";
    }

    @Step("I send GET HTTP request Stock_transaction")
    public void sendGETHTTPRequestStockTransaction() {
        SerenityRest.given()
        .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5NDMxMjQ2fQ.qNzFnjeuUS55mdE6xaCmQddUnjyMKUhycROa0kZcbcA")
                .get(setGETAPIEndpoitsStockTransaction());
    }

    @Step("I receive valid HTTP response code 200 Stock_transaction")
    public void receiveValidHTTP200StockTransacion() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set GET api endpoints Stock_transactionbyid")
    public String setGETAPIEndpointsStockTransactionById() {
        return url + "stocks/transactions/1";
    }

    @Step("I send GET HTTP request Stock_transactionbyid")
    public void sendGETHTTPRequestStockTransactionById() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5NDMxMjQ2fQ.qNzFnjeuUS55mdE6xaCmQddUnjyMKUhycROa0kZcbcA")
                .get(setGETAPIEndpointsStockTransactionById());
    }

    //GET - Get list all Stock transaction with invalid url
    @Step("I set GET api endpoints invalid url stock_transaction")
    public String setGETAPIEndpointsInvalidUrlStockTransaction() {
        return url + "stocks/transaction";
    }

    @Step("I send GET HTTP request Invalid url Stock_transaction")
    public void sendGETHTTPRequestIvalidUrlStockTransaction() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5NDMxMjQ2fQ.qNzFnjeuUS55mdE6xaCmQddUnjyMKUhycROa0kZcbcA")
                .get(setGETAPIEndpointsInvalidUrlStockTransaction());
    }

    //GET - Get Stock Transaction Invalid Id
    //Ganti token nya saat ingin run
    @Step("I set GET api endpoints Invalid Id Stock_transaction")
    public String setGETAPIEndpointsInvalidIdStockTransaction() {
        return url + "stocks/transactions/40";
    }

    @Step("I send GET HTTP request Invalid Id Stock_transaction")
    public void sendGETHTTPRequestInvalidIdStockTransaction() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5NDMxMjQ2fQ.qNzFnjeuUS55mdE6xaCmQddUnjyMKUhycROa0kZcbcA")
                .get(setGETAPIEndpointsInvalidIdStockTransaction());
    }

    @Step("I receive valid HTTP response code 404 stock_transaction")
    public void receiveValidHTTP404StockTransaction() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
