package com.unicred.tickets.domain.ticket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketTest {

    @Test
    public void test(){
        final var associate = new Ticket();

        Assertions.assertNotNull(associate);
    }
}
