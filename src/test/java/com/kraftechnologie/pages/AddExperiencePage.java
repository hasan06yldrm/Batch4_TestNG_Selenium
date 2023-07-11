package com.kraftechnologie.pages;

import com.kraftechnologie.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddExperiencePage extends BasePage{

    @FindBy(xpath = "//input[@id='job']")
    public WebElement jobTitle;

    @FindBy(xpath = "(//input[@id='company'])[2]")
    public WebElement company;

    @FindBy(xpath = "(//input[@id='location'])[2]")
    public WebElement location;

    @FindBy(xpath = "(//textarea[@id='description'])[1]")
    public WebElement jobDescription;

    @FindBy(xpath = "(//input[@id='fromdate'])[1]")
    public WebElement fromDate;

    @FindBy(css = "#todateexp")
    public WebElement toDate;

    @FindBy(xpath = "(//*[.='Add Experience'])[2]")
    public WebElement addExperienceButton;


}






