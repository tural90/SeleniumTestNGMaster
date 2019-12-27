package com.cybertek.tests.d15_page_object_model_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTests extends TestBase {

    @Test
    public void LoginAsDriver(){
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("user2");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();


        Assert.assertEquals(driver.getCurrentUrl(),"https://qa2.vytrack.com/");


    }

    @Test
    public void loginAsStoreManager(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager101","UserUser123");
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa2.vytrack.com/");
    }
}
