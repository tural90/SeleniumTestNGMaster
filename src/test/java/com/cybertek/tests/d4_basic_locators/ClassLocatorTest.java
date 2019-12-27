package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement home = driver.findElement(By.className("nav-link"));

        home.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement title = driver.findElement(By.className("h3"));

        System.out.println(title.getText());

        WebElement button1 = driver.findElement(By.className("btn-primary"));


        driver.quit();





    }
}