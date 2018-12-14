package food.pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FoodTest {

    private BaseFunc baseFunc = new BaseFunc();
    private final String HOME_PAGE = "rus.delfi.lv";

    @Test
    public void FoodTest() {

        baseFunc.goToUrl(HOME_PAGE);
        HomePage homePage = new HomePage(baseFunc);
        homePage.closeCookie();
        FoodPage foodPage = homePage.getItemByName("ЕДА");

        RecipePage recipePage = foodPage.clickOnRecipe();
        String chosenRecipe = recipePage.recipeName();

        List<String> ingredients = recipePage.recipeIngredients();
        IngredientPage ingredientPage = recipePage.getIngredientPage();

        for (int i = 1; i < ingredients.size(); i++) {
            baseFunc.goToUrl(ingredients.get(i));
            Assertions.assertTrue(ingredientPage.checkRecipeTitle(chosenRecipe));
        }

    }
}
