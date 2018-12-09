package food.pages;

import org.openqa.selenium.By;

public class IngredientPage {
    BaseFunc baseFunc;
    private final By INGR_RECIPES = By.xpath(".//h1[@class = 'headline-title']");

    public IngredientPage (BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
}
