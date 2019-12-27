package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException{


        /*
       Java it is a programming language in which we write out tests
       intelliji we use to write and execute our codes/tests
       eclipse we use to write and execute our codes/tests
       selenium automation tool it is just another library
       library/dependency: set of pre-written classes methods which we can add to out collection
       Maven: build management tool we use it to manage dependencies. we add selenium testing ect using Maven

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //open a website

        driver.get("https://cybertekschool.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

    //this is not from selenium, it is from java
        //it pauses the program
        Thread.sleep(1000);

        //driver.navigate().back() --> goes back to previous page.
       // driver.manage().window().fullscreen();
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        System.out.println(driver.getTitle());

        //driver.navigate().forward() --> goes forward to previous page.
        driver.navigate().forward();

        Thread.sleep(1000);


        driver.get("http://google.com");

        driver.quit();


    }
}
