package com.kaeser.platmform.si729ebu20201b051.analytics.api.resource;

import com.kaeser.platmform.si729ebu20201b051.analytics.domain.models.aggregates.MeasurableIndicator;

import lombok.Data;

@Data
public class ResponseMeasurableIndicatorResource {

    private Long id;

    private String symbol;

    private String description;

    private Double thresholdMinimum;

    private Double thresholdMaximum;
    private String equipmentType;

    public ResponseMeasurableIndicatorResource(MeasurableIndicator measurableIndicator){
        id = measurableIndicator.getId();
        symbol = measurableIndicator.getSymbol();
        description = measurableIndicator.getDescription();
        thresholdMinimum = measurableIndicator.getThresholdMinimum();
        thresholdMaximum = measurableIndicator.getThresholdMaximum();
        equipmentType = measurableIndicator.getEquipmentType().toString();
    }
}
