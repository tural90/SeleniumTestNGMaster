package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfMessage {

    public static void main(String[] args) {
        /**
         Verify confirmation message
         open browser
         go to http://practice.cybertekschool.com/forgot_password
         enter any email
         click on Retrieve password
         verify that confirmation message says 'Your e-mail's been sent!'
         */
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));

        //sendKeys --> enters given text
        String expectedEmail = "admiralkunkka@email.com";
        emailInput.sendKeys(expectedEmail);


        // verify that email is displayed in the input box
        // .getAttribute ("value") --> get text from the input box.
        String actualEmail = emailInput.getAttribute("value");

        if(expectedEmail.equals(actualEmail)){
            System.out.println("Pass");
        }else {

            System.out.println("Fail");
            System.out.println("expecteEmail = "+expectedEmail);
            System.out.println("actualEmail = "+actualEmail);
        }

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        String expectedMessage = "Your e-mail's been sent";
        WebElement messageElement = driver.findElement(By.name("confirmation_message"));
        String actualMessage = messageElement.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("expecteEmail = "+expectedMessage);
            System.out.println("actualEmail = "+actualMessage);
        }

        driver.quit();


    }
}
