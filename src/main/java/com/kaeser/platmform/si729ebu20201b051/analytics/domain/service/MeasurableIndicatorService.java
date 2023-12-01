package com.kaeser.platmform.si729ebu20201b051.analytics.domain.service;

import com.kaeser.platmform.si729ebu20201b051.analytics.domain.models.aggregates.MeasurableIndicator;
import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.aggregates.Equipment;
import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.valueobjects.MaterialSerialNumber;
import com.kaeser.platmform.si729ebu20201b051.shared.domain.model.valueobjects.EquipmentType;

import java.util.Optional;

public interface MeasurableIndicatorService {

    Optional<MeasurableIndicator> create(MeasurableIndicator measurableIndicator);

    Optional<MeasurableIndicator> findBySymbol( String symbol);

    Boolean existsBySymbolAndEquipmentType(String symbol, EquipmentType equipmentType);

}
