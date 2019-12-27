package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 2 ways of dealing with them.

 1. HTML POP UPS
    if the pop up is from html we deal with it as if it is another web element. So we can right click and locate it,
 use find elements to get and we can click, get text.

 2. Javascript Alerts
    Second types of pop up come from javascript, mostly known as javascript alerts. We cannot right click on those alerts.
 In alerts we will not be right clock and see html. To deal with those Selenium we have Alert class

 Alert alert = driver.switchTo().alert();

 Line above is how we create the alert object. This object now represents that alerts.

 NoAlertPresentExecution --> we get this when we call the driver.switch.to alertmethod while we don't have actual
 alert on page.

 Alert must be present.
 we can accept dismiss send texts to alerts.


 */
public class PopupAndAlerts {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }



    @AfterMethod
            public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
            driver.quit();
        }

        @Test
        public void htmlPopup() {
            driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

            //bring pop up
            driver.findElement(By.xpath("//span[.='Destroy the World']"));

            //clock on the pop up
            driver.findElement(By.xpath("//span[.='No']"));
        }

        @Test
        public void jsAlerts(){
            driver.get("http://practice.cybertekschool.com/javascript_alerts");

            //trigger the alert.
            driver.findElement(By.xpath("//button[1]")).click();

            //control the alert using alert class.
            Alert alert = driver.switchTo().alert();

            //accept alert.
            alert.accept();

            //trigger the second alert.
            driver.findElement(By.xpath("//button[2]")).click();

            //switch to second alert
            alert = driver.switchTo().alert();

            //dismiss--> clicking x to close, selecting no/cancel.
            alert.dismiss();

            //trigger the third alert
            driver.findElement(By.xpath("//button[3]")).click();

            //third alert
            alert = driver.switchTo().alert();

            //send keys to alert
            alert.sendKeys("red alert");

            //print text of the alert
            System.out.println(alert.getText()); //I am a JS prompt

            //dismiss the alert.
            alert.accept();





        }






}
