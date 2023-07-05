package com.kraftechnologie.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{

    @FindBy(css = "#email")
    public WebElement emailInputBox;

    @FindBy(css = "#yourPassword")
    public WebElement passwordINputBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'incorrect')]")
    public WebElement passwordErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'address')]")
    public WebElement usernameErrorMessage;

}
