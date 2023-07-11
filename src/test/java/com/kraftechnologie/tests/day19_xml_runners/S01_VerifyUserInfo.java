package com.kraftechnologie.tests.day19_xml_runners;

import com.aventstack.extentreports.reporter.ExtentLoggerReporter;
import com.kraftechnologie.pages.EditProfilePage;
import com.kraftechnologie.pages.LoginPage;
import com.kraftechnologie.pages.UserProfilePage;
import com.kraftechnologie.tests.TestBase;
import com.kraftechnologie.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S01_VerifyUserInfo extends TestBase {
    /** Class Task
     Login as a mike
     Verify that login is successful
     Click on My profile
     Click on Edit Profile
     Verify that job is SDET
     */

    @Test
    public void verifyUserInfo() {
        LoginPage loginPage=new LoginPage();
        UserProfilePage userProfilePage=new UserProfilePage();
        EditProfilePage editProfilePage=new EditProfilePage();

        extentLogger=report.createTest("Test for practice");

        extentLogger.info("go to url");
        driver.get(ConfigurationReader.get("url"));

       extentLogger.info("Login as Mike");
       loginPage.login();

       extentLogger.info("verify that you are on the home page by using mike");
       String expected="mike";
       //String actual=loginPage.userAccountName.getText();
        String actual=loginPage.getUserAccountName();
        Assert.assertEquals(actual,expected);

        extentLogger.info("click on my profile");
        loginPage.navigateToModule("mike","My Profile");

        extentLogger.info("click on edit profile");
        userProfilePage.navigateToOverViewMenu("Edit Profile");

        extentLogger.info("verify that the job is SDET");
        String expectedJob="SDETT";
        String actualJob=editProfilePage.getSelectedJob();
        Assert.assertEquals(actual,expected);

        extentLogger.pass("PASSED");








    }
}
