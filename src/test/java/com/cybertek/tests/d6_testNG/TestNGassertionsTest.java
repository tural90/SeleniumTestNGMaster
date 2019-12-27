package com.cybertek.tests.d6_testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGassertionsTest {


@Test
    public void test1(){
    System.out.println("First assertion");
        Assert.assertEquals("one","onne");

    System.out.println("Second assertion");
        Assert.assertEquals(1,1);
    }


    @Test
    public void test2(){
    Assert.assertNotEquals("one","two");
    }


    @Test
    public void test3(){
    String expectedTitle = "Cybertek";
    String actualTitle = "Cybertek";
   Assert.assertTrue(expectedTitle.equals(actualTitle));
    //    System.out.println(1==1);
        Assert.assertTrue("aa@yahoo".contains("@"));


}

    @Test
    public void test4(){
    Assert.assertFalse(1<0);

}

    @AfterMethod
    public void  teardownMethod(){
    System.out.println("close chrome");
}
}
