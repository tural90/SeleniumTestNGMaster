package com.cybertek.tests.d16_pom_2;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PageSubtitlesTest extends TestBase {

    @Test
    public void verifySubtitleTest() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        String actial = dashboardPage.getPageSubTitle();

        Assert.assertEquals(actial, "Quick Launchpad");

        dashboardPage.navigateToModule("Activities","Calendar Events");

        actial = dashboardPage.getPageSubTitle();
        Assert.assertEquals(actial,"Calendar Events");



    }



}


