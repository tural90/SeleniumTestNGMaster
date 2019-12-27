package com.cybertek.tests.d18_data_driven_testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestWithDataProvider {

    //this method will provide test data
    @DataProvider
    public Object[][] testData(){
        String [][] data = {
            {"Kung fury", "10"},
            {"Titanic", "1"},
            {"Interstellar", "2"},
            {"I am legend","10"}
        };
        return data;
        }


        @Test(dataProvider = "testData")
    public void test1(String name, String rating){
            System.out.println("Movie "+name+" has rating of "+rating);
        }
    }

