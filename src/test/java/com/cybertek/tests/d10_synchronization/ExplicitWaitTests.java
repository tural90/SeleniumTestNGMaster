package com.cybertek.tests.d10_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class ExplicitWaitTests {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("firefox");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1WaitForVisible(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        // click on start
        driver.findElement(By.tagName("button")).click();

        // finding element that is not visible
        WebElement username = driver.findElement(By.id("username"));

        // Create explicit wait object
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // actually

        username.sendKeys("Bibish (sorry Tural)");
    }
}
