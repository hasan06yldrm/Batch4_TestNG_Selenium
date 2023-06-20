package com.kraftechnologie.tests.day08_typeOfWebElements;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S03_CheckBoxDemo {
    @Test
    public void checkBoxDemoTest() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement sports=driver.findElement(By.cssSelector("input[id='hobbies-checkbox-1']"));
        WebElement reading=driver.findElement(By.cssSelector("input[id='hobbies-checkbox-2']"));
        WebElement music=driver.findElement(By.cssSelector("input[id='hobbies-checkbox-3']"));
        Assert.assertFalse(sports.isSelected());
        Assert.assertFalse(reading.isSelected());
        Assert.assertFalse(music.isSelected());

        WebElement sportsCheckbox=driver.findElement(By.xpath(
                "//div[@id='hobbiesWrapper']/div[2]/div[1]"));
        Thread.sleep(1000);
        sportsCheckbox.click();
        Assert.assertTrue(sports.isSelected());

        WebElement readingCheckbox=driver.findElement(By.cssSelector("input[id=\"hobbies-checkbox-2\"]"));
        Thread.sleep(1000);
        readingCheckbox.click();
        Assert.assertTrue(reading.isSelected());

        WebElement musicCheckbox=driver.findElement(By.cssSelector("[id=\"hobbies-checkbox-3\"]"));
        Thread.sleep(1000);
        musicCheckbox.click();
        Assert.assertTrue(music.isSelected());

        Thread.sleep(2000);
        driver.close();

    }
}
