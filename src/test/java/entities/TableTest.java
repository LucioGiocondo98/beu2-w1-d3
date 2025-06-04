package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TableTest {@Test
void testTableCreation() {
    Table table = new Table(5, 6, true, 2.5);

    assertEquals(5, table.getNumTable());
    assertEquals(6, table.getNumMaxCoperti());
    assertTrue(table.isFree());
    assertEquals(2.5, table.getCostoCoperto(), 0.01);
}

}
