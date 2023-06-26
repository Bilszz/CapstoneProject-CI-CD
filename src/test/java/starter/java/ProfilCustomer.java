package starter.java;

import com.google.common.net.MediaType;
import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import jxl.read.biff.File;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class ProfilCustomer {

    protected String url = "https://3.0.59.152.nip.io/";

    @Step("I set GET api endpoints Profil_CustomerId")
    public String setGETAPIEndpointsProfilCustomerId() {
        return url + "users/2";
    }

    @Step("I send GET HTTP request Profil_CustomerId")
    public void sendGETHTTPRequestProfilCustomerId() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsProfilCustomerId());
    }

    //GET - Get Profil Customer Picture
    @Step("I set GET api endpoints ProfilCustomer_Picture")
    public String setGETAPIEndpointsProfilCustomerPicture() {
        return url + "images/url/user.png";
    }

    @Step("I send GET HTTP request ProfilCustomer_Picture")
    public void sendGETHTTPRequestProfilCustomerPicture() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsProfilCustomerPicture());
    }

    @Step("I receive valid HTTP response code 200 Profil_Customer")
    public void receiveValidHTTP200ProfilCustomer() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //GET - Get Profil Customer By Id wrong Url
    @Step("I set GET api endpoints ProfilCustomer_WrongUrl")
    public String setGETAPIEndpointsProfilCustomerWrongUrl() {
        return url + "users/5";
    }

    @Step("I send GET HTTP request ProfilCustomer_WrongUrl")
    public void sendGETHTTPREquestProfilCustomerWrongUrl() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsProfilCustomerWrongUrl());
    }

    @Step("I receive valid HTTP response code 404 Profil_Customer")
    public void receiveValidHTTP404ProfilCustomer() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //GET - Get Add Profil Picture Wrong Format
    @Step("I set GET api endpoints ProfilCustomer_Wrongformat")
    public String setGETAPIEndpointsProfilCustomerWrongFormat() {
        return url + "images/url/user.jpeg";
    }

    @Step("I send GET HTTP request ProfilCustomer_Wrongformat")
    public void sendGETHTTPRequestProfilCustomerWrongFormat() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .get(setGETAPIEndpointsProfilCustomerWrongFormat());
    }

    //PUT - Put Update Profil Customer
    @Step("I set PUT api endpoints UpdateProfil_Customer")
    public String setPUTAPIEndpointsUpdateProfilCustomer() {
        return url + "users/profiles/customer/3";
    }

    @Step("I send PUT HTTP request UpdateProfil_Customer")
    public void sendPUTHTTPRequestUpdateProfilCustomer() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "newCustomer");
        requestBody.put("email", "newCustomer@example.com");
        requestBody.put("address", "Sumarecon BSD");
        requestBody.put("age", 20);
        requestBody.put("gender", "woman");
        requestBody.put("phone", "0812838495");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .put(setPUTAPIEndpointsUpdateProfilCustomer());
    }

    //PUT - Put Update password Profil Customer
    @Step("I set PUT api endpoints Update password")
    public String setPUTAPIEndpointsUpdatePassword() {
        return url + "users/profiles/password/2";
    }

    @Step("I send PUT HTTP request Update password")
    public void sendPUTHTTPRequestUpdatePassword() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "newPassword");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .put(setPUTAPIEndpointsUpdatePassword());
    }

//    @Step("I set PUT api endpoints UpdatePicture_ProfilCustomer")
//    public String setPUTAPIEndpointsUPdatePIctureProfilCustomer() {
//        return url + "users/profiles/picture/5";
//    }
//
//    @Step("I send PUT HTTP request UpdatePicture_ProfilCustomer")
//    public void sendPUTHTTPRequestUpdatePictureprofilCustomer() {
//        File file = new File("C:\\users\\rini\\Downloads\\Postman\\filename\\pxfuel.png");
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("filename", "pxfuel.png");
//
//        SerenityRest.given()
//                .header("Content-Type", "application/json")
//                .multiPart("file", file, "multipart/form-data")
//                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
//                .body(requestBody.toJSONString())
//                .put(setPUTAPIEndpointsUPdatePIctureProfilCustomer());
//
//    }

    //PUT - Put Update Profil Customer Wrong Id
    @Step("I set PUT api endpoints UpdateProfil_WrongId")
    public String setPUTAPIEndpointsUPdateProfilWrongId() {
        return url + "users/profiles/password/5";
    }

    @Step("I send PUT HTTP request UpdateProfil_WrongId")
    public void sendPUTHTTPRequestUpdateProfilWrongId() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "newPassword");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .put(setPUTAPIEndpointsUPdateProfilWrongId());
    }

    //PUT - Put Update Profil Customer Empty Velue
    @Step("I set PUT api endpoints UpdateProfil_EmptyValue")
    public void sendPUTHTTPRequestUpateProfilEmptyValue() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");
        requestBody.put("email", "");
        requestBody.put("address", "Sumarecon BSD");
        requestBody.put("age", 20);
        requestBody.put("gender", "woman");
        requestBody.put("phone", "0812838495");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjg5MzM3Mzc1fQ.q4f-jtmhS2w3H2eWyXaRMVRmyHdl2RH6XFyS6ApYG_8")
                .body(requestBody.toJSONString())
                .put(setPUTAPIEndpointsUpdateProfilCustomer());
    }

    @Step("I receive valid HTTP response code 400 Profil_Customer")
    public void receiveValidHTTp400ProfilCustomer() {
        restAssuredThat(response -> response.statusCode(400));
    }

}
