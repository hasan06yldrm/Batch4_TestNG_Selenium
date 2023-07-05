package com.kraftechnologie.tests.day15_pom1;

import com.kraftechnologie.pages.LoginPage;
import com.kraftechnologie.tests.TestBase;
import com.kraftechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S01_PositiveLoginTest extends TestBase {
    /**

     go to kraft login page
     login as Mike
     validate that you are on the dashboard with url*/
    @Test
    public void loginTest_1() throws InterruptedException {
        driver.get(ConfigurationReader.get("url"));

        //OLD WAY
        WebElement emailInputBox = driver.findElement(By.cssSelector("#email"));
        WebElement passwordInputBox = driver.findElement(By.cssSelector("yourPassword"));

        LoginPage loginPage=new LoginPage();

        WebElement emailBox=loginPage.emailInputBox;
        WebElement passwordBox=loginPage.passwordINputBox;
        WebElement login=loginPage.loginButton;

        emailBox.sendKeys(ConfigurationReader.get("userEmail"));
        passwordBox.sendKeys(ConfigurationReader.get("userPassword"));
        login.click();

        Thread.sleep(3000);

        String expected="https://www.krafttechexlab.com/index";
        String actual=driver.getCurrentUrl();

        Assert.assertEquals(actual,expected);

    }
}
