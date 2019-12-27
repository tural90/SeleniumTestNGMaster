package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributesTest {



    @Test

    public void test1() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        /**
         getAttribute("") --> returns the value of the given attribute of the element
         */

        WebElement blue = driver.findElement(By.id("blue"));

        //get the value of the attribute "name"
        System.out.println(blue.getAttribute("name")); //color

        //get value of the attribute "id"
        System.out.println(blue.getAttribute("id")); //blue

        // we get null if the element does not have the given attribute
        System.out.println(blue.getAttribute("href")); //null

        //it returns true false if it is hidden attribute. shows up when clicked.
        System.out.println(blue.getAttribute("checked"));

        // returns the html information of the element.
        System.out.println(blue.getAttribute("outerHTML")); //<input type="radio" id="blue" name="color" checked="">

        //returns the text of element (on certain cases)
        System.out.println(blue.getAttribute("innerHTML"));

        driver.quit();




    }
}
