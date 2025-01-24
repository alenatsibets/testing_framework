package com.stv.factory.factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateContactPage extends FactoryPage {
    private final WebDriver driver;
    @FindBy(css = "[value=\"Update Profile\"]")
    private WebElement UPDATE_BUTTON;

    public UpdateContactPage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public boolean isUpdateButtonDisplayed() {
        return UPDATE_BUTTON.isDisplayed();
    }
}
