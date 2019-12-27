package com.cybertek.tests.d15_page_object_model_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {


    /**


     Framerwork is organization of files, folders in a way that makes automated testing easy.

     Properties file -- keep the inportant test information

     More utilities

     Configuration reader -- reads from the properties file

     Driver class -- single class that creates and provides web driver object for all tests

     Test base -- contains common logic and properties for all tests.

     Page object model -- this is a design pattern that enhances easiness of maintaining and reusing code.
     It is encapsulated class that mirrors the behavior and objects of a web page from the AUT(application under test).
     In page object model we create classes that serve as object repository.

     In page object model, we operate the test logic from the UI logic.
     Pom file -- this is pom.xml and has nothing to do with selenium

     POM - abbreviation for Page Object Model.

     Easy to maintain, scale, reusable (reasons for framework).



     Page Object Model vs Page Factory

     Page Object Model -- design pattern in selenium
     Page Factory - is a class in selenium using which we can create page object model.

     When we create a page object class, we create public constructor for this class.
     In the constructor body we call static initElements method from the PageFactory class.
     initElements takes 2 params: 1.Webdriver object, 2.instance of object class

     @FindBy -- annotation from selenium, used to provide locator for the element.

     */
    @Test
    public void wrongPasswordTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("salesmanager101");
        loginPage.password.sendKeys("greatpassword");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa2.vytrack.com/user/login");


    }

@Test
    public void wrongUserNameTest(){

LoginPage loginPage =  new LoginPage();
loginPage.userName.sendKeys("superAdminuser");
loginPage.password.sendKeys("UserUser123");
loginPage.submit.click();




    }


}
