package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.stv.framework.core.lib.UserData.*;

public class MainPage extends Page {
    private final By PARABANK_LOGO = By.cssSelector("img[alt='ParaBank']");
    private final By ADMIN_LOGO = By.cssSelector("img.admin");
    private final By FIRST_NAME_FIELD_REGISTER = By.id("customer.firstName");
    private final By LAST_NAME_FIELD_REGISTER = By.id("customer.lastName");
    private final By ADDRESS_FIELD_REGISTER = By.id("customer.address.street");
    private final By CITY_FIELD_REGISTER = By.id("customer.address.city");
    private final By STATE_FIELD_REGISTER = By.id("customer.address.state");
    private final By ZIP_CODE_FIELD_REGISTER = By.id("customer.address.zipCode");
    private final By PHONE_NUMBER_FIELD_REGISTER = By.id("customer.phoneNumber");
    private final By SSN_FIELD_REGISTER = By.id("customer.ssn");
    private final By USERNAME_FIELD_REGISTER = By.id("customer.firstName");
    private final By PASSWORD_FIELD_REGISTER = By.id("customer.lastName");
    private final By CONFIRM_FIELD_REGISTER = By.id("repeatedPassword");
    private final By REGISTER_BUTTON = By.cssSelector("[value=\"Register\"]");
    private final By REGISTER_LINK = By.linkText("Register");
    private final By PASSWORD_RECOVERY_LINK = By.linkText("Forgot login info?");

    public boolean isMainLogoDisplayed() {
        WebElement registerLink = getDriver().findElement(PARABANK_LOGO);
        return registerLink.isDisplayed();
    }

    public void clickOnAdminLogo() {
        WebElement trustButton = getDriver().findElement(ADMIN_LOGO);
        trustButton.click();
    }

    public void clickPasswordRecoveryLink() {
        WebElement forgotLink = getDriver().findElement(PASSWORD_RECOVERY_LINK);
        forgotLink.click();
    }

    public void clickRegistrationLink() {
        WebElement registerLink = getDriver().findElement(REGISTER_LINK);
        registerLink.click();
    }

    public void sendValue(By by, String value) {
        WebElement element = getDriver().findElement(by);
        element.sendKeys(value);
    }

    public void fillRegisterForm() {
        sendValue(FIRST_NAME_FIELD_REGISTER, FIRST_NAME_REGISTER);
        sendValue(LAST_NAME_FIELD_REGISTER, LAST_NAME_REGISTER);
        sendValue(ADDRESS_FIELD_REGISTER, ADDRESS_REGISTER);
        sendValue(CITY_FIELD_REGISTER, CITY_REGISTER);
        sendValue(STATE_FIELD_REGISTER, STATE_REGISTER);
        sendValue(ZIP_CODE_FIELD_REGISTER, ZIP_CODE_REGISTER);
        sendValue(PHONE_NUMBER_FIELD_REGISTER, PHONE_NUMBER_REGISTER);
        sendValue(SSN_FIELD_REGISTER, SSN_REGISTER);
        sendValue(USERNAME_FIELD_REGISTER, USERNAME_REGISTER);
        sendValue(PASSWORD_FIELD_REGISTER, PASSWORD_REGISTER);
        sendValue(CONFIRM_FIELD_REGISTER, PASSWORD_REGISTER);
    }

    public void clickRegisterButton() {
        WebElement registerButton = getDriver().findElement(REGISTER_BUTTON);
        registerButton.click();
    }
}
