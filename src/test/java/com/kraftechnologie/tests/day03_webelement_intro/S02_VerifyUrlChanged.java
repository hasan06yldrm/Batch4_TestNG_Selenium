package com.kraftechnologie.tests.day03_webelement_intro;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class S02_VerifyUrlChanged {
    public static void main(String[] args) throws InterruptedException {

        /** Class Task 2
         * open chrome browser
         * go to https://www.krafttechexlab.com/login  page
         * enter email as     (mike@gmail.com)
         * enter password as  ("mike1234")
         * click login button
         * verify that url has changed
         */

        String email="mike@gmail.com";
        String password="mike1234";

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com/login");

        //enter email -> sendKeys()
        WebElement emailInputBox=driver.findElement(By.id("email"));
        emailInputBox.sendKeys(email);

        //enter email -> sendKeys()
        WebElement passwordInputBox=driver.findElement(By.id("yourPassword"));
        passwordInputBox.sendKeys(password);

        //click login button
        WebElement loginBtn=driver.findElement(By.cssSelector("[type=\"submit\"]"));
        loginBtn.click();

        //Thread.sleep(2000);hata almadığımız için kapattık

        String expectedUrl="https://www.krafttechexlab.com/index";
        String actualUrl=driver.getCurrentUrl();
        System.out.println("expecterUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }


        Thread.sleep(2000);
        driver.close();






    }
}
