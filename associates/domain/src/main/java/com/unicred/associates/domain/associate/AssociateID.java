package com.unicred.associates.domain.associate;

import com.unicred.associates.domain.Identifier;

import java.util.Objects;
import java.util.UUID;

public class AssociateID extends Identifier {
    private final String value;

    private AssociateID(final String value) {
        this.value = Objects.requireNonNull(value, "'value' should not be null");
    }

    public static AssociateID unique() {
        return AssociateID.from(UUID.randomUUID().toString());
    }

    public static AssociateID from(final String anId) {
        return new AssociateID(anId);
    }

    public static AssociateID from(final UUID anId) {
        return new AssociateID(anId.toString().toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssociateID that = (AssociateID) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
