package com.kaeser.platmform.si729ebu20201b051.analytics.api.rest;

import com.kaeser.platmform.si729ebu20201b051.analytics.api.resource.CreateMeasurableIndicator;
import com.kaeser.platmform.si729ebu20201b051.analytics.api.resource.ResponseMeasurableIndicatorResource;
import com.kaeser.platmform.si729ebu20201b051.analytics.domain.models.aggregates.MeasurableIndicator;
import com.kaeser.platmform.si729ebu20201b051.analytics.domain.service.MeasurableIndicatorService;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping(value = "api/v1/measurable-indicators", produces = "application/json")
@AllArgsConstructor
public class MeasurableIndicatorController {

    private final MeasurableIndicatorService measurableIndicatorService;

    @PostMapping
    public ResponseEntity<Object> add(@RequestBody CreateMeasurableIndicator createMeasurableIndicator) {
        MeasurableIndicator measurableIndicator = new MeasurableIndicator(createMeasurableIndicator);

        if (measurableIndicatorService.existsBySymbolAndEquipmentType(
                measurableIndicator.getSymbol(), measurableIndicator.getEquipmentType())) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("A MeasurableIndicator with the same symbol already exists for the given EquipmentType.");
        }

        if(measurableIndicator.getThresholdMaximum() < measurableIndicator.getThresholdMinimum()){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("thresholdMaximum must be greater than or equal to thresholdMinimum.");
        }

        measurableIndicatorService.create(measurableIndicator);

        ResponseMeasurableIndicatorResource responseResource = new ResponseMeasurableIndicatorResource(measurableIndicator);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseResource);
    }

}
