package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CustomerTransaction {

    protected String url = "https://3.0.59.152.nip.io/";

    // GET - Get list all providers
    @Step("I set GET api endpoints Customer Transaction")
    public String setGETAPIEndpointsCustomerTransaction() {
        return url + "transactions";
    }

    @Step("I send GET HTTP request Customer Transaction")
    public void sendGETGTTPRequestCustomerTransaction() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsCustomerTransaction());
    }

    //GET - Get provider by ID
    @Step("I set GET api endpoints Customer Transaction ID")
    public String setGETAPIEndpointsCustomerTransactionId() {
        return url + "transactions/1";
    }

    @Step("I send GET HTTP request Customer Transaction ID")
    public void sendGETHTTPRequestCustomerTransactionId() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsCustomerTransactionId());
    }

    @Step("I receive valid HTTP response code 200 Customer Transaction")
    public void receiveValidHTTP200CustomerTransaction(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //PUT - Put Update Point Customer Transaction
    @Step("I set PUT api endpoints Update Point")
    public String setPUTAPIEndpointsUpdatePoint() {
        return url + "transactions/5";
    }

    @Step("I send PUT HTTP request Update Point")
    public void sendPUTHTTPRequestUPdataePoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("point", 20);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .put(setPUTAPIEndpointsUpdatePoint());
    }

    @Step("I receive valid HTTP response code 201 Customer Transaction")
    public void receiveValidHTTP201CustomerTransaction() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // GET - Get list all with wrong url
    @Step("I set GET api endpoints Customer Transaction wrong url")
    public String setGETAPIEndpointsCustomerTransactionWrong() {
        return url + "transaction";
    }

    @Step("I send GET HTTP request Customer Transaction wrong url")
    public void sendGETHTTPRequestCustomerTransactionWrong() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsCustomerTransactionWrong());
    }

    @Step("I receive valid HTTP response code 404 Transaction wrong url")
    public void receiveValidHTTP404CustomerTransaction() {
        restAssuredThat(response -> response.statusCode(404));
    }


    //GET - Get provider by invalid ID
    @Step("I set GET api endpoints Customer Transaction Whithout ID")
    public String setGETapiEndpointsCustomerTrasactionWithoutid() {
        return url + "transactions/";
    }

    @Step("I send GET HTTP request Customer Transaction Whithout ID")
    public void sendGETHTTPRequestCustomerTransactionWithoutid() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETapiEndpointsCustomerTrasactionWithoutid());
    }

    //PUT - Put Update Point Empty
    @Step("I send GET HTTP request Update Point Emptyy")
    public void sendGETHTTPRequestUPdatePointEmpty() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("point", "");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .put(setPUTAPIEndpointsUpdatePoint());
    }

    @Step("I receive valid HTTP response code 400 Customer Transaction")
    public void receiveValidHTTP400CustomerTransaction() {
        restAssuredThat(response -> response.statusCode(400));
    }


}
