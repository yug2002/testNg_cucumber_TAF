package com.cucumber.testng.test.steps;

import com.cucumber.testng.pages.base.BasePage;
import com.cucumber.testng.pages.home.HomePage;
import io.cucumber.java8.En;

public class LoginSteps implements En {

    public LoginSteps() {
        Given("^I open \"([^\"]*)\" page$", (String arg0) -> {
            HomePage homePage = new HomePage();
            homePage.open();
        });

        When("^I click on the \"([^\"]*)\" link on the \"([^\"]*)\" page$", (String arg0, String arg1) -> {
        });

        And("^I type \"([^\"]*)\" in input \"([^\"]*)\" field on the \"([^\"]*)\" page$", (String arg0, String arg1, String arg2) -> {
        });

        And("^I click on the \"([^\"]*)\" button on the \"([^\"]*)\" page$", (String arg0, String arg1) -> {
        });

        And("^I choose \"([^\"]*)\" tab on the \"([^\"]*)\" page$", (String arg0, String arg1) -> {
        });

        Then("^The \"([^\"]*)\" page is opened$", (String arg0) -> {
        });
    }
}
