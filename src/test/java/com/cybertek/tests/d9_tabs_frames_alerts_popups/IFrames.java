package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrames {

    /**
    NoSuchElementException
     1. Wrong locator
     2. Wait
     3. Frames

     In html we can have one html page inside another one. This is made possible by tag<iframe>. Using
     iframes we can put html inside other html. When we have page with iframes, selenium cannot control what
     is inside iframe. We have to stich to iframe first. When we switch to iframe, it will not see the default page

     Html
        top frame
                left frame
                mid frame
                right frame

     In selenium we can only jump one frame at a time

     NoSuchFrameException -- we get this when we provide wrong frame info to swtichto().frame() method

     No controlling :html
     driver.switchTo().frame("frame-top");
     Now controlling top frame.



     */

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }



    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/iframe");

        //switch to iframe
        //using ID or Name
        //switchTo().frame --switched to frame
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("Hello");


        //go back to first frame, useful when we have multiple frames opened and we wanna get back to first frame.
        driver.switchTo().defaultContent();

        //using INDEX
        //driver.switchTo().frame(0);
        driver.findElement(By.id("mce_0_ifr")).sendKeys("Hello");

        //go back to parent frame
        driver.switchTo().parentFrame();
        driver.findElement(By.id("mce_0_ifr")).sendKeys("Hello");

        // by WebElement --locate the iframe element and pass an argument.
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("tinymce")).sendKeys("Helloooooooo");




    }


    @Test
    public void manyManyFrames(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
        System.out.println(driver.getTitle());

        //topframe
        driver.switchTo().frame("frame-top");
        System.out.println(driver.getTitle());


        //switch to mid frame
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.getTitle());




        //go back to parent
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());

        //switch to right frame
        driver.switchTo().frame("frame-right");

        System.out.println(driver.getTitle());



        //go back to original frame
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();


        //or
        driver.switchTo().defaultContent();
    }
}
