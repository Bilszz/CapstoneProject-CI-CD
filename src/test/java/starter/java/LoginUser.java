package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class LoginUser {

    protected String url = "https://3.0.59.152.nip.io";


    @Step("I set POST api endpoints login")
    public String setPostApiEndpointLogin() {
        return url + "/auth/login";
    }

    //Ganti disaat akan di RUN
    @Step("I send POST HTTP request login")
    public void sendPostHttpRequestLogin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "newCustomerEmailo@example.com");
        requestBody.put("name", "customer");
        requestBody.put("password", "newPassword");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointLogin());
    }

    ///NEGATIFFF

    @Step("I send POST HTTP request login1")
    public void sendPostHttpRequestLogin1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "rinim@example.com");
        requestBody.put("name", "rinim");
        requestBody.put("password", "customer1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request login2")
    public void sendPostHttpRequestLogin2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("name", "rinim");
        requestBody.put("password", "customer123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request login3")
    public void sendPostHttpRequestLogin3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "rinim@example.com");
        requestBody.put("name", "rinim");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request login4")
    public void sendPostHttpRequestLogin4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("", "");
        requestBody.put("", "");
        requestBody.put("", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request login5")
    public void sendPostHttpRequestLogin5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("name", "");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I receive valid HTTP response code 200 login")
    public void receiveValidHttp200Login() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code 400 login")
    public void receiveValidHttp400Login() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I receive valid HTTP response code 401 login")
    public void receiveValidHttp401Login() {
        restAssuredThat(response -> response.statusCode(401));
    }

}