package com.cybertek.tests.d11_file_upload_actions_class;

import org.testng.annotations.Test;

public class FileExamples {

    @Test
    public void test(){
        System.out.println(System.getProperty("user.dir"));
        ///Users/turalfataliyev/IdeaProjects/Summer2019VATESTNGSeleniumProject

        System.out.println(System.getProperty("os.name"));
        //Mac OS X

        System.out.println(System.getProperty("user.home"));
        ///Users/turalfataliyev

        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        ///Users/turalfataliyev/IdeaProjects/Summer2019VATESTNGSeleniumProject


        String relativePath = "/src/test/resources/test_file.txt";



        String fullPath = projectPath+relativePath;
        System.out.println(fullPath);
        ///Users/turalfataliyev/IdeaProjects/Summer2019VATESTNGSeleniumProjectsrc/test/resources/test_file.txt


        ///Users/turalfataliyev/IdeaProjects/Summer2019VATESTNGSeleniumProject/src/test/resources/test_file.txt

    }
}
