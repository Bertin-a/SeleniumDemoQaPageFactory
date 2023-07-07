package com.example.pages;

import com.example.demo4.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

// page_url = about:blank

import java.util.Scanner;

public class PracticeFormsPage extends BaseClass {
    Scanner input = new Scanner(System.in);
    @FindBy(css = "div[class='practice-form-wrapper'] h5")
    private WebElement headerFormPage;
    @FindBy(id = "firstName")
    private WebElement firstname;
    @FindBy(id = "lastName")
    private WebElement lastname;
    @FindBy(id = "userEmail")
    private WebElement email;
   @FindAll({
           @FindBy(css = "label[for='gender-radio-1']"),
           @FindBy(css = "label[for='gender-radio-2']"),
           @FindBy(css = "label[for='gender-radio-3']")
   })
   private List<WebElement> genders;
    @FindBy(id = "userNumber")
    private WebElement number;
    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirth;
    @FindBy(className = "react-datepicker__month-select")
    private WebElement month;
    @FindBy(className = "react-datepicker__year-select")
    private WebElement year;

    @FindBy(className = "react-datepicker__day--001")
    private WebElement day;

    @FindBy(id = "subjectsInput")
    private WebElement subject;

    @FindAll({
            @FindBy(css="label[for='hobbies-checkbox-1']"),
            @FindBy(css="label[for='hobbies-checkbox-2']"),
            @FindBy(css="label[for='hobbies-checkbox-3']")
    })
    private List<WebElement> hobbies;
    @FindBy(id = "uploadPicture")
    private WebElement chooseFile;
    @FindBy(id = "currentAddress")
    private WebElement currentAddress;

    @FindBy(id = "react-select-3-input")
    private WebElement dropDownArrow;
    @FindAll({
            @FindBy(id = "react-select-3-option-0"),
            @FindBy(id="react-select-3-option-1"),
            @FindBy(id = "react-select-3-option-2"),
            @FindBy(id = "react-select-3-option-3")
    })
    private List<WebElement> states;


    public PracticeFormsPage() {
        PageFactory.initElements(driver, this);
    }
    public boolean verifyPracticePage() throws InterruptedException {
        Thread.sleep(3000);
        return headerFormPage.isDisplayed();
    }



    public void fillForm() throws InterruptedException {
        firstname.sendKeys("bertina");
        lastname.sendKeys("ayuure");
        email.sendKeys("be@gmail.com");



        //Generate random numbers
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        Thread.sleep(3000);
        genders.get(randomNumber).click();

        number.sendKeys("0234567890");

        dateOfBirth.click();
        Thread.sleep(3000);
        month.click();
        Thread.sleep(3000);
        Select select = new Select(month);

        randomNumber = random.nextInt(12);
        Thread.sleep(3000);
        select.selectByIndex(randomNumber);
        Thread.sleep(3000);

         select= new Select(year);
         select.selectByVisibleText("2000");
         Thread.sleep(3000);
         day.click();
         Thread.sleep(3000);

         subject.sendKeys("Science");
         Thread.sleep(3000);
//       subject.sendKeys(Keys.ARROW_DOWN);
         subject.sendKeys(Keys.ENTER);

         Thread.sleep(3000);
         randomNumber = random.nextInt(3);
         Thread.sleep(3000);
         hobbies.get(randomNumber).click();



         uploadImage(driver);
         currentAddress.sendKeys("Anaji");

        JavascriptExecutor js = (JavascriptExecutor) driver;

           js.executeScript("arguments[0].click()",dropDownArrow);



//         dropDownArrow.click();
         Thread.sleep(3000);
//
//        //randomNumber = random.nextInt(2);
//        js.executeScript("arguments[0].click()",states.get(1));

    }

    //upload image from machine with a specified file path
    private void uploadImage(WebDriver driver){

        System.out.println("Enter the path to the image file: ");
        //String imagePath = input.nextLine();

        chooseFile.sendKeys(input.nextLine());
        input.close();
    }



}