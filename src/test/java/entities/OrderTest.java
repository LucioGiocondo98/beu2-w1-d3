package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    void testOrderTotalCalculation() {
        Table table = new Table(1, 4, true, 2.0);
        Order order = new Order(2, table);
        order.addItem(new Drink("Water", 0, 1.0));
        order.addItem(new Topping("Cheese", 100, 0.8));

        double expected = 1.0 + 0.8 + (2 * 2.0); // prezzo item + coperti
        assertEquals(expected, order.getTotal(), 0.01);
    }
}
