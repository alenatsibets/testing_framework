package com.stv.factory.factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.stv.framework.core.lib.ParaBankPageURLs.REGISTERED_URL;
import static com.stv.framework.core.lib.UserData.*;

public class RegistrationPage extends FactoryPage {
    @FindBy(id = "customer.firstName")
    private WebElement FIRST_NAME_FIELD_REGISTER;

    @FindBy(id = "customer.lastName")
    private WebElement LAST_NAME_FIELD_REGISTER;

    @FindBy(id = "customer.address.street")
    private WebElement ADDRESS_FIELD_REGISTER;

    @FindBy(id = "customer.address.city")
    private WebElement CITY_FIELD_REGISTER;

    @FindBy(id = "customer.address.state")
    private WebElement STATE_FIELD_REGISTER;

    @FindBy(id = "customer.address.zipCode")
    private WebElement ZIP_CODE_FIELD_REGISTER;

    @FindBy(id = "customer.phoneNumber")
    private WebElement PHONE_NUMBER_FIELD_REGISTER;

    @FindBy(id = "customer.ssn")
    private WebElement SSN_FIELD_REGISTER;

    @FindBy(id = "customer.username")
    private WebElement USERNAME_FIELD_REGISTER;

    @FindBy(id = "customer.password")
    private WebElement PASSWORD_FIELD_REGISTER;

    @FindBy(id = "repeatedPassword")
    private WebElement CONFIRM_FIELD_REGISTER;

    @FindBy(css = "[value=\"Register\"]")
    private WebElement REGISTER_BUTTON;
    
    private final WebDriver driver;

    public RegistrationPage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
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
        REGISTER_BUTTON.click();
    }

    public void openPage() {
        getDriver().navigate().to(REGISTERED_URL);
    }
}