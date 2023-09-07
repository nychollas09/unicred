package com.unicred.associates.domain.associate;

import com.unicred.associates.domain.exceptions.DomainException;
import com.unicred.associates.domain.validation.handler.ThrowsValidationHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssociateTest {

    @Test
    public void givenAValidParams_whenCallNewAssociate_thenInstantiateAAssociate() {
        final var expectedName = "any";
        final var expectedDocument = "any";
        final var expectedPersonType = PersonType.PF;

        final var actualAssociate = Associate.newAssociate(expectedName, expectedDocument, expectedPersonType);

        Assertions.assertNotNull(actualAssociate);
        Assertions.assertNotNull(actualAssociate.getId());
        Assertions.assertEquals(expectedName, actualAssociate.getName());
        Assertions.assertEquals(expectedDocument, actualAssociate.getDocument());
        Assertions.assertEquals(expectedPersonType, actualAssociate.getPersonType());
    }

    @Test
    public void givenAnInvalidNullName_whenCallNewAssociateAndValidate_thenShouldReceiveError() {
        final String expectedName = null;
        final var expectedDocument = "any";
        final var expectedPersonType = PersonType.PF;
        final var expectedErrorMessage = "'name' should not be null";
        final var expectedErrorCount = 1;

        final var actualAssociate = Associate.newAssociate(expectedName, expectedDocument, expectedPersonType);

        final var actualException = Assertions.assertThrows(
                DomainException.class,
                () -> actualAssociate.validate(new ThrowsValidationHandler())
        );

        Assertions.assertEquals(expectedErrorMessage, actualException.getErrors().get(0).message());
        Assertions.assertEquals(expectedErrorCount, actualException.getErrors().size());
    }
}
