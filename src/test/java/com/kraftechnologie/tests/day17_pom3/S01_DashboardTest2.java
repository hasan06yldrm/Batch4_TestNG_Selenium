package com.kraftechnologie.tests.day17_pom3;

import com.kraftechnologie.pages.DashboardPage;
import com.kraftechnologie.pages.LoginPage;
import com.kraftechnologie.tests.TestBase;
import com.kraftechnologie.utilities.BrowserUtils;
import com.kraftechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class S01_DashboardTest2 extends TestBase {
    /**

     login with Mike
     verify that you are on the dashboard page by using 'Dashboard' keyword at top-left
     Verify that uptitles are following by using BrowserUtils method
     Dashboard
     Developers
     Components
     Forms
     JavaScript
     mike
     */

    LoginPage loginPage;
    @Test
    public void verifyList() {
        driver.get(ConfigurationReader.get("url"));
        loginPage=new LoginPage();
        //LoginPage loginPage=new LoginPage();
        loginPage.login();

        //BrowserUtils.waitFor(2);

        DashboardPage dashboardPage=new DashboardPage();

        String expected="Dashboard";
        String actual=dashboardPage.dashboardElement.getText();
        //first assertion
        Assert.assertEquals(actual,expected);

        List<String> expectedList=new ArrayList<>();
        expectedList.add("Dashboard");
        expectedList.add("Developers");
        expectedList.add("Components");
        expectedList.add("Forms");
        expectedList.add("JavaScript");
        expectedList.add("mike");

        List<String> actualList=new ArrayList<>();

        for (WebElement menu : dashboardPage.upTitles) {
            System.out.println("menu.getText() = " + menu.getText());
            actualList.add(menu.getText());
        }
        Assert.assertEquals(actualList,expectedList);

    }
}
