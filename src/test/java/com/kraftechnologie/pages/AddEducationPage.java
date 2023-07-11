package com.kraftechnologie.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEducationPage extends BasePage{
    @FindBy(css = "#school")
    public WebElement schoolOrBootcamp;

    @FindBy(css = "#degree")
    public WebElement degreeOrCertificate;

    @FindBy(css = "#study")
    public WebElement study;

    @FindBy(xpath = "(//*[@id='fromdate'])[2]")
    public WebElement fromDate;

    @FindBy(css = "#todateedu")
    public WebElement toDate;

    @FindBy(xpath = "(//*[@id='description'])[2]")
    public WebElement programDescription;

    @FindBy(xpath = "(//*[.='Add Education'])[2]")
    public WebElement addEducationButton;



}
