package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedTest {


    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue = driver.findElement(By.id("blue"));

        Assert.assertTrue(blue.isDisplayed());
        //blue.isDisplayed() -> returns true if the element is visible on page.


        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

       // WebElement home = driver.findElement(By.linkText("home"));
       // Assert.assertTrue(home.isDisplayed());


        WebElement username = driver.findElement(By.id("username"));
        Assert.assertFalse(username.isDisplayed());




        driver.quit();
    }
}
