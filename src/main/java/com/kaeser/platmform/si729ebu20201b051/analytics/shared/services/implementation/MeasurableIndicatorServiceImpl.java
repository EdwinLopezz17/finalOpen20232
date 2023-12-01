package com.kaeser.platmform.si729ebu20201b051.analytics.shared.services.implementation;

import com.kaeser.platmform.si729ebu20201b051.analytics.domain.models.aggregates.MeasurableIndicator;
import com.kaeser.platmform.si729ebu20201b051.analytics.domain.service.MeasurableIndicatorService;
import com.kaeser.platmform.si729ebu20201b051.analytics.infrastructure.persistence.jpa.repositories.MeasurableIndicatorRepository;
import com.kaeser.platmform.si729ebu20201b051.shared.domain.model.valueobjects.EquipmentType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class MeasurableIndicatorServiceImpl implements MeasurableIndicatorService {

    private final MeasurableIndicatorRepository measurableIndicatorRepository;
    @Override
    public Optional<MeasurableIndicator> create(MeasurableIndicator measurableIndicator) {
        measurableIndicatorRepository.save(measurableIndicator);
        return Optional.of(measurableIndicator);
    }

    @Override
    public Optional<MeasurableIndicator> findBySymbol(String symbol) {
        return Optional.ofNullable(measurableIndicatorRepository.findBySymbol(symbol));
    }

    @Override
    public Boolean existsBySymbolAndEquipmentType(String symbol, EquipmentType equipmentType) {
        return measurableIndicatorRepository.existsBySymbolAndEquipmentType(symbol, equipmentType);
    }
}
