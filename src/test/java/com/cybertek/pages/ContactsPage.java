package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

//    // this only finds one email, it does nnot help in finding others. we cannot use this
//    @FindBy(xpath = "//*[contains(text(), ‘mbrackstone9@example.com') and @data-column-label='Email']")
//    WebElement email;


    public WebElement getContactEmail(String email){
        String xpath = "//*[contains(text(), '"+email+"') and @data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }


}