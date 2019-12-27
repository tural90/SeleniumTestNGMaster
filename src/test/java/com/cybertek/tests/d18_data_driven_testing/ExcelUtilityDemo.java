package com.cybertek.tests.d18_data_driven_testing;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilityDemo {

    @Test
    public void readExcelTest(){

        //create an instance of excel utility
        //argument 1: location of the file.
        //argument2: sheet we want to open
        ExcelUtil qa1Short = new ExcelUtil("src/test/resources/Vytrack testusers.xlsx","QA1-short");
        //get column count
        System.out.println("column count is: "+ qa1Short.columnCount());
        //get column names
        System.out.println(qa1Short.getColumnsNames());
        List<Map<String, String>> dataList = qa1Short.getDataList();

        for (Map<String, String>stringStringMap:dataList) {
            System.out.println(stringStringMap);
        }

        String[][] dataArray = qa1Short.getDataArray();
        System.out.println("=====================");
        System.out.println(Arrays.deepToString(dataArray));
    }
}


