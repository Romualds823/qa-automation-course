package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class LoginPage  {
    private final By REGISTRATION_LINK = By.xpath(".//p[@class = 'users-session-form__signup']/a");
    private BaseFunc baseFunc;

    public LoginPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public RegistrationPage openRegistrationPage()  {
        baseFunc.click(REGISTRATION_LINK);
        return new RegistrationPage(baseFunc);
    }

}
