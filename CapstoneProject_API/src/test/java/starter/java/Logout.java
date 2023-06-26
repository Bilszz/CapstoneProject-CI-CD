package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Logout {

    protected String url = "https://3.0.59.152.nip.io";


    //POST - Logout User with valid credential
    //Ganti saat akan run
    @Step("I set POST api endpoints logout_user")
    public String setPostApiEndpointsLogoutUser() {
        return url + "/users/logout";
    }

    @Step("I send POST HTTP request logout_user")
    public void sendPostHttpRequestLogoutUser() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjEsInJvbGUiOiJjdXN0b21lciIsImV4cCI6MTY5MDQxOTU1MH0.S0SgPnDTtzzWhe0TDf4dGirldPR3vyGyEmp5W1ijP0Q")
                .post(setPostApiEndpointsLogoutUser()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 logout_User")
    public void receiveValidHttp200LogoutUser() {
        restAssuredThat(response -> response.statusCode(200));
    }



    // POST - Logout User with token expired
    @Step("I send POST HTTP request token user expired")
    public void sendPOSTHTTPRequestTokenExpired() {
        SerenityRest.given()
                .header("Authorization", " Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwicm9sZSI6ImFkbWluIiwiZXhwIjoxNjkwNDE5MzYzfQ.nntR6Wt-Ws5riAjBrBEov7e7v9P7BiPUek2MIeYksL0")
                .post(setPostApiEndpointsLogoutUser()).then().statusCode(401);
    }

    @Step("I receive valid HTTP response code 401 logout_User")
    public void receiveValidHTTP401LogoutUser() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
