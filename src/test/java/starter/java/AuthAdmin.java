package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AuthAdmin {

    protected String url = "https://3.0.59.152.nip.io/";

    //POST - Login Admin with valid credential
    @Step("I set POST api endpoints login_admin")
    public String setPOSTAPIEndpointsLoginAdmin() {
        return url + "auth/login";
    }

    @Step("I send POST HTTP request login_admin")
    public void sendPOSTHTTPRequestLoginAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@example.com");
        requestBody.put("name", "admin");
        requestBody.put("password", "newPassword");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsLoginAdmin());
    }

    @Step("I receive valid HTTP response code 200 login_admin")
    public void receiveValidHTTP200LoginAdmin() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //POST - Login Admin wrong password
    @Step("I send POST HTTP request invalid password admin")
    public void sendPOSTHTTPRequestInvalidLoginAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@example.com");
        requestBody.put("name", "admin");
        requestBody.put("password", "admin");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsLoginAdmin());
    }

    //POST - Login Admin with empty email
    @Step("I send POST HTTP request invalid email admin")
    public void sendPOSTHTTPRequestInvalidEmailAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("name", "admin");
        requestBody.put("password", "admin123");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsLoginAdmin());
    }

    @Step("I receive valid HTTP response code 401 login_admin")
    public void receivePOSTHTTP401LoginAdmin() {
        restAssuredThat(response -> response.statusCode(401));
    }

    //POST - Login Admin with empty value
    @Step("I send POST HTTP request empty value admin")
    public void sendPOSTHTTPRequestEmptyValueAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminrini@example.com");
        requestBody.put("name", "admin");
        requestBody.put("password", "");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPOSTAPIEndpointsLoginAdmin());
    }

    @Step("I receive valid HTTP response code 400 login_admin")
    public void receiveValidHTTP400LoginAdmin() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //POST - Logout Admin with valid credential
    @Step("I set POST api endpoints logout_admin")
    public String setPOSTAPIEndpointsLogout_admin() {
        return url + "users/logout";
    }

    @Step("I send POST HTTP request logout_admin")
    public void sendPOSTHTTPRequestLogoutAdmin() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjkwNDIyOTAwfQ.z5WIsHk4XDU76rp-AIpFwCQ6Qq64LwAqf1TA7mcHwok")
                .post(setPOSTAPIEndpointsLogout_admin());
    }

    @Step("I receive valid HTTP response code 200 logout_admin")
    public void receiveValidHTTP200LogoutAdmin() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //POST - Logout Admin with token expired
    @Step("I send POST HTTP request token admin expired")
    public void sendPOSTHTTPRequestTokenAdminExpired() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjkwNDE4ODgxfQ.FlmTzQKBajTnKiy6j7qSYSoSpq61x3GW7WNAprisSss")
                .post(setPOSTAPIEndpointsLogout_admin());
    }
}
