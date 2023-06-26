package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class RedeemBenefit {

    protected String url = "https://3.0.59.152.nip.io/";

    //GET - Get Voucher
    @Step("I set GET api endpoints Voucher")
    public String setGETAPIEndpointsVoucher() {
        return url + "vouchers";
    }

    @Step("I send GET HTTP request voucher")
    public void sendGETHTTPRequestVoucher() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsVoucher());
    }

    //GET - Get By Id Voucher
    @Step("I set GET api endpoints Voucher By Id")
    public String setGETAPIEndpointsVoucherById() {
        return url + "vouchers/1";
    }

    @Step("I send GET HTTP request Voucher By Id")
    public void sendGETHTTPRequestVoucherById() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsVoucherById());
    }
    @Step("I receive valid HTTP response code 200 voucher")
    public void receiveValidHTTP200Voucher() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //GET - Get By Id Redeem
    @Step("I set GET api endpoints Redeem By Id")
    public String setGETAPIEndpointsRedeemById() {
        return url + "redeems/1";
    }

    @Step("I send GET HTTP request Redeem By Id")
    public void sendGETHTTPRequestRedeemById() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsRedeemById());
    }

    //GET - Get All Redeem
    @Step("I set GET api endpoints All Redeem")
    public String setGETAPIEndpointsAllRedeem() {
        return url + "redeems";
    }

    @Step("I send GET HTTP request All Redeem")
    public void sendGETHTPPRequestAllRedeem() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsAllRedeem());
    }

    //GET - Get wrong url voucher
    @Step("I set GET api endpoints wrong url Voucher")
    public String setGETAPIEndpointsWrongUrlVoucher() {
        return url + "voucher";
    }

    @Step("I send GET HTTP request  wrong url Voucher")
    public void sendGETHTTPRequestWrongUrlVoucher() {
        SerenityRest.given()
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsWrongUrlVoucher());
    }

    @Step("I receive valid HTTP response code 404 voucher")
    public void receiveValidHTTP404Voucher() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //POST - Add Redeem Voucher
    @Step("I set POST api endpoints Redeem Voucher")
    public String setPOSTAPIEndpointsRedeemVoucher() {
        return url + "vouchers/redeem";
    }

    @Step("I send POST HTTP Request Redeem Voucher")
    public void sendDPOSTHTTPRequestRedeemVoucher() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("phone", "082218807767");
        requestBody.put("user_id", 2);
        requestBody.put("voucher_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6OCwicm9sZSI6ImN1c3RvbWVyIiwiZXhwIjoxNjkwMjEzMjcwfQ.wjqxWHZq4vjgFx0gjAWCKIieujeghceWz38oZEGCjT0")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsRedeemVoucher());
    }

    @Step("I receive valid HTTP response code 201 voucher")
    public void receiveValidHTTP201Voucher() {
        restAssuredThat(response -> response.statusCode(201));
    }

    //POST - Add Redeem Voucher User_Id Empty
    @Step("I send POST HTTP request Redeem Voucher User_Id Empty")
    public void sendPOSTHTTPRequestRedeemVoucherUserIdEmpty() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("phone", "082218807767");
        requestBody.put("user_id", "");
        requestBody.put("voucher_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization"," Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6OCwicm9sZSI6ImN1c3RvbWVyIiwiZXhwIjoxNjkwMjEzMjcwfQ.wjqxWHZq4vjgFx0gjAWCKIieujeghceWz38oZEGCjT0")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsRedeemVoucher());
    }

    @Step("I receive valid HTTP response code 400 voucher")
    public void receiveValidHTTP400Voucher(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
