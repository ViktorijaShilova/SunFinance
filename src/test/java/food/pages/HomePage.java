package food.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    BaseFunc baseFunc;

    private final By COOKIE = By.xpath(".//a[@class = 'close cookie']");
    private final By NAME = By.xpath(".//span");
    private final By HEADER = By.id("quick-site-section-navigation-inner");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void closeCookie() {
        baseFunc.getElement(COOKIE).click();
    }

    public FoodPage getItemByName(String name) {
        List<WebElement> tabs = baseFunc.getElement(HEADER).findElements(NAME);
        for (WebElement we : tabs) {
            if (we.getText().equals(name)) {
                we.click();
                return new FoodPage(baseFunc);
            }
        }
        return null;
    }


}
