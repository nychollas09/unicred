package com.unicred.associates.domain.associate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssociateTest {

    @Test
    public void test(){
        final var associate = new Associate();

        Assertions.assertNotNull(associate);
    }
}
