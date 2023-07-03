package com.example.TestCase;

import com.example.demo4.BaseClass;
import com.example.pages.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeFormsPageTest extends BaseClass {
    private PracticeFromsPage practiceFromsPage;
    private SoftAssert softAssert;
    public void setup(){
        practiceFromsPage= new PracticeFromsPage();
        softAssert = new SoftAssert();

    }
    public void set() throws InterruptedException {
        setup();
        HomePage homePage = new HomePage();
        homePage.clickOnForms();
        FormsPage  formsPage = new FormsPage();
        practiceFromsPage=formsPage.clickOnPracticeForm();

    }
    @Test
    public void verifyPracticeFormPage() throws InterruptedException {
        set();
        softAssert.assertTrue(practiceFromsPage.verifyPracticePage(),"Page is not displayed");
        softAssert.assertAll();

    }
    @Test
    public void fillForm() throws InterruptedException {
        set();
        practiceFromsPage.fillForm();


    }
   // @Test


}
