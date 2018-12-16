package food.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FoodPage {
    BaseFunc baseFunc;

    private final By RECIPE_CONTAINER = By.xpath(".//div[contains(@class, 'col-content')]");
    private final By RECIPES = By.xpath(".//a");

    public FoodPage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public List<String> getRecipe() {
        List<WebElement> recipes = baseFunc.getElement(RECIPE_CONTAINER).findElements(RECIPES);
        List<String> recipesList = new ArrayList<String>();
        for (int i=0; i < recipes.size(); i++) {
            recipesList.add(recipes.get(i).getAttribute("href"));
        }

        return recipesList;
    }

    public RecipePage clickOnRecipe() {
        List<String> allRecipes = getRecipe();
        baseFunc.goToUrl(allRecipes.get(5));

        return new RecipePage(baseFunc);
    }

}
