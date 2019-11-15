package com.cybertek.tests.d8_select_list;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    @Test
    public void printAllOptions(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        // Locate the element with the select tag
        WebElement element = driver.findElement(By.id("a"));

        // Create Select object by passing the element from step 2 as constructor
        Select stateList = new Select(element);

        // getOptions() --> returns all the available options from the dropdown list
        List<WebElement> options = stateList.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
}
