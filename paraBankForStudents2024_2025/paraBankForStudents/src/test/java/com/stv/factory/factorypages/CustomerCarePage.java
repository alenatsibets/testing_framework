package com.stv.factory.factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerCarePage extends FactoryPage {
    private final WebDriver driver;
    @FindBy(id = "name")
    private WebElement NAME_FIELD;

    public CustomerCarePage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }
    public boolean isNameFieldEmpty() {
        String fieldValue = NAME_FIELD.getAttribute("value");
        return fieldValue == null || fieldValue.isEmpty();
    }
}
