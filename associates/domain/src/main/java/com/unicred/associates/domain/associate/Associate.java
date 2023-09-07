package com.unicred.associates.domain.associate;

import com.unicred.associates.domain.AggregateRoot;
import com.unicred.associates.domain.validation.ValidationHandler;

public class Associate extends AggregateRoot<AssociateID> {
    private String name;
    private String document;
    private PersonType personType;

    private Associate(
            final AssociateID anId,
            final String aName,
            final String aDocument,
            final PersonType aPersonType
    ) {
        super(anId);
        this.name = aName;
        this.document = aDocument;
        this.personType = aPersonType;
    }

    public static Associate newAssociate(
            final String name,
            final String document,
            final PersonType personType
    ) {
        return new Associate(
                AssociateID.unique(),
                name,
                document,
                personType
        );
    }

    @Override
    public void validate(final ValidationHandler handler) {
        new AssociateValidator(this, handler).validate();
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public PersonType getPersonType() {
        return personType;
    }
}
