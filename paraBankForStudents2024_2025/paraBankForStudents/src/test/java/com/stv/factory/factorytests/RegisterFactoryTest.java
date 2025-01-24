package com.stv.factory.factorytests;

import com.stv.factory.factorypages.RegistrationPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RegisterFactoryTest extends BasicFactoryTest {
    private final RegistrationPage registrationPage = new RegistrationPage();

    @Test(description = "Registration with valid credentials")
    public void testValidRegistration() {
        /* When I fill the form
        And I press the "Register" button
        Then I should see a success message indicating successful registration */
        registrationPage.openPage();
        registrationPage.fillRegisterForm();
        registrationPage.clickRegisterButton();
        String expectedText = "Your account was created successfully.";
        assertTrue(pageContainsText(expectedText),
                "The expected text is not present in the page source.");
    }
}
