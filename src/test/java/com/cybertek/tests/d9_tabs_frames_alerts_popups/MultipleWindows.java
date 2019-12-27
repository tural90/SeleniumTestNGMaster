package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {
    WebDriver driver;

    /**
     Tabs/Windows
     In selenium there is no difference between tabs and windows. By default selenium controls one page,
     one htm document at a time. When open a page it is looking at the first page.
     When we open a new window or tab, it will still be looking at the old window. To get the title of the
     window, to do anything in the new windows, we have to switch to the new window.

     In selenium we use window handles as unique IDs of windows.

     driver.getWindowHandle();
     this method returns the handle id of the current window wchich selenium is controlling at that moment

     driver.getWindowHandles()
        return handles of all windows.

     */

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }



    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }



    @Test
    public void switchWindowsTest(){

        driver.get("http://practice.cybertekschool.com/windows");

        System.out.println("before new window is opened "+driver.getTitle());

        //open the new window
        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("after new window is opened "+driver.getTitle()); //still shows title of old window

        //window () --> changes between tabs, windows
     //   driver.switchTo().window("New Window");

        String currentWindowHandle = driver.getWindowHandle();
        System.out.println("currentWindowHandle "+currentWindowHandle);

        //Set is just as arrayList but without the duplicate values
        //getwWindowHandles return a set
        Set<String> windowHandles = driver.getWindowHandles();

        for(String windowHandle: windowHandles){
            System.out.println(windowHandle);

            //iterate the set of handles and compare to the current handle.
            //if the handle is not equal to the current handle then it is the handle of the new window.

            if (!currentWindowHandle.equals(windowHandle)){
                //switch to new window by passing its handle
                driver.switchTo().window(windowHandle);
            }

        }

        System.out.println("After switching "+driver.getTitle());
    }

    @Test
    public void changeByTitle(){
        driver.get("http://practice.cybertekschool.com/windows");
        String targetTitle = "New Window";

        driver.findElement(By.linkText("Click Here")).click();

        //how many windows are open at the moment
        System.out.println(driver.getWindowHandles().size());

        //itirate through all windows
        for (String handle: driver.getWindowHandles()){
            //switch to them one by one.
            driver.switchTo().window(handle);
            //get the title and compare target title
            if (driver.getTitle().equals(targetTitle)){
                //still looping
                break;
            }
        }

        System.out.println(driver.getTitle());
    }



}
