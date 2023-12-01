package com.kaeser.platmform.si729ebu20201b051.inventory.api.resources;

import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.aggregates.Equipment;

import lombok.Data;

@Data
public class ResponseEquipmentResource {
    private Long id;
    private String materialSerialNumber;
    private String model;
    private String equipmentType;

    public ResponseEquipmentResource(Equipment equipment){
        id = equipment.getId();
        materialSerialNumber = equipment.getMaterialSerialNumber().toString();
        model = equipment.getModel();
        equipmentType = equipment.getEquipmentType().toString();
    }
}
