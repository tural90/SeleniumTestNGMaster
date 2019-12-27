package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class VerifyURLNotChanged {

    /**
     Verify URL not changed
     open chrome browser
     go to http://practice.cybertekschool.com/forgot_password
     click on Retrieve password
     verify that url did not change

     */

    public static void main(String[] args) {

        //open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save the expected url
        String expectedUrl = driver.getCurrentUrl();

        //click on Retrieve password
        //WebElement --> class that represents elements from the webpage
        //findElement --> method used to find element on the page
        //returns webElement
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));

        retrievePassword.click();

        //verify that url did not change
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }



    }
}
