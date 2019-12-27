package com.cybertek.tests.d10_syncronisation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("safari");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS);

        /**

         implicitlyWait - > this is a wait/
        syncronization option from selenium
         takes 2 parameters
         1.Amount of time.
         2. Unit of time.

         This waits for elements to be found in HTML. Implicit wait only waits with findElement method.
         Implicity wait only waits until the element is located. If we gave many findElements method it will
         apply to every methods if its given once in before method. Doesn't work with finfElementssssss

         thread.sleep  --> waits every time when we call it.
         Implicit wait--> call only one time, it will wait when finding element.

         */



    }



    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test() {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

        System.out.println(driver.findElement(By.id("finish")).getText());



    }
}
