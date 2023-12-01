package com.kaeser.platmform.si729ebu20201b051.analytics.api.resource;


import lombok.Data;

@Data
public class CreateMeasurableIndicator {

    private String symbol;
    private String description;
    private Double thresholdMinimum;
    private Double thresholdMaximum;
    private String equipmentType;
}
