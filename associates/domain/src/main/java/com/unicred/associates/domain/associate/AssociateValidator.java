package com.unicred.associates.domain.associate;

import com.unicred.associates.domain.validation.Error;
import com.unicred.associates.domain.validation.ValidationHandler;
import com.unicred.associates.domain.validation.Validator;

public class AssociateValidator extends Validator {
    private final Associate associate;

    public AssociateValidator(
            final Associate associate,
            final ValidationHandler handler
    ) {
        super(handler);
        this.associate = associate;
    }

    @Override
    public void validate() {
        this.checkNameConstraints();
    }

    private void checkNameConstraints() {
        final var name = this.associate.getName();

        if (name == null) {
            this.validationHandler().append(
                    new Error("'name' should not be null")
            );
        }
    }
}
