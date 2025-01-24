package com.stv.bdd.step;

import com.stv.factory.factorypages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static com.stv.factory.factorytests.BasicFactoryTest.getDriver;
import static com.stv.framework.core.lib.ParaBankPageURLs.PASSWORD_RECOVERY_URL;
import static org.testng.Assert.assertTrue;

public class PasswordRecoveryRedirectStep {
    private MainPage mainPage;

    @Given("I am on the main page")
    public void setup() throws Throwable {
        mainPage = new MainPage();
    }

    @When("^I click on the password recovery link in the login form area$")
    public void pressThePasswordRecoveryLink() {
        mainPage.clickPasswordRecoveryLink();
    }

    @Then("^I should be redirected to the password recovery page$")
    public void thePasswordRecoveryPageIsOpened() {
        String currentUrl = Hook.getDriver().getCurrentUrl();
        assertTrue(currentUrl.contains(PASSWORD_RECOVERY_URL),
                "Redirection to password recovery URL is incorrect");
    }

    @Then("the new page should contain the text {string}")
    public void thePageShouldContainTheText(String expectedText) {
        assertTrue(pageContainsText(expectedText),
                "The expected text is not present in the page source.");
    }

    public boolean pageContainsText(String text) {
        String pageSource = getDriver().getPageSource();
        return pageSource.contains(text);
    }
}