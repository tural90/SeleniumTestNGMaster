package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Asiye {



    public static void main(String[]  args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("safari");
        driver.get("https://qa2.vytrack.com/user/login");

        WebElement userInput = driver.findElement(By.id("prependedInput"));
        userInput.sendKeys("user18");

        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        Thread.sleep(1000);


        WebElement enter = driver.findElement(By.id("_submit"));
        enter.click();



        String expected = "https://qa2.vytrack.com";
        String actual = driver.getCurrentUrl();
        if (expected.equals(actual)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        driver.quit();




    }


    }

