package food.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoodPage {
    BaseFunc baseFunc;

    private final By RECIPES = By.xpath(".//h1[contains(@class, 'headline-title')]");
    private final By ALL_ELEMENTS = By.xpath(".//div[@class = 'col-xs-6 headline']");

    public FoodPage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public RecipePage getRecipe(String name) {
        List<WebElement> recipes = baseFunc.getElements(ALL_ELEMENTS);
        for (WebElement recipe : recipes) {
            if (recipe.findElement(RECIPES).getText().equals(name)) {
                recipe.click();
                return new RecipePage(baseFunc);
            }
        }
        return null;
    }

}
