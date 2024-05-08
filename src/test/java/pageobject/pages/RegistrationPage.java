package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;
import stepdefs.RegistrationStepDefs;

public class RegistrationPage {
    private final By FIRST_NAME_INPUT = By.id("user_first_name");
    private final By LAST_NAME_INPUT = By.id("user_last_name");
    private final By EMAIL_INPUT = By.id("user_email");
    private final By PASSWORD_ADD = By.id("user_password");
    private final By PASSWORD_CHECK_ADD = By.id("user_password_confirmation");

    private BaseFunc baseFunc;


    public RegistrationPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }


    public void fillInRegistrationForm(String firstName, String lastName, String email,String password,String passwordConfirmation) {
        baseFunc.typeText(FIRST_NAME_INPUT, firstName);
        baseFunc.typeText(LAST_NAME_INPUT, lastName);
        baseFunc.typeText(EMAIL_INPUT, email);
        baseFunc.typeText(PASSWORD_ADD,password);
        baseFunc.typeText(PASSWORD_CHECK_ADD,passwordConfirmation);
    }
}
