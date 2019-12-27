package com.cybertek.tests.d2_webDriver_bascis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        //open chrome browser.
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jetbrains.com/idea/download/ ");


        //get the title of the page

        String title = driver.getTitle();

        System.out.println("title = "+title);
        
        
        //getCurrentUrl(); --> gets url of this page
        
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        //getPageSource --> get
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

        driver.quit();



    }
}
