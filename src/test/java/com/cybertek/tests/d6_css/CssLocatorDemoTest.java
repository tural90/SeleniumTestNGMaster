package com.cybertek.tests.d6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssLocatorDemoTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

       // driver.navigate().to();
        driver.get("https://practice-cybertekschool.herokuapp.com/multiple_buttons");

        WebElement element = driver.findElement(By.cssSelector("button#disappearing_button"));
        System.out.println(element.getText());

        WebElement element2 = driver.findElement(By.cssSelector(".nav-link"));
        System.out.println(element2.getText());

        WebElement element3 = driver.findElement(By.cssSelector("button.btn.btn-primary"));
        System.out.println(element3.getText());

        WebElement element4 = driver.findElement(By.cssSelector(".btn-primary"));
        System.out.println(element4.getText());

        WebElement element5 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println(element5.getText());

        WebElement element6 = driver.findElement(By.cssSelector("[name=\"button6\"][onclick=\"button6()\"]"));
        System.out.println(element6.getText());

       WebElement element7 = driver.findElement(By.cssSelector("button[id*='button_']"));
       //to find the class button class that contains id "button_"
       System.out.println(element7.getText());

       WebElement element8 = driver.findElement(By.cssSelector("button[id^='button']"));
        //to find the class button class that starts with id "quick"
        System.out.println(element8.getText());

        WebElement element9 = driver.findElement(By.cssSelector("button[id$='_button']"));
        //to find the class button class that ends with id "quick"
        System.out.println(element9.getText());

        WebElement element10 = driver.findElement(By.cssSelector("div>h3"));
        System.out.println(element10.getText());

        WebElement element11 = driver.findElement(By.cssSelector("button:nth-of-type(2)"));
        System.out.println(element11.getText());


        //h3~p find element then find its next sibling.
        WebElement element12 = driver.findElement(By.cssSelector("h3~p"));
        System.out.println(element12.getText());

        //copy paste method
        WebElement element13 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/h4"));
        System.out.println(element13.getText());

        driver.quit();


    }
}
