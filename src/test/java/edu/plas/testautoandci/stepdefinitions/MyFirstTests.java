package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;

/**
 * Created by JeanClaude.Pace on 29/10/2015.
 */
public class MyFirstTests {

    @Given("^I navigate to '(.+)'$")
    public void iNavigateToGoogleSearch(String siteName) {
        System.out.println("I am navigating to " + siteName);
        //TODO
    }

    @When("^I search for '((?:\\w+\\s?)+)' on Google Search$")
    public void iSearchForSomethingOnGoogleSearch(String searchString) {
        System.out.println("I am searching for " + searchString);
        Assert.assertTrue(searchString.equals("Malta"));
    }

    @Then("the flag of '(\\w+)' is displayed")
    public void theFlagOfACountryIsDisplayed(String country) {
        System.out.println("The flag of " + country + " is displayed" );
        assert country.equals("Malta");
    }

    @Then("the (\\w+\\s?)+ (?:is|are) displayed")
    public void pageIsDisplayed(String page) {
        //TODO
    }

    @When("^When I input '(\\d+)(.)(\\d+)' in the calculator$")
    public void whenIInputInTheCalculator(int first, String operator, int second) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The text shown on the display is (.+)$")
    public void theTextShownOnTheDisplayIsAnswer(String answer) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    //check out rubular.com
    

}
