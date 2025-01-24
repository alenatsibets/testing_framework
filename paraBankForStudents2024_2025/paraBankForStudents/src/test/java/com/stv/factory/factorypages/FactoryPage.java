package com.stv.factory.factorypages;

import com.stv.framework.core.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class FactoryPage {
    @FindBy(linkText = "contact")
    private WebElement EMAIL_CUSTOMER_CARE_BUTTON;
    @FindBy(linkText = "Home")
    private WebElement HOME_LINK;
    @FindBy(id = "footermainPanel")
    private WebElement FOOTER;
    private By LOGOUT_LINK = By.linkText("Log Out");

    protected static WebDriver getDriver() {
        return MyDriver.getDriver();
    }

    protected FactoryPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void sendValue(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void clickCustomerCareButton() {
        EMAIL_CUSTOMER_CARE_BUTTON.click();
    }

    public void clickHomeLink() {
        HOME_LINK.click();
    }
    public boolean isFooterVisible() {
        return FOOTER.isDisplayed();
    }

    public boolean isLogOutLinkPresent(WebDriver driver) {
        return driver.findElements(LOGOUT_LINK).size() > 0;
    }
}
