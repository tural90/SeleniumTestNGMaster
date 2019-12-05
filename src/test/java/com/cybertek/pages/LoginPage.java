package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name="prependedInput")
    public WebElement userName;


    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement submit;

    public void login(String userNameStr, String passwordStr) {
<<<<<<< HEAD
=======
        userName.sendKeys(asfasfd);
        password.sendKeys(asdf);
>>>>>>> 7959975bd24be92c82628b07f70bbca9acd1e479
        submit.click();
    }


}
