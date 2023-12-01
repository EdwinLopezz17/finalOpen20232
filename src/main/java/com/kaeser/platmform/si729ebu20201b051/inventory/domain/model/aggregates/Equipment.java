package com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.aggregates;

import com.kaeser.platmform.si729ebu20201b051.inventory.api.resources.CreateEquipmentResource;
import com.kaeser.platmform.si729ebu20201b051.shared.domain.model.entities.AuditableModel;
import com.kaeser.platmform.si729ebu20201b051.shared.domain.model.valueobjects.EquipmentType;
import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.valueobjects.MaterialSerialNumber;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "equipments")
@NoArgsConstructor
public class Equipment extends AuditableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @Column(unique = true)
    private MaterialSerialNumber materialSerialNumber;

    @NotNull
    @NotBlank
    private String model;

    @NotNull
    private EquipmentType equipmentType;

    public Equipment(CreateEquipmentResource equipmentResource) {
        model = equipmentResource.getModel();
        materialSerialNumber = new MaterialSerialNumber();
        try {
            equipmentType = EquipmentType.valueOf(equipmentResource.getEquipmentType());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("The value of equipmentType is invalid.");
        }
    }
}
