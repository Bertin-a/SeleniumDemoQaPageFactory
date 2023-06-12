package com.example.pages;

import com.example.demo4.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
//    ElementPage elementpage= new ElementPage();
//    CheckBoxPage CheckBoxPage= new CheckBoxPage();


    @FindBy(css = "img[src='/images/Toolsqa.jpg']")
    private WebElement logo;
    @FindBy(css = "body > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
    private WebElement elements;
    @FindBy (css = "body > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2)")
    private WebElement checkBox;


    public HomePage(){
      PageFactory.initElements(driver, this);
    }

    public boolean verifyHomePage() throws InterruptedException {
        Thread.sleep(4000);
        logo.isDisplayed();
        return true;

    }
    public ElementPage ClickOnElement() throws InterruptedException {
        Thread.sleep(4000);
        elements.click();
        return new ElementPage();

    }
//    public CheckBoxPage clickOnCheckBox(){
//        checkBox.click();
//        return new CheckBoxPage();
//    }

}
