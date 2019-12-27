package com.cybertek.tests.d11_file_upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void click(){
    driver.get("http://practice.cybertekschool.com/");
        WebElement element = driver.findElement(By.linkText("Home"));
        element.click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //first string argument is the javascript code.
        //second argument will be webelement on which the action will be taken.
        jse.executeScript("arguments[0].click();",element);

    }

    @Test
    public void type() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement element = driver.findElement(By.cssSelector("input[disabled]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String str = "hello";

//        element.sendKeys(str);
        Thread.sleep(2000);
        jse.executeScript("arguments[0].setAttribute('value', '" + str +"')", element);

    }

    @Test
    public void scroll() throws InterruptedException{
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i<5; i++){
            jse.executeScript("scroll(0,500);");
            Thread.sleep(2000);
        }
    }
}
