package com.kaeser.platmform.si729ebu20201b051.inventory.infrastructure.persistence.jpa.repositories;

import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.aggregates.Equipment;
import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.valueobjects.MaterialSerialNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    Boolean existsByMaterialSerialNumber(MaterialSerialNumber serialNumber);
}
