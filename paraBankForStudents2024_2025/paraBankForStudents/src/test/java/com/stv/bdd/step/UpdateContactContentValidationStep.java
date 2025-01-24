package com.stv.bdd.step;

import com.stv.factory.factorypages.MainPage;
import com.stv.factory.factorypages.OverviewPage;
import com.stv.factory.factorypages.UpdateContactPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.ParaBankPageURLs.*;
import static org.testng.Assert.assertTrue;


public class UpdateContactContentValidationStep {
    private final MainPage mainPage = new MainPage();
    private final OverviewPage overviewPage = new OverviewPage();
    private UpdateContactPage updateContactPage;

    @Given("I am logged in as a user")
    public void setup() throws Throwable {
        if (mainPage.isLogOutLinkPresent(Hook.getDriver())) {
            overviewPage.clickLogOutLink();
        }
        mainPage.fillLoginForm();
        mainPage.clickLoginButton();
        Hook.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I navigate to the Update Contact Info page")
    public void iNavigateToTheUpdateContactInfoPage() {
        overviewPage.clickUpdateContactLink();
        Hook.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("I should be redirected to Update Contact Page")
    public void iShouldBeRedirectedToUpdateContactPage() {
        updateContactPage = new UpdateContactPage();
        assertTrue(Hook.getDriver().getCurrentUrl().contains(UPDATE_CONTACT_URL),
                "Redirection to home page is incorrect");
    }

    @Then("I should see the Update Profile Button")
    public void iShouldSeeTheUpdateProfileButton() {
        assertTrue(updateContactPage.isUpdateButtonDisplayed());
    }

}
