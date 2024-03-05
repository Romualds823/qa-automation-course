package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

public class SubcategoriesPage {
    private final By SUBCATEGORY_NAME = By.xpath(".//span[@class='cat-title']");
    private final By SUBCATEGORY_PAGE_TITLE = By.tagName("h1");
    private BaseFunc baseFunc;


    public SubcategoriesPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }


    public void selectSubcategory(String subcategoryName) {
        //TODO HW: ADD flag here and assertion after the loop
        for (WebElement we : baseFunc.findElements(SUBCATEGORY_NAME)) {
            if (we.getText().equals(subcategoryName)) {
                baseFunc.scrollToElement(we);
                baseFunc.hardClick(we);
                break;
            }
        }
        baseFunc.waitForText(SUBCATEGORY_PAGE_TITLE,subcategoryName);

    }


}
