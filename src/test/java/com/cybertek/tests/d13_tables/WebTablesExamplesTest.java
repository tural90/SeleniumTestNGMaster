package com.cybertek.tests.d13_tables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesExamplesTest {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void printTable(){
        WebElement myTable = driver.findElement(By.id("table1"));
        System.out.println(myTable.getText());

        // verify jsmith@gmail.com is present in table
        Assert.assertTrue(myTable.getText().contains("jsmith@gmail.com"));
    }

    @Test
    public void getAllHeaders(){
        // get all column names individually
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());


        for (WebElement header : headers) {
            System.out.println(header.getText());
        }

        // get all column names in a single webelement
        WebElement headers2 = driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println(headers2.getText());
    }

    @Test
    public void printTableSize(){
        // NUMBER OF COLUMNS
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("number of columns: = " + headers.size());
        // NUMBER OF ROWS WITH HEADERS
        List<WebElement> allRowsIncludingHeaders = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("number of rows including headers: " + allRowsIncludingHeaders.size());

        // NUMBER OF ROWS WITHOUT HEADERS
        List<WebElement> allRowsExcludingHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("number of rows excluding headers: " + allRowsExcludingHeaders.size());

    }






}
