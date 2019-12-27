package com.cybertek.tests.d2_webDriver_bascis;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallTheFactor {


    public static void main(String[] args) {

       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("CHROME");


        WebDriver driver2 = WebDriverFactory.getDriver("firefox");


    }
}
