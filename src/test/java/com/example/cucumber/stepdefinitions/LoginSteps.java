package com.example.cucumber.stepdefinitions;

import com.example.cucumber.pages.LoginPage;
import com.example.cucumber.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {

        LoginPage.open(ConfigReader.get("url"));


    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.Search("Teddy");
        System.out.println("ENtered seracg term");

    }
    @Then("user is able to login")
    public void user_is_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Able to login");

    }
}
