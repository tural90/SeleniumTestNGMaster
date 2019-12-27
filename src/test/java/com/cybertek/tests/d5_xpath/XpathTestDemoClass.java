package com.cybertek.tests.d5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTestDemoClass {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice-cybertekschool.herokuapp.com/multiple_buttons");

        WebElement link = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        System.out.println(link.getText()); //Home

        WebElement link2 = driver.findElement(By.xpath("//li/a"));
        System.out.println(link2.getText()); //Home

        WebElement link3 = driver.findElement(By.xpath("//h3"));
        System.out.println(link3.getText()); //Multiple buttons

        WebElement link4 = driver.findElement(By.xpath("//body//h3"));
        System.out.println(link4.getText());//Multiple buttons

        WebElement link5 = driver.findElement(By.xpath("//button[@onclick=\"button1()\"]"));
        System.out.println(link5.getText()); //Button 1

        WebElement link6 = driver.findElement(By.xpath("//button[.='Button 2']"));
        System.out.println(link6.getText()); //Button 2

        WebElement link7 = driver.findElement(By.xpath("//button[contains(text(),'utton 1')]"));
        System.out.println(link7.getText()); //Button 1

        WebElement link8 = driver.findElement(By.xpath("//*[.='Button 3']"));
        System.out.println(link8.getText()); //Button 3

        WebElement link9 = driver.findElement(By.xpath("//button[starts-with(@id, 'button_')]"));
        System.out.println(link9.getText()); //Button 3

        WebElement kink = driver.findElement(By.xpath("//button[contains(@id, 'button_')]"));
        System.out.println(kink.getText()); //Button 3

        WebElement sink = driver.findElement(By.xpath("//button[6]"));
        System.out.println(sink.getText()); //Don't click!

        WebElement pink = driver.findElement(By.xpath("//div/button[2]"));
        System.out.println(pink.getText()); //Button 2

        //(//a[contains(text(),'Dynamic']) [3]

        //below is the finding xpath with following sybling.

        WebElement dink = driver.findElement(By.xpath("//button[@onclick = 'button1()']/following-sibling::button"));
        System.out.println(dink.getText());//Button 2

        //below is the finding xpath with preceding sybling.

        WebElement zink = driver.findElement(By.xpath("//button[@onclick = 'button3()']/preceding-sibling::button"));
        System.out.println(zink.getText()); //Button 1



        driver.quit();

    }
}
