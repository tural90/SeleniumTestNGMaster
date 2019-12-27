package com.cybertek.tests.d17_extent_reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentDemoTest {
    // ExtentReports report; --> this class is used for starting and building the report.
    ExtentReports report;
    // ExtentHtmlReporter;--> this class is used to create the html report
    ExtentHtmlReporter htmlReporter;
    // ExtentTest extentLogger;--> this will define a test, enables logs, authors, test info, etc.
    ExtentTest extentLogger;

    @BeforeMethod
    public void setUp() {
        // initialize the classes
        report = new ExtentReports();


        //create report path
        //System.out.println(System.getProperty(“user.dir”)); //returns the location/path of the project.
        String path = System.getProperty("user.dir")+"/test-output/report.html";

        //initialize the html reporter with the report path.
        htmlReporter = new ExtentHtmlReporter(path);

        //attach the html report to the report object.
        report.attachReporter(htmlReporter);

        //set the title of the report
        htmlReporter.config().setReportName("Vytrack smoke tests");

        //set environment information
        report.setSystemInfo("Environment","QA");
        report.setSystemInfo("browser","chrome");
        report.setSystemInfo("whats my name","john n goodenough");


    }

    @Test
    public void test1(){
        extentLogger = report.createTest("TC001 Login as driver test");
        extentLogger.info("Open chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter driver login info");
        extentLogger.info("click verify logged in");
        extentLogger.info("TC001 passed");



    }

    @AfterMethod
    public void close(){
        //this is when report is actually created
        report.flush();
    }
}