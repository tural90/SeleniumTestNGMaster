package com.cybertek.tests.d11_file_upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionExamplesTest {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }


    @Test
    public void hoverTest()throws InterruptedException{
        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img1  = driver.findElement(By.tagName("img"));
        Actions actions = new Actions(driver);

        Thread.sleep(2000);

        actions.moveToElement(img1).perform();

        //movetoElement is to move mouse on top of the element, perform is to complete the action.

        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());

    }

    @Test
    public void dragDropTest() throws InterruptedException{
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        Thread.sleep(2000);

        actions.dragAndDrop(source,target).perform();

    }

    @Test
    public void dragDropByChainingTest(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
    }




}