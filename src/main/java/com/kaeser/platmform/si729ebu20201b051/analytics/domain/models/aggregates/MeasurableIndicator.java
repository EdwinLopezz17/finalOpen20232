package com.kaeser.platmform.si729ebu20201b051.analytics.domain.models.aggregates;

import com.kaeser.platmform.si729ebu20201b051.analytics.api.resource.CreateMeasurableIndicator;
import com.kaeser.platmform.si729ebu20201b051.shared.domain.model.valueobjects.EquipmentType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class MeasurableIndicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String symbol;

    private String description;

    @NotNull
    private Double thresholdMinimum;

    @NotNull
    private Double thresholdMaximum;

    @NotNull
    private EquipmentType equipmentType;

    public MeasurableIndicator(CreateMeasurableIndicator createMeasurableIndicator){
        symbol = createMeasurableIndicator.getSymbol();
        description = createMeasurableIndicator.getDescription();
        thresholdMinimum = createMeasurableIndicator.getThresholdMinimum();
        thresholdMaximum = createMeasurableIndicator.getThresholdMaximum();

        try {
            equipmentType = EquipmentType.valueOf(createMeasurableIndicator.getEquipmentType());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("The value of equipmentType is invalid.");
        }

    }

}
