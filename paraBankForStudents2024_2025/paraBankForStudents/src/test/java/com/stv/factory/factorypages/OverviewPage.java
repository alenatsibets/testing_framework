package com.stv.factory.factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OverviewPage extends FactoryPage {
    private final WebDriver driver;
    @FindBy(linkText = "Update Contact Info")
    private WebElement UPDATE_CONTACT_LINK;

    @FindBy(linkText = "Log Out")
    private WebElement LOGOUT_LINK;

    public OverviewPage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickUpdateContactLink() {
        UPDATE_CONTACT_LINK.click();
    }

    public void clickLogOutLink() {
        LOGOUT_LINK.click();
    }
}
