package com.omerfarukozcan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    void testSimpleCheck() {
        assertTrue(5 > 1, "5 büyüktür 1'den");
    }
}
