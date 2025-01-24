package com.stv.factory.factorytests;

import com.stv.factory.factorypages.MainPage;
import org.testng.annotations.Test;

import static com.stv.framework.core.lib.ParaBankPageURLs.LOGGED_IN_URL;
import static org.testng.Assert.assertTrue;

public class LoginFactoryTest extends BasicFactoryTest {
    private final MainPage mainPage = new MainPage();

    @Test(description = "Login with valid credentials")
    public void testValidLogin() {
        /* And I press the "Login" button
        Then I should be redirected to the home page */
        mainPage.fillLoginForm();
        mainPage.clickLoginButton();
        assertTrue(getDriver().getCurrentUrl().contains(LOGGED_IN_URL),
                "Redirection to home page is incorrect");

        //And the appropriate page content should appear
        String expectedText = "Accounts Overview";
        assertTrue(pageContainsText(expectedText),
                "The expected text is not present in the page source.");
    }
}
