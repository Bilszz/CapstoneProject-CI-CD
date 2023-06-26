package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class Stocks {

    protected String url = "https://3.0.59.152.nip.io/";


    //GET - Get all stock
    @Step("I set GET api endpoints stock")
    public String setGETAPIEndpointsStock() {
        return url + "stocks";
    }

    @Step("I send GET HTTP request stock")
    public void sendGETHTTPRequestStock() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsStock());
    }

    //GET - Get stock by ID

    @Step("I set GET api endpoints stock")
    public String setGETAPIEndpointsStock_id() {
        return url + "stocks/5";
    }
    @Step("I send GET api endpoints stock")
    public void sendGETTTPRequestStock_id() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsStock_id());
    }

    @Step("I receive valid HTTP response code 200 stock")
    public void receiveValidHttp200Stock(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //GET - Get stock by invalid ID
    @Step("I set GET api endpoints invalid_id")
    public String setGETAPIEndpointsInvalid_id() {
        return url + "stocks/100";
    }

    @Step("I send GET HTTP request invalid_id")
    public void sendGETHTTPRequestInvalid_id() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsInvalid_id());
    }

    //GET - Get stock by invalid URL
    @Step("I set GET api endpoints invalid_url")
    public String setGETAPIEndpointsInvalidUrl() {
        return url + "stock";
    }

    @Step("I send GET HTTP request invalid_url")
    public void sendGETHTTPRequestInvalidUrl() {
        SerenityRest.given()
                .header("Authorization" , " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsInvalidUrl());
    }

    @Step("I receive valid HTTP response code 404 stock")
    public void receiveValidHTTP404Stock() {
        restAssuredThat(response -> response.statusCode(404));
    }

}