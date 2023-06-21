package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = about:blank
public class PracticeFromsPage {

    public PracticeFromsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}