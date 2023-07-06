package com.kraftechnologie.pages;

import com.kraftechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class LoginPage extends BasePage{

    @FindBy(css = "#email")
    public WebElement emailInputBox; //driver.findElement(By.xpath(...) bunun yerine webElement döndürür

    @FindBy(css = "#yourPassword")
    public WebElement passwordINputBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'incorrect')]")
    public WebElement passwordErrorMessage;

    @FindBy(xpath = "//div[contains(text(),'address')]")
    public WebElement usernameErrorMessage;

    //AND LOGİC
    @FindBys({
            @FindBy(css = "#email"),
            @FindBy(name = "email")
    })
    public WebElement emailInputBoxWithFindBys;

    //OR LOGİC
    @FindAll({
            @FindBy(id = "email"),
            @FindBy(name = "anOtherName")
    })
    public WebElement emailInputBoxWithFindAll;

    public void login(String userEmail,String password){
        emailInputBox.sendKeys(userEmail);
        passwordINputBox.sendKeys(password);
        loginButton.click();
    }
    //method OVERLOADİNG
    public void login(){
        emailInputBox.sendKeys(ConfigurationReader.get("userEmail"));
        passwordINputBox.sendKeys(ConfigurationReader.get("userPassword"));
        loginButton.click();
    }

}
