package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Practice {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().fullscreen();



        driver.get("http://aztu.edu.az/azp/#/azp/main.do");

        String locator = "/azp/curriculum/education/az/main/main";

        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("azp/curriculum/education/az/main/main")));



        WebElement element = driver.findElement(By.xpath("//*[@id=\"menus1\"]/ul/li/a[3]"));

        element.getText();

        Thread.sleep(1000);

        driver.quit();



    }

}



