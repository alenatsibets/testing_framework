package com.stv.factory.factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.stv.framework.core.lib.ParaBankPageURLs.START_URL;
import static com.stv.framework.core.lib.UserData.LOGIN_DATA;

public class MainPage extends FactoryPage {
    @FindBy(css = "img[alt='ParaBank']")
    private WebElement PARABANK_LOGO;

    @FindBy(css = "img.admin")
    private WebElement ADMIN_LOGO;

    @FindBy(linkText = "Register")
    private WebElement REGISTER_LINK;

    @FindBy(linkText = "Forgot login info?")
    private WebElement PASSWORD_RECOVERY_LINK;

    @FindBy(name = "username")
    private WebElement USERNAME_FIELD_LOGIN;

    @FindBy(name = "password")
    private WebElement PASSWORD_FIELD_LOGIN;

    @FindBy(css = "[value=\"Log In\"]")
    private WebElement LOGIN_BUTTON;

    private final WebDriver driver;


    public MainPage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public boolean isMainLogoDisplayed() {
        return PARABANK_LOGO.isDisplayed();
    }

    public boolean isLoginButtonDisplayed() {
        return LOGIN_BUTTON.isDisplayed();
    }

    public void openPage() {
        getDriver().navigate().to(START_URL);
    }

    public void clickOnAdminLogo() {
        ADMIN_LOGO.click();
    }

    public void clickPasswordRecoveryLink() {
        PASSWORD_RECOVERY_LINK.click();
    }

    public void clickRegistrationLink() {
        REGISTER_LINK.click();
    }

    public void fillLoginForm() {
        sendValue(USERNAME_FIELD_LOGIN, LOGIN_DATA);
        sendValue(PASSWORD_FIELD_LOGIN, LOGIN_DATA);
    }

    public void fillLoginFormWithUsername(String username) {
        sendValue(USERNAME_FIELD_LOGIN, username);
    }
    public void fillLoginFormWithPassword(String password) {
        sendValue(PASSWORD_FIELD_LOGIN, password);
    }

    public void clickLoginButton() {
        LOGIN_BUTTON.click();
    }
}
