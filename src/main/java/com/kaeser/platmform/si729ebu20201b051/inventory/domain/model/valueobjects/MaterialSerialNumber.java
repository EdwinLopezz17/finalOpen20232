package com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

import java.util.UUID;


@Embeddable
public record MaterialSerialNumber(UUID serialNumber) {

    public MaterialSerialNumber() {
        this(UUID.randomUUID());
    }

}
