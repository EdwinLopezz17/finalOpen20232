package com.kaeser.platmform.si729ebu20201b051.inventory.shared.services.implementation;

import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.aggregates.Equipment;
import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.valueobjects.MaterialSerialNumber;
import com.kaeser.platmform.si729ebu20201b051.inventory.domain.service.EquipmentService;
import com.kaeser.platmform.si729ebu20201b051.inventory.infrastructure.persistence.jpa.repositories.EquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EquipmentServiceImpl implements EquipmentService {

    private final EquipmentRepository equipmentRepository;
    @Override
    public Optional<Equipment> create(Equipment equipment) {

        return Optional.of(equipmentRepository.save(equipment));
    }

    @Override
    public Boolean existEquipmentBySerialNumber(MaterialSerialNumber serialNumber) {
        return equipmentRepository.existsByMaterialSerialNumber(serialNumber);
    }
}
