package food.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RecipePage {
    BaseFunc baseFunc;

    private final By INGREDIENTS = By.xpath(".//a[@itemprop = 'recipeIngredient']");


    public RecipePage (BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public IngredientPage recipeIngredients(String name) {
        List<WebElement> ingredients = baseFunc.getElements(INGREDIENTS);
        List<String> ingredient_list = new ArrayList<String>();

        for (int i = 0; i < ingredients.size(); i++) {
            ingredient_list.add(ingredients.get(i).getAttribute("href"));
        }


        }
    }

