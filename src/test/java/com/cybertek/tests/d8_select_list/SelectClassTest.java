package com.cybertek.tests.d8_select_list;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    /**
     Select Class:

     Select class is used to deal with dropdown lists.

     select --> html tag that is used for dropdown lists.

     In selenium we use the SELECT class to deal with those elements with select tag.

     Select only works with select tag.

     HOW TO USE SELECT CLASS:
     1. Make sure the dropdown uses the select tag.
     2. Locate the element with the select tag.
     3. Create select (class) object by passing the element from step 2 as a constructor.

     Select class required a constructor of type web element. That element must have tag select.

     When we try to create a select class object but passing web element which does not have select tag,
     We get UnexpectedTagNameException.
     */

    @Test
    public void printAllOptions() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //Locate the element with the select tag.
        WebElement element = driver.findElement(By.id("state"));

        // Create select (class) object by passing the element from step 2 as a constructor.
        Select stateList = new Select(element);

        //stateList = returns all the available options from the dropdown list
        List<WebElement> options = stateList.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        driver.quit();
    }

        @Test
        public void selectAndVerifySelected() throws InterruptedException {
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/dropdown");
            // create a select object.
            //1 locate the webelement with the select tag
            // create Select class object by passing that webelement as a constructor

        Select stateList2 = new Select(driver.findElement(By.id("state")));
            // verify that by default Select a State is selected
            // getFirstSelectedOption() --> returns what is currently selected, returns WEBELEMENT
            // getFirstSelectedOption().getText() --> returns the text of what is currently selected,


        String actualSelection = stateList2.getFirstSelectedOption().getText();
        System.out.println("actualSelection = "+actualSelection);
        Assert.assertEquals(actualSelection,"Select a State");

        Thread.sleep(1000);
            // SELECT USING VISIBLE TEXT
            // selectByVisibleText() --> selects using the visible text

        stateList2.selectByVisibleText("Ohio");

        actualSelection = stateList2.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection,"Ohio");

        //Select using index
            //selectByIndex --- selects using the index option, count starts from 0.

            Thread.sleep(1000);
            stateList2.selectByIndex(51);

            actualSelection = stateList2.getFirstSelectedOption().getText();
            Assert.assertEquals(actualSelection,"Wyoming");

            //Select by Value
            //selectByValue ---> select by the value of the value attribute.

            Thread.sleep(1000);
            stateList2.selectByValue("District of Columbia");
            actualSelection = stateList2.getFirstSelectedOption().getText();
            Assert.assertEquals(actualSelection,"District of Columbia");



        driver.quit();






    }

}
