package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;

public class Register {

    protected String url = "https://3.0.59.152.nip.io";

    @Step("I set POST api endpoints register")
    public String setPostApiEndpointRegister() {
        return url + "/auth/register";
    }

    ///POSITIF
//    @Step("I send POST HTTP request register")
//    public void sendPostHttpRequestRegister() {
//        JSONObject requestBody = new JSONObject();
//        String alphabet = "abcdef";
//        String temp = RandomStringUtils.random(8, alphabet);
//        String email = temp.substring(0, temp.length() - 9) + "@mail.com";
//        requestBody.put("email", email);
//        requestBody.put("name", "rinimaulida34");
//        requestBody.put("password", "customer123");
//
//        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
//    }


    ///NEGATIFFF
    @Step("I send POST HTTP request register2")
    public void sendPostHttpRequestRegister2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "rini@gmail.com");
        requestBody.put("name", "");
        requestBody.put("password", "123456");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register3")
    public void sendPostHttpRequestRegister3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "customer123");
        requestBody.put("name", "riniimldaaa");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register4")
    public void sendPostHttpRequestRegister4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "stevenjatmiko@gmail.com");
        requestBody.put("password", "");
        requestBody.put("name", "riniimldaaa");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register5")
    public void sendPostHttpRequestRegister5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "@mail.com");
        requestBody.put("password", "steven123");
        requestBody.put("fullname", "riniimldaaa");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }


//    @Step("I receive valid HTTP response code 201 register")
//    public void receiveValidHttp200Register() {
//        restAssuredThat(response -> response.statusCode(201));
//    }

    @Step("I receive valid HTTP response code 400 register")
    public void receiveValidHttp400Register() {
        restAssuredThat(response -> response.statusCode(400));
    }

//    @Step("I receive valid HTTP response code 500 register")
//    public void receiveValidHttp500Register() {
//        restAssuredThat((response -> response.statusCode(500)));
//    }
}