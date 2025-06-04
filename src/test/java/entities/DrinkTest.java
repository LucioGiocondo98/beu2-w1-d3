package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrinkTest {
    @Test
    void testGetCalories() {
        Drink cola = new Drink("Coca-Cola", 1, 150);

        assertEquals(150, cola.getCalories());
    }

    @Test
    void testGetName() {
        Drink water = new Drink("Acqua", 1, 0);

        assertEquals("Acqua", water.getName());
    }

}
