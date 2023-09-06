package com.unicred.tickets.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {
    @Test
    public void test() {
        final var sut = new UseCase();
        Assertions.assertNotNull(sut.execute());
    }
}
