package com.hackaton.parks.backend.controllers;

import com.hackaton.parks.backend.model.domains.Playground;
import com.hackaton.parks.backend.model.services.PlaygroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class PlaygroundController {

    @Autowired
    private final PlaygroundService playgroundService;

    @GetMapping("/playground/getAll")
    public ResponseEntity<List<Playground>> getAllPlayground(){
        try{
            return new ResponseEntity<>(playgroundService.getAllPlayground(), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/playground/getOne/{id}")
    public ResponseEntity<Playground> getOneById(@PathVariable int id){
        try{
            return new ResponseEntity<>(playgroundService.getPlaygroundById(id), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


}
