package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.HomePage;

public class InternetShopPagesTest {
@Test
    public void testOnPages()  {

        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("1a.lv");

    HomePage homePage = new HomePage(baseFunc);         //v kakom page mi rabotajem( ukazivajem emu )
    homePage.acceptCookies();
   // homePage.selectMenuItem("Mēbeles");


    }

}
