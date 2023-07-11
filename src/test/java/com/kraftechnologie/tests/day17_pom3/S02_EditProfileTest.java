package com.kraftechnologie.tests.day17_pom3;

import com.kraftechnologie.pages.*;
import com.kraftechnologie.tests.TestBase;
import com.kraftechnologie.utilities.BrowserUtils;
import com.kraftechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class S02_EditProfileTest extends TestBase {
    /**
     * Class Task
     * THIS TASK WILL BE IMPLEMENTED USING POM
     * which means we will have one test class for the test
     * and one corresponding page having all locators and actions for the page
     * go to https://www.krafttechexlab.com/login
     * enter valid credentials
     * --> john@gmail.com
     * --> John1234.
     * go to John --> myProfile
     * create a method that navigate you to specific module based on the given parameter
     * go to Edit Profile page using the method just mentioned above
     * fill out the fields
     * -->about --> SDET programme , graduated from KraftTech
     * -->Company --> Google
     * -->Job  --> QA Automation Engineer
     * -->Website --> www.google.com
     * -->Location --> Istanbul
     * -->Skills --> Java,Selenium, TestNG
     * click save changes button
     * verify that "profile updated" appears
     */

    @Test
    public void editProfile() {
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        UserProfilePage userProfilePage = new UserProfilePage();
        EditProfilePage editProfilePage = new EditProfilePage();

        driver.get(ConfigurationReader.get("url"));
        loginPage.login("john@gmail.com", "John1234.");

        BrowserUtils.waitForVisibility(dashboardPage.userAccountName, 5);

        dashboardPage.navigateToModule("John", "My Profile");
        userProfilePage.navigateToOverViewMenu("Edit Profile");
        BrowserUtils.waitFor(1);
        editProfilePage.aboutInputBox.clear();
        editProfilePage.aboutInputBox.sendKeys("SDET programme , graduated from KraftTech");
        BrowserUtils.waitFor(1);
        editProfilePage.companyInputBox.clear();
        editProfilePage.companyInputBox.sendKeys("Google");
        /**
         Select select=new Select(editProfilePage.jobInputBox);
         select.selectByVisibleText("QA Automation Engineer");
         */
        BrowserUtils.waitFor(1);
        editProfilePage.selectJob("QA Automation Engineer");
        BrowserUtils.waitFor(1);
        editProfilePage.websiteInputBox.clear();
        editProfilePage.websiteInputBox.sendKeys("www.google.com");
        BrowserUtils.waitFor(1);
        editProfilePage.locationInputBox.clear();
        editProfilePage.locationInputBox.sendKeys("Istanbul");
        BrowserUtils.waitFor(1);
        editProfilePage.skillsInputBox.clear();
        editProfilePage.skillsInputBox.sendKeys("Java,Selenium,TestNG");
        BrowserUtils.waitFor(1);
        editProfilePage.saveChangeBtn.click();

        String expectedMesage = "Profile Updated";
        //String actualMessage=userProfilePage.updateMessage.getText();
        String actualMessage = userProfilePage.updateMessageGetText();

        Assert.assertEquals(actualMessage, expectedMesage);
    }
    /** Add experience
     *  ADD EDUCATİON
     */

    /**
     * Homework Task
     * THIS TASK WILL BE IMPLEMENTED USING POM
     * which means we will have one test class for the test
     * and one corresponding page having all locators and actions for the page
     * go to https://www.krafttechexlab.com/login
     * enter valid credentials
     * --> gabriel@gmail.com
     * --> Besiktas1903
     * go to Batistuta --> myProfile
     * create a method that navigate you to specific module based on the given parameter
     * go to Add Experience page using the method just mentioned above
     * fill out the fields
     * -->Job Title  --> QA Automation Engineer
     * -->Company --> Amazon
     * -->Location --> Kirikkale
     * -->From Date -->11,03,2023
     * -->To Date -->09,07,2023
     * -->Job Description -->SDET programme , graduated from KraftTech
     * click save changes button
     * verify that "experince Details" appears
     */

    @Test
    public void addExperience() {
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        UserProfilePage userProfilePage = new UserProfilePage();
        AddExperiencePage addExperiencePage = new AddExperiencePage();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);

        driver.get(ConfigurationReader.get("url"));
        loginPage.login("gabriel@gmail.com", "Besiktas1903");

        dashboardPage.navigateToModule("Batistuta", "My Profile");
        userProfilePage.navigateToOverViewMenu("Add Experience");

        addExperiencePage.jobTitle.sendKeys("QA Automation Engineer");
        BrowserUtils.waitFor(2);
        addExperiencePage.company.sendKeys("Amazon");
        BrowserUtils.waitFor(2);
        addExperiencePage.location.sendKeys("Kirikkale");
        BrowserUtils.waitFor(2);
        addExperiencePage.fromDate.sendKeys("11.03.2023");
        BrowserUtils.waitFor(2);
        addExperiencePage.toDate.sendKeys("09.07.2023");
        BrowserUtils.waitFor(2);
        addExperiencePage.jobDescription.sendKeys("SDET programme , graduated from KraftTech");
        BrowserUtils.waitFor(2);
        jse.executeScript("window.scrollBy(0,500)");
        BrowserUtils.waitFor(2);
        addExperiencePage.addExperienceButton.click();
        jse.executeScript("window.scrollBy(0,500)");
        Assert.assertNotNull(userProfilePage.experienceDetails);
    }

    /** Homework Task
     * THIS TASK WILL BE IMPLEMENTED USING POM
     * which means we will have one test class for the test
     * and one corresponding page having all locators and actions for the page
     * go to https://www.krafttechexlab.com/login
     * enter valid credentials
     *      --> gabriel@gmail.com
     *      --> Besiktas1903
     * go to Batistuta --> myProfile
     * create a method that navigate you to specific module based on the given parameter
     * go to Add Education page using the method just mentioned above
     * fill out the fields
     *      -->School or Bootcamp --> KraftTech
     *      -->Degree or Certificate -->Yes
     *      -->Study --> Selenium
     *      -->From Date -->11.03.2023
     *      -->To Date -->09.07.2023
     *      -->Program Description -->SDET Programme
     *      click save changes button
     *      verify that "Education Details" appears
     */

    @Test
    public void addEducation(){
        LoginPage loginPage=new LoginPage();
        DashboardPage dashboardPage=new DashboardPage();
        UserProfilePage userProfilePage=new UserProfilePage();
        AddEducationPage addEducationPage=new AddEducationPage();
        JavascriptExecutor jse=(JavascriptExecutor)driver;

        driver.get(ConfigurationReader.get("url"));
        loginPage.login("gabriel@gmail.com","Besiktas1903");
        dashboardPage.navigateToModule("Batistuta","My Profile");
        userProfilePage.navigateToOverViewMenu("Add Education");
        addEducationPage.schoolOrBootcamp.sendKeys("KraftTech");
        BrowserUtils.waitFor(1);
        addEducationPage.degreeOrCertificate.sendKeys("Yes");
        BrowserUtils.waitFor(1);
        addEducationPage.study.sendKeys("Selenium");
        BrowserUtils.waitFor(1);
        addEducationPage.fromDate.sendKeys("11.03.2023");
        BrowserUtils.waitFor(1);
        addEducationPage.toDate.sendKeys("09.07.2023");
        BrowserUtils.waitFor(1);
        addEducationPage.programDescription.sendKeys("SDET Programme");
        BrowserUtils.waitFor(1);
        jse.executeScript("window.scrollBy(0,600)");
        addEducationPage.addEducationButton.click();
        BrowserUtils.waitFor(1);

        Assert.assertNotNull(userProfilePage.educationDetails);






    }






}
