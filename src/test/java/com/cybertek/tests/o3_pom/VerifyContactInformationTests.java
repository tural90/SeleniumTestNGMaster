package com.cybertek.tests.o3_pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class VerifyContactInformationTests extends TestBase {
    /**
     * Go to https://qa3.vytrack.com/user/login
     * And login
     * Go to customers —> contacts
     * Click on email mbrackstone9@example.com 
     * Verify that full name is Ms Mariam Brackstone
     * Verify that email is 18982323434
     * Verify that phone number is   mbrackstone9@example.com 
     */
    @Test
    public void contactDetailsTest(){
        // add this test to the extent report
        extentLogger = report.createTest("Contacts details test");

        // And login
        extentLogger.info("Login");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        loginPage.login(username, password);
    }
}





