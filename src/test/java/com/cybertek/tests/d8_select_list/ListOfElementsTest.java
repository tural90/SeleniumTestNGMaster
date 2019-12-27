package com.cybertek.tests.d8_select_list;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
                            List of elements

 in selenium to locate a group of elements we use the findElements method.

 This methods return a list of elements. When we use the findElements method with wrong locator,
 NoSuchElement exception will not be thrown. Instead it will return an empty list,



 */

public class ListOfElementsTest {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("number of buttons in the web page is " + buttons.size());
        Assert.assertEquals(buttons.size(), 6);

// we are iterating though the list of elements


        for (WebElement button : buttons) {
            System.out.println(button.getText());


        }


        driver.quit();

/*
Button 1
Button 2
Button 3
Button 4
Button 5
Don't click!
 */
    }

        @Test
        public void test2(){
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/multiple_buttons");

            List<WebElement>buttons = driver.findElements(By.tagName("utton"));
            System.out.println(buttons.size());



            driver.quit();

        }




}
