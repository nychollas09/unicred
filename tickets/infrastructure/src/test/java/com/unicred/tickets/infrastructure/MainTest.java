package com.unicred.tickets.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        final var sut = new Main();
        Assertions.assertNotNull(sut);

        Main.main(new String[]{});
    }
}
