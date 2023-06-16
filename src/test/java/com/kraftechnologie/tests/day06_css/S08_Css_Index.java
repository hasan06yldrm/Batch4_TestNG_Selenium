package com.kraftechnologie.tests.day06_css;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class S08_Css_Index {
    public static void main(String[] args) throws InterruptedException {
        //go to https://www.krafttechexlab.com/login
        //get the email webElement as a whole
        //get the password webElement as a whole
        //get the login webElement as a whole

        //eighth formula
        //cssSyntax:nth-of-type(indexNumber)
        //NOTE: It works only if the webElements are under the same parent

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);

        WebElement emailAsWhole=driver.findElement(By.cssSelector(".col-12:nth-of-type(1)"));

        WebElement passwordAsWhole= driver.findElement(By.cssSelector(".col-12:nth-of-type(2)"));

        WebElement loginAsWhole=driver.findElement(By.cssSelector(".col-12:nth-of-type(4)"));

    }
}
