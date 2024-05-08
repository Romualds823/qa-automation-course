package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.HomePage;
import pageobject.pages.LoginPage;
import pageobject.pages.RegistrationPage;
import stepdefs.RegistrationStepDefs;



public class RegistrationTests {

    @Test
    public void registrationFormCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("1a.lv");

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.openLoginPage();

        LoginPage loginPage = new LoginPage(baseFunc);
        loginPage.openRegistrationPage();
        RegistrationPage registrationPage = new RegistrationPage(baseFunc);
        registrationPage.fillInRegistrationForm("Roma" , "Tester" ,"123@test.lv" ,"Qwerty123" , "Qwerty123");

    }

}
