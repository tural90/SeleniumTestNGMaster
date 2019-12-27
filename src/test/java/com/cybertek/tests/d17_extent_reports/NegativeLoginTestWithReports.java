package com.cybertek.tests.d17_extent_reports;


import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReports extends TestBase {

    @Test
    public void wrongUserNameTest(){
        extentLogger = report.createTest("Wrong username Test");
        LoginPage loginPage =  new LoginPage();
        extentLogger.info("Enter username");
        loginPage.userName.sendKeys("superAdminuser");
        extentLogger.info("Enter password");
        loginPage.password.sendKeys("UserUser123");
        extentLogger.info("click submit");
        loginPage.submit.click();
        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa2.vytrack.com/user/login");
        extentLogger.pass("PASS: Wrong password test");




    }




    }


