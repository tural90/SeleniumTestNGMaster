package com.cybertek.tests.d10_syncronisation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleepExample {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


    }



    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
@Test
    public void test() throws InterruptedException{
    Thread.sleep(10000);
    driver.get("http://practice.cybertekschool.com/dynamic_loading/3");

    /**
     Thread.sleep(1000);
    it is from java,not related to selenium. Used to pause the program.
     Recommended to minimize use of thread.sleep. it slows the execution of tests
     */

    driver.findElement(By.id("username")).sendKeys("goodusername");

    driver.findElement(By.id("pwd")).sendKeys("goodpassword");

}



}
