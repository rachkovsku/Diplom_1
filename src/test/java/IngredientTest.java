import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class IngredientTest {

    @Test
    @Parameters({
            "SAUCE, ketchup, 10.5",
            "FILLING, lettuce, 5.0",
            "SAUCE, chili sauce, 3",
            "FILLING, cutlet, 100"
    })
    public void testIngredientType(IngredientType type, String name, float price) {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals(type, ingredient.getType());
    }
    @Test
    @Parameters({
            "SAUCE, ketchup, 10.5",
            "FILLING, lettuce, 5.0",
            "SAUCE, chili sauce, 3",
            "FILLING, cutlet, 100"
    })
    public void testIngredientName(IngredientType type, String name, float price) {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals(name, ingredient.getName());
}
    @Test
    @Parameters({
            "SAUCE, ketchup, 10.5",
            "FILLING, lettuce, 5.0",
            "SAUCE, chili sauce, 3",
            "FILLING, cutlet, 100"
    })
    public void testIngredientPrice(IngredientType type, String name, float price) {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals(price, ingredient.getPrice(), 0.01);

    }
}