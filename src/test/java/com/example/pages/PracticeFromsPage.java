package com.example.pages;

import com.example.demo4.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

// page_url = about:blank

import java.util.Random;

public class PracticeFromsPage extends BaseClass {
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

    @FindBy(css = "[id='subjectsWrapper']>div[class='col-md-9 col-sm-12']>div>div")
    private WebElement subject;


    public PracticeFromsPage() {
        PageFactory.initElements(driver, this);
    }
    public boolean verifyPracticePage() throws InterruptedException {
        Thread.sleep(3000);
        return headerFormPage.isDisplayed();
    }
    private List<WebElement> getElements(){
        return genders;
    }

    public void fillForm() throws InterruptedException {
        firstname.sendKeys("bertina");
        lastname.sendKeys("ayuure");
        email.sendKeys("be@gmail.com");

        List<WebElement> elements = getElements();

        //Generate random numbers
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        Thread.sleep(10000);
        genders.get(randomNumber).click();

        number.sendKeys("0234567890");

        dateOfBirth.click();
        Thread.sleep(3000);
        month.click();
        Thread.sleep(3000);
        Select select = new Select(month);

        randomNumber = random.nextInt(12);
        Thread.sleep(13000);
        select.selectByIndex(randomNumber);
        Thread.sleep(3000);

         select= new Select(year);
         select.selectByVisibleText("2000");
         Thread.sleep(13000);
         day.click();
         Thread.sleep(3000);

         subject.click();
         Thread.sleep(3000);
         subject.sendKeys("Science");
         Thread.sleep(3000);
//       subject.sendKeys(Keys.ARROW_DOWN);
         subject.sendKeys(Keys.ENTER);








    }

}