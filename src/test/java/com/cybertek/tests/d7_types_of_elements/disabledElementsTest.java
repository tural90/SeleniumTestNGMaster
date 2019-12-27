package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class disabledElementsTest {
    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        /**
        isEnabled --> comes from WebElement class and returns true if element is enabled
        (user can interact with it)

        When we try to interact with disabled elements 2 things can happen:
        1. no action will be taken but code will not fail.
        2. No action will be taken and "element not interactable" will be thrown.
         */

        WebElement green = driver.findElement(By.id("green"));

        System.out.println("is element enabled: "+green.isEnabled());

        /**
        #input-example>input
       1) #input-example> -- any element that has id input example

       2) input--child of that element with tag input
         */

        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement input = driver.findElement(By.cssSelector("#input-example>input"));

        System.out.println("is element enabled: "+input.isEnabled());
        input.click();

        input.sendKeys("adasdasdasdas");






        driver.quit();
    }
}
