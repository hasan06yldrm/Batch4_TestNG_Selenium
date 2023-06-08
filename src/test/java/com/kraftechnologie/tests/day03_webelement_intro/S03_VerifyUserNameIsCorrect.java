package com.kraftechnologie.tests.day03_webelement_intro;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class S03_VerifyUserNameIsCorrect {
    public static void main(String[] args) throws InterruptedException {

        /** Class Task 3
         * open chrome browser
         * go to https://www.krafttechexlab.com/login  page
         * enter email as     (mike@gmail.com)
         * enter password as  ("mike1234")
         * click login button
         * verify that username is "mike"
         * verify that home page is "Dashboard"
         */

        String email="mike@gmail.com";
        String password="mike1234";
        String expectedProfilUsername="mike";

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        //enter email -> lazy way
        driver.findElement(By.id("email")).sendKeys(email);
        //enter password ->lazy way
        driver.findElement(By.id(password)).sendKeys(password);
        //click logib btn ->lazy way
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

        //2 ways to get text from web element
        //1. getText() ->it will work %99, it will return String
        //2. getAttribute("") ->second way of getting text espescially

        WebElement profilUsername=driver.findElement(By.cssSelector(""));

        String actualProfilUsename=profilUsername.getText();

        if(expectedProfilUsername.equals(actualProfilUsename)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        Thread.sleep(2000);
        driver.close();







    }
}
