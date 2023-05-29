package com.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage {
    @FindBy(css = "main-header")
    private WebElement webTableLogo;
    @FindBy (id = "addNewRecordButton")
    private WebElement addElement;
    @FindBy(id = "firstName")
    private WebElement firstNameField;
    @FindBy(id = "lastName")
    private WebElement lastNameField;
    @FindBy(id ="userEmail" )
    private WebElement email;
    @FindBy(id = "age")
    private WebElement ageField;
    @FindBy(id ="salary" )
    private WebElement salaryField;
    @FindBy(id = "department")
    private WebElement departmentField;
    @FindBy(id="submit")
    private WebElement submitBtn;




}
