package com.hackaton.parks.backend.controllers;

import com.hackaton.parks.backend.model.domains.Park;
import com.hackaton.parks.backend.model.services.ParkService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class ParkController {

    @Autowired
    private final ParkService parkService;

    @PostMapping("/park/add")
    public ResponseEntity<Park> addPark(@RequestBody Park park){
        try{
            return new ResponseEntity<>(parkService.addPark(park), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/park/getAll")
    public ResponseEntity<List<Park>> getAllParks(){
        try{
            return new ResponseEntity<>(parkService.getAllParks(), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/park/{id}")
    public ResponseEntity<Park> getOneById(@PathVariable int id){
        try{
            return new ResponseEntity<>(parkService.getOneParkById(id), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/park/postalcode/{postalCode}")
    public ResponseEntity<List<Park>> getByPostalCode(@PathVariable String postalCode){
        try{
            return new ResponseEntity<>(parkService.getByPostalCode(postalCode), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/park/hood/{neighbourhood}")
    public ResponseEntity<List<Park>> getByNeighbourhood(@PathVariable String neighbourhood){
        try{
            return new ResponseEntity<>(parkService.getByNeighbourhood(neighbourhood), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
