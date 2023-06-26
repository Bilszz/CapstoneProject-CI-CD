package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Transaction {

    protected String url = "https://3.0.59.152.nip.io/";

    //POST = Post add new transaction
    @Step("I set POST api endpoints Transaction")
    public String setPOSTAPIEndpointsTransation() {
        return url + "transactions";
    }

    @Step("I send POST HTTP request Transaction")
    public void sendPOSTHTTPrequestTransaction() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("phone", "081382815860");
        requestBody.put("stock_details_id", 2);
        requestBody.put("payment_method", "shoope");
        requestBody.put("user_id", 2);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6OCwicm9sZSI6ImN1c3RvbWVyIiwiZXhwIjoxNjkwMjEzMjcwfQ.wjqxWHZq4vjgFx0gjAWCKIieujeghceWz38oZEGCjT0")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsTransation());
    }

    @Step("I receive valid HTTP response code 201 Transaction")
    public void receiveValidHTTP201Transaction() {
        restAssuredThat(response -> response.statusCode(201));
    }

    //POST - Pos Add new transaction phone empty
    @Step("I send POST HTTP request Transaction empty_phone")
    public void sendPOSTHTTPRequestTransactionEmptyPhone() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("phone", "");
        requestBody.put("user_id", 2);
        requestBody.put("voucher_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6OCwicm9sZSI6ImN1c3RvbWVyIiwiZXhwIjoxNjkwMjEzMjcwfQ.wjqxWHZq4vjgFx0gjAWCKIieujeghceWz38oZEGCjT0")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsTransation());
    }

    @Step("I receive valid HTTP response code 400 Transaction")
    public void receiveHTTP400Transaction() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send POST HTTP request Transaction wrong_userid")
    public void sendPOSTHTTPRequestTransactionWrongUserId() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("phone", "081382815860");
        requestBody.put("stock_details_id", 1);
        requestBody.put("payment_method", "shoope");
        requestBody.put("user_id", 2);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6OCwicm9sZSI6ImN1c3RvbWVyIiwiZXhwIjoxNjkwMjEzMjcwfQ.wjqxWHZq4vjgFx0gjAWCKIieujeghceWz38oZEGCjT0")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsTransation());
    }

    @Step("I receive valid HTTP response code 500 Transaction")
    public void receiveValidHTTP500Transaction() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //GET - Get All User Id ( Transaction history )
    @Step("I set GET api endpoints All user id_history")
    public String setGETAPIEndpointsAllUserId() {
        return url + "transactions/users/2";
    }

    @Step("I send GET HTTP request All user id_history")
    public void sendGETHTTPRequestAllUserId() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsAllUserId());
    }

    //GET - Get add new transaction By Id
    @Step("I set POST api endpoints Transaction_ById")
    public String setGETAPIEndpointsTransactionById() {
        return url + "transactions/2";
    }

    @Step("I send GET HTTP request Transaction_ById")
    public void sendGETHTTPrequestTransactionById() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsTransactionById());
    }

    //GET - Get All Stock Details By Stock Id
    @Step("I set GET api endpoints All By Stock_id")
    public String setGETAPIEndpointsAllByStockId() {
        return url + "stocks/details/bystocks/1";
    }

    @Step("I send GET HTTP request All By Stock_id")
    public void sendGETHTTPRequestAllByStockId() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsAllByStockId());
    }

    @Step("I receive valid HTTP response code 200 transaction")
    public void receiveValidHTTP200Transaction() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //GET - Get list all by id invalid url
    @Step("I set GET api endpoints invalid url all_byidtransaction")
    public String setGETEndpointsInvalidUrlTransactionById() {
        return url + "transactions/users/";
    }

    @Step("I send GET HTTP request invalid url all_byidtransaction")
    public void sendGETHTTPRequestInvalidUrlransactionById() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETEndpointsInvalidUrlTransactionById());
    }

}
