package com.cybertek.tests.d17_extent_reports;

import org.testng.annotations.Test;

public class FileExamples {

    @Test
    public void test(){
        System.out.println(System.getProperty("user.dir"));

        String path = System.getProperty("user.dir")+"/test-output/report.html";
        System.out.println(path);
    }
}
