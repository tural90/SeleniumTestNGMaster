package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class idLocatorTest {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().fullscreen();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // driver.manage().window().maximize(); for windows.

        //WebElement element = driver.findElement(By.id("button_cool"));

        WebElement element = driver.findElement(By.id("disappearing_button"));

        String txt = element.getText();

        System.out.println(txt);

        element.click();



    }
}
