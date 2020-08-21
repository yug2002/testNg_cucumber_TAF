package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I open {string} page")
    public void openPage(String page) {
    }

    @When("I click on the {string} link on the {string} page")
    public void clickOnTheLink(String link, String page) {
    }

    @When("I type {string} in input {string} field on the {string} page")
    public void typeInInputField(String text, String input, String page) {
    }

    @When("I click on the {string} button on the {string} page")
    public void clickOnTheButton(String button, String page) {
    }

    @When("I choose {string} tab on the {string} page")
    public void chooseTab(String tab, String page) {
    }

    @Then("The {string} page is opened")
    public void pageIsOpened(String page) {

    }
}
