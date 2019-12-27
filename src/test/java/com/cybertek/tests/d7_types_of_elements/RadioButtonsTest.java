package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTest {


    /**
     Plan
     Radio buttons
     Checkboxes

     Attributes
     Is selected
     Is displayed

     List of elements
     Select lists

     Radio Buttons

     Type of elements in which only one can be selected. In group of radio buttons, we should not be able to
     select 2 more radio buttons.

     isSelected --> comes from WebElement class and returns true if element is selected/checked.
     */

    @Test
public void test(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blue = driver.findElement(By.id("blue"));
        WebElement red = driver.findElement(By.id("red"));

        System.out.println("is blue selected "+blue.isSelected());
        System.out.println("is red selected "+red.isSelected());

        //verify if blue is selected.
        Assert.assertTrue(blue.isSelected());

        //verify if red is not selected.
        Assert.assertFalse(red.isSelected());

        System.out.println("Clicking on red");

        red.click();


        System.out.println("is blue selected "+blue.isSelected());
        System.out.println("is red selected "+red.isSelected());

        //verify blue is NOT selected
        Assert.assertFalse(blue.isSelected());

        //verify red is selected
        Assert.assertTrue(red.isSelected());


        driver.quit();
    }
}
