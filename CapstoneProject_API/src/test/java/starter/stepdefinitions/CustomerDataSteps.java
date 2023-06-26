package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.CustomerData;

public class CustomerDataSteps {

    @Steps
    CustomerData customerData;

    //GET - Get All Customers
    @Given("I set GET api endpoints Customer_data")
    public void setGETAPIEndpointsCustomerData() {
        customerData.setGETAPIEndpointsCustomerData();
    }

    @When("I send GET HTTP request Customer_data")
    public void sendGETHTTPendpointsCustomerdata() {
        customerData.sendGETHTTPendpointsCustomerdata();
    }


    //GET - Get All Customer Data By Id
    @Given("I set GET api endpoints Customer_data by id")
    public void setGETAPIEndpointsCustomerById() {
        customerData.setGETAPIEndpointsCustomerById();
    }

    @When("I send GET HTTP request Customer_data by id")
    public void sendGETHTTPRequestCustomerById() {
        customerData.sendGETHTTPRequestCustomerById();
    }

    //Get - Recent Activities
    @Given("I set GET api endpoints Recent_activities")
    public void setGETAPIEndpointsRecentActivities() {
        customerData.setGETAPIEndpointsRecentActivities();
    }

    @When("I send GET HTTP request Recent_activities")
    public void sendGETHTTPRequestRecentActivities() {
        customerData.sendGETHTTPRequestRecentActivities();
    }

    @Then("I receive valid HTTP response code 200 Customer_data")
    public void receiveValidHTTP200CustomerData() {
        customerData.receiveValidHTTP200CustomerData();
    }

    //GET - Get Invalid Url All Customers
    @Given("I set GET api endpoints Invalid Url Customer_data")
    public void setGETEndpointsInvalidUrlCustomerData() {
        customerData.setGETEndpointsInvalidUrlCustomerData();
    }

    @When("I send GET HTTP request Invalid Url Customer_data")
    public void sendGETHTTPRequestInvalidUrlCustomerData() {
        customerData.sendGETHTTPRequestInvalidUrlCustomerData();
    }

    //GET - Get Invalid All Customer Data By Id
    @Given("I set GET api endpoints Invalid Customer_data by id")
    public void setGETAPIendpointsInvalidCustomerDataById() {
        customerData.setGETAPIendpointsInvalidCustomerDataById();
    }

    @When("I send GET HTTP request Invalid Customer_data by id")
    public void sendGETHTTPRequestInvalidCustomerDataById() {
        customerData.sendGETHTTPRequestInvalidCustomerDataById();
    }

    @Then("I receive valid HTTP response code 404 Customer_data")
    public void receiveValidHTTP404CustomerData() {
        customerData.receiveValidHTTP404CustomerData();
    }

    // PUT - Put update Customer Data
    @Given("I set PUT api endpoints Customer_data")
    public void setPUTAPIEndpointsCustomerData() {
        customerData.setPUTAPIEndpointsCustomerData();
    }

    @When("I send PUT HTTP request Customer_data")
    public void sendPUTHTTPRequestCustomerData() {
        customerData.sendPUTHTTPRequestCustomerData();
    }

    //PUT - Update customer data without email
    @When("I send PUT HTTP request customer_datawithoutemail")
    public void sendPUTRequestCustomerDatawithoutEmail() {
        customerData.sendPUTRequestCustomerDatawithoutEmail();
    }

    @Then("I receive valid HTTP response code 400 Customer_data")
    public void receiveValidHHTP400CustomerData() {
        customerData.receiveValidHHTP400CustomerData();
    }

    //DELETE - Delete customer data
    @Given("I set DELETE api endpoints Customer_data")
    public void setDELETEEnspointsCustomerData() {
        customerData.setDELETEEnspointsCustomerData();
    }

    @When("I send DELETE HTTP request Customer_data")
    public void sendDELETEHTTPRequestCustomerDara() {
        customerData.sendDELETEHTTPRequestCustomerData();
    }
}
