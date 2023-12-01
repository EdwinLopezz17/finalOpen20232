package com.kaeser.platmform.si729ebu20201b051.inventory.api.rest;

import com.kaeser.platmform.si729ebu20201b051.inventory.api.resources.CreateEquipmentResource;
import com.kaeser.platmform.si729ebu20201b051.inventory.api.resources.ResponseEquipmentResource;
import com.kaeser.platmform.si729ebu20201b051.inventory.domain.model.aggregates.Equipment;
import com.kaeser.platmform.si729ebu20201b051.inventory.domain.service.EquipmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping(value = "api/v1/equipments", produces = "application/json")
@AllArgsConstructor
public class EquipmentController {

    private final EquipmentService equipmentService;

    @PostMapping
    public ResponseEntity<ResponseEquipmentResource> addEquipment(
            @RequestBody CreateEquipmentResource createEquipmentResource){

        Equipment newEquipment = new Equipment(createEquipmentResource);

        equipmentService.create(newEquipment);

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseEquipmentResource(newEquipment));

    }

}
