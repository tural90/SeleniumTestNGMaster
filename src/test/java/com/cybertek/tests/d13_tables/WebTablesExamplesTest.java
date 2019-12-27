package com.cybertek.tests.d13_tables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 Webtables

 in html tables are
 */
public class WebTablesExamplesTest {


    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        actions = new Actions(driver);
        driver.get("http://practice.cybertekschool.com/tables");
        driver.navigate().forward();
    }

    @AfterMethod
    public void teardown() throws InterruptedException{
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void printTable(){
        WebElement myTable = driver.findElement(By.id("table1"));
        System.out.println(myTable.getText());

        Assert.assertTrue(myTable.getText().contains("jsmith@gmail.com"));
    }

    @Test
    public void getAllHeaders(){
        List<WebElement>headers = driver.findElements(By.tagName("th"));
        System.out.println("headers.size() = "+headers.size());
    }

    @Test
    public void getMainHeaders(){
        //get all column names individually.
        List<WebElement>headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = "+headers.size());
        for (WebElement header : headers) {
            System.out.println(header.getText());
        }


        //get all column names in a single webElement.
        WebElement headers2 = driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println(headers2.getText());

    }


    @Test
    public  void printTableSize(){
        //Number of Columns

        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println("number of columns "+headers.size());

        //Number of rows with headers

        List<WebElement>allRowsIncludingHeaders = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("number of rows including headers: "+allRowsIncludingHeaders.size());

        //Number of Rows without headers

        List<WebElement> allRowsExcludingHeaders = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
        System.out.println("number of rows excluding headers: "+allRowsExcludingHeaders.size());


    }

    @Test
    public void getRow(){
        //getany from the table using index, we will ignore the headers, 1st row is the 1st row in the body.

        WebElement row = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[1]"));
        System.out.println(row.getText());

        row = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[2]"));
        System.out.println(row.getText());

        row = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[3]"));
        System.out.println(row.getText());

        System.out.println("=======================");

        // get all the table row dynamically. We can do in 2 steps.
            //1.get the number rows
            // based on the number of rows iterate each row.

        List<WebElement> allRowsExcludingHeaders = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
        System.out.println("number of rows excluding headers: "+allRowsExcludingHeaders.size());

        for (int i = 1; i <= allRowsExcludingHeaders.size(); i++) {
             String xpath = "//table[@id='table1']//tbody/tr["+i+"]";
             WebElement singleRow = driver.findElement(By.xpath(xpath));
            System.out.println(singleRow.getText());

        }
    }


    @Test
    public void getAllCellsInRow(){
        List<WebElement> allCellsInOneRow = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[1]/td"));
        for (WebElement cell : allCellsInOneRow) {
            System.out.print(cell.getText()+", ");
        }
        System.out.println();

        System.out.println("number of cells in this row is: "+allCellsInOneRow.size());

    }


    @Test
    public void getSingleCellsByIndex(){
        WebElement singleCell = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[1]/td[1]"));
        System.out.println(singleCell.getText());

        singleCell = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[1]/td[4]"));
        System.out.println(singleCell.getText());
    }

    @Test

    public void printAllCellByIndex(){

        int rowNumber  = getNumberOfRows();
        //get number of rows
        int colNumber = getNumberofCols();
        //get number of columns


        //iterates each row in the table
        for(int i = 1; i<=rowNumber; i++){
            //iterates each cell in the row.
            for(int j = 1; j<=colNumber;j++){
                //i = index of tr (row)
                //j = index of rd (cell)

                String xpath = "//table[@id='table1']//tbody/tr["+i+"]/td["+j+"]";
                WebElement cell = driver.findElement(By.xpath(xpath));
                System.out.println(cell.getText());
            }
        }
    }

    private int getNumberofCols() {
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));

        return headers.size();
    }

    private  int getNumberOfRows(){
        List<WebElement> allRowsExcludingHeaders = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
        return allRowsExcludingHeaders.size();
    }


    @Test
    public void getSpecificCEllByIndex(){
        //get cell by given indexes
        int r=1;
        int c=1;
        String xpath="//table[@id='table1']/tbody/tr["+r+"]/td["+c+"]";
        WebElement cell=driver.findElement(By.xpath(xpath));
        System.out.println(cell.getText());
    }


    @Test
    public void getCellInRelationToAnotherCellInSameRow(){
        String name="Jason";
        String xpath="//table[@id='table1']//td[.='"+name+"']/../td[3]";

        String xpath2 = "//table[@id='table1']//td[.='Jason']/../../..";

        System.out.println(driver.findElement(By.xpath(xpath)).getText());
        System.out.println("================");
        System.out.println(driver.findElement(By.xpath(xpath2)).getText());



    }



}