package entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void testGetCalories() {
        Topping cheese = new Topping("Cheese", 100, 1.0);
        Topping ham = new Topping("Ham", 50, 0.5);
        Pizza pizza = new Pizza("Test Pizza", Arrays.asList(cheese, ham), false);

        int expectedCalories = 700 + 100 + 50;
        assertEquals(expectedCalories, pizza.getCalories());
    }
    @Test
    void testToString() {
        Topping mozzarella = new Topping("Mozzarella", 90, 1.0);
        Topping tomato = new Topping("Pomodoro", 20, 0.5);
        Pizza pizza = new Pizza("Margherita", Arrays.asList(mozzarella, tomato), true);

        String result = pizza.toString();

        assertTrue(result.contains("Margherita"));
        assertTrue(result.contains("Mozzarella"));
        assertTrue(result.contains("Pomodoro"));
        assertTrue(result.contains("Base pizza: 700 Kcal"));
    }

}

