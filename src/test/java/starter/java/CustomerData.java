package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CustomerData {

    protected String url = "https://3.0.59.152.nip.io/";

    //GET - Get All Customers

    @Step("I set GET api endpoints Customer_data")
    public String setGETAPIEndpointsCustomerData() {
        return url + "users/customers";
    }

    @Step("I send GET HTTP request Customer_data")
    public void sendGETHTTPendpointsCustomerdata() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsCustomerData());
    }

    //GET - Get All Customer Data By Id
    @Step("I set GET api endpoints Customer_data by id")
    public String setGETAPIEndpointsCustomerById() {
        return url + "users/2";
    }

    @Step("I send GET HTTP request Customer_data by id")
    public void sendGETHTTPRequestCustomerById() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsCustomerById());
    }

    //Get - Recent Activities
    @Step("I set GET api endpoints Recent_activities")
    public String setGETAPIEndpointsRecentActivities() {
        return url + "transactions/users/recent/2";
    }

    @Step("I send GET HTTP request Recent_activities")
    public void sendGETHTTPRequestRecentActivities() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsRecentActivities());
    }

    @Step("I receive valid HTTP response code 200 Stock_detail")
    public void receiveValidHTTP200CustomerData() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //GET - Get Invalid Url All Customers
    @Step("I set GET api endpoints Invalid Url Customer_data")
    public String setGETEndpointsInvalidUrlCustomerData() {
        return url + "users/customer";
    }

    @Step("I send GET HTTP request Invalid Url Customer_data")
    public void sendGETHTTPRequestInvalidUrlCustomerData() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETEndpointsInvalidUrlCustomerData());
    }

    //GET - Get Invalid All Customer Data By Id
    @Step("I set GET api endpoints Invalid Customer_data by id")
    public String setGETAPIendpointsInvalidCustomerDataById() {
        return url + "users/5";
    }

    @Step("I send GET HTTP request Invalid Customer_data by id")
    public void sendGETHTTPRequestInvalidCustomerDataById() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIendpointsInvalidCustomerDataById());
    }

    @Step("I receive valid HTTP response code 404 Customer_data")
    public void receiveValidHTTP404CustomerData() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //PUT - Put update Customer Data
    @Step("I set PUT api endpoints Customer_data")
    public String setPUTAPIEndpointsCustomerData() {
        return url + "users/profiles/customer/edit/2";
    }

    @Step("I send PUT HTTP request Customer_data")
    public void sendPUTHTTPRequestCustomerData() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "newCustomerEmail@example.com");
        requestBody.put("phone", "082218807767");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .put( setPUTAPIEndpointsCustomerData());
    }

    //PUT - Update customer data without email
    @Step("I send PUT HTTP request customer_datawithoutemail")
    public void sendPUTRequestCustomerDatawithoutEmail() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("phone", "082218807767");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .put( setPUTAPIEndpointsCustomerData());
    }

    @Step("I receive valid HTTP response code 400 Customer_data")
    public void receiveValidHHTP400CustomerData() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //DELETE - Delete customer data
    //Ganti URL saat akan run
    @Step("I set DELETE api endpoints Customer_data")
    public String setDELETEEnspointsCustomerData() {
        return url + "users/customers/27";
    }

    @Step("I send DELETE HTTP request Customer_data")
    public void sendDELETEHTTPRequestCustomerData() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .delete(setDELETEEnspointsCustomerData());
    }

}
