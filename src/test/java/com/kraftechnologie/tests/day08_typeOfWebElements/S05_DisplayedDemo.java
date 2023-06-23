package com.kraftechnologie.tests.day08_typeOfWebElements;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S05_DisplayedDemo {
    @Test
    public void displayedTest1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startBtn= driver.findElement(By.cssSelector("#start>button"));


        WebElement hello= driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        System.out.println("1 hello.getText() = " + hello.getText());
        System.out.println("hello.isDisplayed() = " + hello.isDisplayed());

        Assert.assertFalse(hello.isDisplayed());

        startBtn.click();
        Thread.sleep(5000);
        Assert.assertTrue(hello.isDisplayed());
        System.out.println("2 hello.getText() = " + hello.getText());


        Thread.sleep(2000);
        driver.close();

    }

}
