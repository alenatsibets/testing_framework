package com.stv.bdd.step;

import com.stv.factory.factorypages.MainPage;
import com.stv.factory.factorypages.OverviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static com.stv.framework.core.lib.ParaBankPageURLs.LOGGED_IN_URL;
import static org.testng.Assert.assertTrue;

public class LoginStep {
    private final MainPage mainPage = new MainPage();
    private final OverviewPage overviewPage = new OverviewPage();

    @Given("I am Log Out")
    public void setup() {
        if (mainPage.isLogOutLinkPresent(Hook.getDriver())) {
            overviewPage.clickLogOutLink();
        }
    }

    @When("^I enter (\\w+) into the username field$")
    public void inputUsername(String username) {
        mainPage.fillLoginFormWithUsername(username);
    }

    @When("^I enter (\\w+) into the password field$")
    public void inputPassword(String password) {
        mainPage.fillLoginFormWithPassword(password);
    }

    @When("^I press the Login button in the login form area$")
    public void pressLoginButton() {
        mainPage.clickLoginButton();
    }

    @Then("^I should be redirected to the home page$")
    public void homePageIsOpened() {
        assertTrue(Hook.getDriver().getCurrentUrl().contains(LOGGED_IN_URL),
                "Redirection to home page is incorrect");
    }

    @Then("the page should contain the text {string}")
    public void thePageShouldContainTheText(String expectedText) {
        assertTrue(pageContainsText(expectedText),
                "The expected text is not present in the page source.");
    }

    public boolean pageContainsText(String text) {
        return Hook.getDriver().getPageSource().contains(text);
    }

}
