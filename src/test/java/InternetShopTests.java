import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class InternetShopTests {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item--has-child')]/a");
    private final By MENU = By.xpath(".//div[contains(@class, 'submenu-lvl1--index')]");
    private final String SECTION = "Mēbeles";    //bivajet 4to iz za melkogo ekrana ne rabotajet

    @Test
    public void productPresenceInCartCheck() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://1a.lv");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));

        //Thread.sleep (millis:10000); we don't use this. NEVER,ostanavlivajet vipolnenije testa

        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));

        //find element
        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BTN);
        //click on this element
        acceptBtn.click();

        //Find all section
        //List<WebElement> menuItems = browser.findElements(MENU_ITEM); ona ne ispolzujetsja mozno delete peremenaja seraja
                                                                                    //peremenaja menuItems
        //Find necessary section ( Mebeles )

        WebElement menuBlock = browser.findElement(MENU);
        List<WebElement> items = menuBlock.findElements(MENU_ITEM);

                            //dvojnoj sle6// esli nado peresko4itj paru elementov , v lokatore

        boolean isSectionFound = false;        // peremenaja : na6li sekciju ili net?     srazu false tipo ne najdena
        for (WebElement we : items) {                                   // cikl dolzen pereubeditj nas
            if (we.getText().equals(SECTION)) {
                wait.until(ExpectedConditions.elementToBeClickable(we));
                isSectionFound = true;                      //esli na6ol to clicknet
                we.click();
                break;
            }
        }
        Assertions.assertTrue(isSectionFound, "Section not found!");    //ozidajem 4to budet True
                                                        // v kovi4kah sms esli ne najdot to pokazit v o6ibke
        }

    //Kak rabotajut cikli
       @Test
     public void workingWithLists() {
        List<String> names = new ArrayList<>(); //List vsegda vo mnozestvenom 4isle, pustoj spisok Arraylist
        names.add("Dmitry"); //0
        names.add("Laura");  //1
        names.add("Vitalijs"); //2
        names.add("Inna"); //3
        names.add("Anna"); //4

        //------------------------FOR----------------------------    // eto cikl ( oni nuzni dlja raboti so spiskomi)
        //from  //to   //step
        for (int i = 0; i < names.size(); i = i + 1) {

            System.out.println("The name number " + (i + 1) + " is: " + names.get(i));//Esli nuzen porjadkovij nomer to tolko FOR

        }
        //----------------------------FOREACH------------------------   // eto cikl dlja kazdogo elementa

       for (String name : names) {             // (v kakuju peremenuju lozim : spisok kotorij prohodim )
            System.out.println(name);

       }


        System.out.println(names.isEmpty());   //Vivodim rezultat v konsolj (posmotretj)
       System.out.println(names.size());
        System.out.println(names.get(2));   // 2 t.k imena s4itajem s 0 ( get t.k mi hotim vivesti imenno 2 ( vitalija)
        // eto esli mi rabotajem to4e4no

    }


    }
