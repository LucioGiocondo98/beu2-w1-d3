package entities;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToppingTest {

    @ParameterizedTest
    @CsvSource({
            "Mozzarella, 100, 0.50",
            "Prosciutto, 150, 0.80",
            "Funghi, 40, 0.60",
            "Olive, 70, 0.30"
    })
    void testToppingProperties(String name, int calories, double price) {
        Topping topping = new Topping(name, calories, price);

        assertEquals(name, topping.getName());
        assertEquals(calories, topping.getCalories());
        assertEquals(price, topping.getPrice(), 0.01);
    }
}
