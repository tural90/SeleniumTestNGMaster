package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorDemo {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().fullscreen();

        driver.get("https://translate.google.com/#view=home&op=translate&sl=es&tl=en");

        WebElement fullName = driver.findElement(By.tagName("input"));

        fullName.sendKeys("John Doe");


        WebElement email = driver.findElement(By.tagName("email"));
        email.sendKeys("jdoe@cybertekschool.com");

        WebElement submitbutton = driver.findElement(By.tagName("textarea"));


    }
}

