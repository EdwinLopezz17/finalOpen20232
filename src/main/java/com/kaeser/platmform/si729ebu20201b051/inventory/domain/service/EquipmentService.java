package com.kaeser.platmform.si729ebu20201b051.inventory.domain.service;

        import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.aggregates.Equipment;
        import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.valueobjects.MaterialSerialNumber;

        import java.util.Optional;

public interface EquipmentService {
    Optional<Equipment> create(Equipment equipment);

    Boolean existEquipmentBySerialNumber(MaterialSerialNumber serialNumber);

}
