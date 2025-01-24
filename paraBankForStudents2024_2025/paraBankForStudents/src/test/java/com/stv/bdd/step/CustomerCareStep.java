package com.stv.bdd.step;

import com.stv.factory.factorypages.CustomerCarePage;
import com.stv.factory.factorypages.MainPage;
import com.stv.factory.factorypages.OverviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class CustomerCareStep {
    private final MainPage mainPage = new MainPage();
    private OverviewPage overviewPage;
    private CustomerCarePage customerCarePage;

    @Given("I am on the Overview page")
    public void setup() {
        mainPage.fillLoginForm();
        mainPage.clickLoginButton();
        overviewPage = new OverviewPage();
        Hook.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I click the Email button")
    public void iClickTheEmailButton() {
        overviewPage.clickCustomerCareButton();
        customerCarePage = new CustomerCarePage();
    }

    @Then("the Name field should be empty")
    public void theNameFieldShouldBeEmpty() {
        assertTrue(customerCarePage.isNameFieldEmpty());
    }
}
