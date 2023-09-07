package com.unicred.associates.domain.validation;

import java.util.List;

public interface ValidationHandler {
    ValidationHandler append(Error anError);
    ValidationHandler append(ValidationHandler anHandler);
    ValidationHandler validate(Validation aValidation);

    List<Error> getErrors();

    default boolean hasError(){
        return this.getErrors() != null && !this.getErrors().isEmpty();
    }

    public interface Validation {
        void validate();
    }
}
