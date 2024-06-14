package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.bidi.log.Log;
import pageobject.BaseFunc;
import pageobject.RegistrationTests;
import pageobject.pages.HomePage;
import pageobject.pages.LoginPage;
import pageobject.pages.RegistrationPage;

public class RegistrationStepDefs {
    private BaseFunc baseFunc;
    private HomePage homePage;
    private LoginPage loginPage;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private RegistrationPage registrationPage ;



    @Given("user name: {string}")
    public void setUserName(String firstName)   {
        this.firstName = firstName;
    }
    @Given("user last name: {string}")
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    @Given("user email: {string}")
    public void setEmail(String email)    {
        this.email = email;

    }
    @Given("new password is {string}")
    public void setPassword(String password)    {
        this.password = password;
    }
    @When("we open browser window")
    public void openBrowserWindow(){
        baseFunc = new BaseFunc();

    }
    @When("we open home page")
    public void openHomePage() {
        baseFunc.openURL("1a.lv");
        homePage = new HomePage(baseFunc);
    }

    @When("we accept cookies")
    public void acceptCookies() {
        homePage.acceptCookies();
    }

    @When("we are pressing Registration - Login button")
    public void openLoginPage() {
        homePage.openLoginPage();
        loginPage = new LoginPage(baseFunc);
    }
    @When("we are opening registration form")
    public void openRegistrationPage()  {
        loginPage.openRegistrationPage();
    }

    @When("we are filling in registration form")
    public void fillInRegistrationForm ()   {
        registrationPage = new RegistrationPage(baseFunc);
        registrationPage.fillInRegistrationForm("Roma","Tester","123@test.lv","Qwerty123","Qwerty123");









    }



}
