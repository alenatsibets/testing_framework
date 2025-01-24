package com.stv.bdd.step;

import com.stv.factory.factorypages.MainPage;
import com.stv.factory.factorypages.OverviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertTrue;

public class LogOutStep {
    private final OverviewPage overviewPage = new OverviewPage();
    private MainPage mainPage;

    @When("^I click the LogOut button$")
    public void pressLogOutLink() {
        overviewPage.clickLogOutLink();
        mainPage = new MainPage();
    }

    @Then("I should see the Login Button")
    public void iShouldSeeTheLoginButton() {
        assertTrue(mainPage.isLoginButtonDisplayed());
    }
}
