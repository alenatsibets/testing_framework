package com.stv.factory.factorytests;


import com.stv.factory.factorypages.MainPage;
import org.testng.annotations.Test;

import static com.stv.framework.core.lib.ParaBankPageURLs.*;
import static org.testng.Assert.assertTrue;

public class MainFactoryTest extends BasicFactoryTest {
    private final MainPage mainPage = new MainPage();

    @Test(description = "Assert the main page is loaded and the main logo is visible")
    public void assertParaBankIconIsDisplayed() {
        assertTrue(mainPage.isMainLogoDisplayed(), "The main page isn't loaded properly");
    }

    @Test(description = "Password Recovery Redirect")
    public void assertPasswordRecoveryRedirect() {
        /* When I click on the password recovery link
        Then I should be redirected to the account validation page */
        mainPage.clickPasswordRecoveryLink();
        assertTrue(getDriver().getCurrentUrl().contains(PASSWORD_RECOVERY_URL),
                "Redirection to password recovery URL is incorrect");

        //And this page should contain appropriate content
        String expectedText = "Customer Lookup";
        assertTrue(pageContainsText(expectedText),
                "The expected text is not present in the page source.");
    }

    @Test(description = "Registration redirect")
    //Navigating to Registration Page from Login Page
    public void testToRegistrationRedirect() {
        /* When I click on the "Register" link
        Then I should be redirected to the registration page */
        mainPage.clickRegistrationLink();
        assertTrue(getDriver().getCurrentUrl().contains(REGISTERED_URL),
                "Redirection to registration URL is incorrect");

        //And registration page should contain appropriate content
        String expectedText = "Signing up is easy!";
        assertTrue(pageContainsText(expectedText),
                "The expected text is not present in the page source.");
    }
}