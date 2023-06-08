package com.kraftechnologie.tests.day02_webdriver_basics;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class S04_CallWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {

        //TASK
        //go to "https://www.krafttechexlab.com" with chrome by using getDriver() method
        //verify that the url is "https://www.krafttechexlab.com"

        /*
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.krafttechexlab.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String actualUrl=driver.getCurrentUrl(); */

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        String expectedUrl="https://www.krafttechexlab.com/";
        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.quit();
    }
}
