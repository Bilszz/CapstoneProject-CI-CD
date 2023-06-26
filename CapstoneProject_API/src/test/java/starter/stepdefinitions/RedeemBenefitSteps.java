package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.RedeemBenefit;

public class RedeemBenefitSteps {

    @Steps
    RedeemBenefit redeemBenefit;

    //GET - Get Voucher
    @Given("I set GET api endpoints Voucher")
    public void setGETAPIEndpointsVoucher() {
        redeemBenefit.setGETAPIEndpointsVoucher();
    }

    @When("I send GET HTTP request voucher")
    public void sendGETHTTPRequestVoucher() {
        redeemBenefit.sendGETHTTPRequestVoucher();
    }

    //GET - Get By Id Voucher
    @Given("I set GET api endpoints Voucher By Id")
    public void setGETAPIEndpointsVoucherById() {
        redeemBenefit.setGETAPIEndpointsVoucherById();
    }

    @When("I send GET HTTP request Voucher By Id")
    public void sendGETHTTPRequestVoucherById() {
        redeemBenefit.sendGETHTTPRequestVoucherById();
    }

    @Then("I receive valid HTTP response code 200 voucher")
    public void receiveValidHTTP200Voucher() {
        redeemBenefit.receiveValidHTTP200Voucher();
    }

    //GET - Get By Id Redeem
    @Given("I set GET api endpoints Redeem By Id")
    public void setGETAPIEndpointsRedeemById() {
        redeemBenefit.setGETAPIEndpointsRedeemById();
    }

    @When("I send GET HTTP request Redeem By Id")
    public void sendGETHTTPRequestRedeemById() {
        redeemBenefit.sendGETHTTPRequestRedeemById();
    }

    //GET - Get All Redeem
    @Given("I set GET api endpoints All Redeem")
    public void setGETAPIEndpointsAllRedeem() {
        redeemBenefit.setGETAPIEndpointsAllRedeem();
    }

    @When("I send GET HTTP request All Redeem")
    public void sendGETHTPPRequestAllRedeem() {
        redeemBenefit.sendGETHTPPRequestAllRedeem();
    }

    //GET - Get wrong url voucher
    @Given("I set GET api endpoints wrong url Voucher")
    public void setGETAPIEndpointsWrongUrlVoucher() {
        redeemBenefit.setGETAPIEndpointsWrongUrlVoucher();
    }

    @When("I send GET HTTP request  wrong url Voucher")
    public void sendGETHTTPRequestWrongUrlVoucher() {
        redeemBenefit.sendGETHTTPRequestWrongUrlVoucher();
    }

    @Then("I receive valid HTTP response code 404 voucher")
    public void receiveValidHTTP404Voucher() {
        redeemBenefit.receiveValidHTTP404Voucher();
    }

    //POST - Add Redeem Voucher
    @Given("I set POST api endpoints Redeem Voucher")
    public void setPOSTAPIEndpointsRedeemVoucher() {
        redeemBenefit.setPOSTAPIEndpointsRedeemVoucher();
    }

    @When("I send POST HTTP request Redeem Voucher")
    public void sendDPOSTHTTPRequestRedeemVoucher() {
        redeemBenefit.sendDPOSTHTTPRequestRedeemVoucher();
    }

    @Then("I receive valid HTTP response code 201 voucher")
    public void receiveValidHTTP201Voucher() {
        redeemBenefit.receiveValidHTTP201Voucher();
    }

    //POST - Add Redeem Voucher User_Id Empty
    @When("I send POST HTTP request Redeem Voucher User_Id Empty")
    public void sendPOSTHTTPRequestRedeemVoucherUserIdEmpty() {
        redeemBenefit.sendPOSTHTTPRequestRedeemVoucherUserIdEmpty();
    }

    @Then("I receive valid HTTP response code 400 voucher")
    public void receiveValidHTTP400Voucher(){
        redeemBenefit.receiveValidHTTP400Voucher();
    }
}
