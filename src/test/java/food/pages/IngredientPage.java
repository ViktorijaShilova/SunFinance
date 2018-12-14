package food.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IngredientPage {
    BaseFunc baseFunc;

    private final By INGR_RECIPES = By.xpath(".//h1[contains(@class, 'headline-title')]");

    public IngredientPage (BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public boolean checkRecipeTitle(String name) {
        List<WebElement> allRecipeTitle = baseFunc.getElements(INGR_RECIPES);

        for (WebElement title : allRecipeTitle) {
            String recipeTitle = title.getText();

            if (recipeTitle.contains(name)) {
                System.out.println("Recipe is on page!");

                return true;
            }
        }

        return false;
    }
}
