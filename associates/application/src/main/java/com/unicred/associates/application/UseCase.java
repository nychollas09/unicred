package com.unicred.associates.application;

import com.unicred.associates.domain.associate.Associate;

public class UseCase {
    public Associate execute() {
        return new Associate();
    }
}