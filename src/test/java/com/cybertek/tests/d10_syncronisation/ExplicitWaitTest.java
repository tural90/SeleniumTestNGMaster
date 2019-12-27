package com.cybertek.tests.d10_syncronisation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTest {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(4000);
       driver.quit();
    }

    @Test
    public void test1WaitForVisible(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        //click on start

        driver.findElement(By.tagName("button")).click();


        /**
         Explicit wait
         click on start that will display the input field. Trying to interact with the element that
         is hidden but available. ElementNotReachable exception is we have to wait till its visible.

         When we wait for specific things to happen we use Explicit wait.
         */

       // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        //enter username
       // driver.findElement(By.id("username")).sendKeys("Tural");

        //finding element that is not visible.
        WebElement username = driver.findElement(By.id("username"));

        WebDriverWait wait = new WebDriverWait(driver,10);

        /**
         class used for explicit wait. it takes 2 parameters:


        */

        wait.until(ExpectedConditions.visibilityOf(username));

        //click on the element that is not visible.
        username.sendKeys("Bibish");



    }

    @Test
    public void test2TobeEnabled(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();

        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(input));

        input.sendKeys("Olessya");
    }




}