package com.kraftechnologie.tests.day04_basics_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class S04_TagNameLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        driver.findElement(By.name("email")).sendKeys("mike@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("mike1234");

        driver.findElement(By.cssSelector("[type='submit']")).click();

        System.out.println("driver.findElement(By.tagName(\"h2\")).getText() = " +
                driver.findElement(By.tagName("h2")).getText()); //mike

        System.out.println("driver.findElement(By.tagName(\"h3\")).getText() = " +
                driver.findElement(By.tagName("h3")).getText()); //SDET

        Thread.sleep(2000);
        driver.close();


    }
}
