package com.unicred.tickets.application;

import com.unicred.tickets.domain.ticket.Ticket;

public class UseCase {
    public Ticket execute() {
        return new Ticket();
    }
}