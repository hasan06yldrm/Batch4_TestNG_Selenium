package com.kraftechnologie.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {


    //write a static method
    //that is named gerDriver
    //it takes a string parameter (browserType)
    //it will setup browser
    //it will return a driver based on parameter (chrome,firefox,safari)

    public static WebDriver getDriver(String browserType){
        WebDriver driver=null;
        switch (browserType.toLowerCase()){ //Chrome //CHROME //CHrome
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().window().maximize();
                break;
        }
        return driver;
    }
}
