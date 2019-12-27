package com.cybertek.tests.d6_testNG;

import org.testng.annotations.*;

public class BeforeAfterTests {

    @Test
    public void test1(){
        System.out.println("this is test1");
    }

    @Test
    public void test2(){
        System.out.println("this is test2");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("BEFORE Method runs before each method we are running");
        System.out.println("Open chrome");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AFTER Method runs after each method we are running");
        System.out.println("Close chrome");
    }

    @BeforeClass
    public void setupClass(){
        System.out.println("Before Class: comes first but only runs one time");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class: comes last but only runs one time");
    }

}