package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxesTest {
    /**
     Checkboxes are type of input elements which can be selected or unselected. When we have group of
     checkboxes, selecting or un-selecting one checkbox does not affect the selection of the other one.

     */

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        ////input[1] -> give me input element which is the first index input among its siblings.

        WebElement one = driver.findElement(By.xpath("//input[1]"));
        WebElement two = driver.findElement(By.xpath("//input[2]"));

        System.out.println("One is selected: " + one.isSelected());

        System.out.println("Two is Selected: "+ two.isSelected());

        //verify one is not selected
        Assert.assertFalse(one.isSelected());

        //verify two is selected
        Assert.assertTrue(two.isSelected());

        System.out.println("===============");

        System.out.println("check the first checkbox - one: ");

        one.click();

        System.out.println("One is selected: " + one.isSelected());

        System.out.println("Two is Selected: "+ two.isSelected());

        //verify one is selected
        Assert.assertTrue(one.isSelected());

        //verify two is selected
        Assert.assertTrue(two.isSelected());

        System.out.println("================");
        System.out.println("uncheck the first one");

        one.click();

        System.out.println("One is selected: " + one.isSelected());
        Assert.assertFalse(one.isSelected());

        two.click();
        System.out.println("Two is selected: "+two.isSelected());
        Assert.assertFalse(two.isSelected());



        driver.quit();

    }
}
