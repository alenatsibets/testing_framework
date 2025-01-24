package com.stv.bdd.step;

import com.stv.factory.factorypages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class RegistrationStep {
    private final RegistrationPage registrationPage = new RegistrationPage();

    @Given("I am on the registration page")
    public void setup() throws Throwable {
        registrationPage.openPage();
        Hook.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I fill the form")
    public void iFillTheForm() {
        registrationPage.fillRegisterForm();
    }

    @When("I press the Register button")
    public void iPressTheButton() {
        registrationPage.clickRegisterButton();
    }

    @Then("I should see a success message indicating successful registration {string}")
    public void iShouldSeeASuccessMessageIndicatingSuccessfulRegistration(String expectedText) {
        assertTrue(pageContainsText(expectedText),
                "The expected text is not present in the page source.");
    }

    public boolean pageContainsText(String text) {
        return Hook.getDriver().getPageSource().contains(text);
    }
}
