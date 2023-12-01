package com.kaeser.platmform.si729ebu20201b051.analytics.infrastructure.persistence.jpa.repositories;

import com.kaeser.platmform.si729ebu20201b051.analytics.domain.models.aggregates.MeasurableIndicator;
import com.kaeser.platmform.si729ebu20201b051.shared.domain.model.valueobjects.EquipmentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurableIndicatorRepository extends JpaRepository<MeasurableIndicator, Long> {
    MeasurableIndicator findBySymbol(String symbol);

    Boolean existsBySymbolAndEquipmentType(String symbol, EquipmentType equipmentType);

}
