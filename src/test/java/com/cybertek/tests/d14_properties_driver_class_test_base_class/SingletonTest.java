package com.cybertek.tests.d14_properties_driver_class_test_base_class;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class SingletonTest {

    @Test
    public void test1() {
        // if you umcomment next line it will show compilation error
        // because we cannot create object of that class
//        Singleton s = new Singleton();

        String s1 = Singleton.getInstance();

        String s2 = Singleton.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }




    @Test
    public void test2(){

        //to open browser.. the type of the driver will come from properties file.
        WebDriver driver = Driver.get();


        String url = ConfigurationReader.get("url");
        //we use to close the driver
        Driver.closeDriver();


    }



    @Test
    public void test3(){

        //this is how we create webdriver object from now on

        //the type of the driver will come from the properties file


        String url = ConfigurationReader.get("url");

    }}
