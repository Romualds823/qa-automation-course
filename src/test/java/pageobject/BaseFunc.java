package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseFunc {                 // eto vzaimodejstvije s brauzerom( brauzernoje okno )
private WebDriver browser;
private WebDriverWait wait;

    public BaseFunc () {
        browser = new ChromeDriver();
        browser.manage().window().maximize();

        wait = new WebDriverWait(browser, Duration.ofSeconds(5));

    }

    public void openURL(String url) {                   //!perevora4ivajet bilo true  !true teperj false
                                                        // || eto ozna4ajet "libo" , a eto &&(enta)  ozna4ajet  "i"
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }


        browser.get(url);


    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

}
