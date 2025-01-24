package com.stv.bdd.step;

import com.stv.factory.factorypages.MainPage;
import com.stv.factory.factorypages.OverviewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class HomeButtonStep {
    MainPage mainPage = new MainPage();
    OverviewPage overviewPage = new OverviewPage();
    String url;

    @Given("I am logged in")
    public void setup() {
        if (mainPage.isLogOutLinkPresent(Hook.getDriver())) {
            overviewPage.clickLogOutLink();
        }
        mainPage.fillLoginForm();
        mainPage.clickLoginButton();
        Hook.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I scroll down to the bottom of the page")
    public void iScrollDownToTheBottomOfThePage() {
        JavascriptExecutor js = (JavascriptExecutor) Hook.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Then("the footer panel should be visible")
    public void theFooterPanelShouldBeVisible() {
        assertTrue(overviewPage.isFooterVisible());
    }

    @When("I click Home link")
    public void iClickHomeLink() {
        overviewPage.clickHomeLink();
        url = Hook.getDriver().getCurrentUrl();
    }

    @Then("the Home page url should remain unchanged")
    public void theHomePageShouldRemainUnchanged() {
        String currentUrl = Hook.getDriver().getCurrentUrl();
        assertEquals(url, currentUrl);
    }

    @Then("I should see the {string} title")
    public void iShouldSeeTheLatestNewsArea(String title) {
        String pageSource = Hook.getDriver().getPageSource();
        assertTrue(pageSource.contains(title));
    }
}
