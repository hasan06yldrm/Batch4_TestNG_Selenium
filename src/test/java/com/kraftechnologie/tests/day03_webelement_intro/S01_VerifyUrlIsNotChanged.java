package com.kraftechnologie.tests.day03_webelement_intro;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class S01_VerifyUrlIsNotChanged {
    public static void main(String[] args) throws InterruptedException {

        /** Class Task 1
         * open the chrome browser
         * go to  https://www.krafttechexlab.com/login  page
         * click on login button
         * verify that url is not changed
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");//empty browser
        driver.get("https://www.krafttechexlab.com/login");

        String expectedUrl=driver.getCurrentUrl();
        System.out.println("expectedUrl = " + expectedUrl);

        //click() on login button
        WebElement loginBtn =driver.findElement(By.cssSelector("[type=\"submit\"]"));
        loginBtn.click();

        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        Thread.sleep(5000);
        driver.close();








    }
}
