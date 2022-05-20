package com.hackaton.parks.backend.model.services;

import com.hackaton.parks.backend.model.domains.Park;
import com.hackaton.parks.backend.model.repositories.ParkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ParkServiceImpl implements ParkService{

    @Autowired
    private final ParkRepository parkRepository;


    @Override
    public Park addPark(Park park) {
        return parkRepository.save(park);
    }

    @Override
    public List<Park> getAllParks() {
        return parkRepository.findAll();
    }

    @Override
    public Park getOneParkById(int id) {
        Optional<Park> optionalPark = parkRepository.findById(id);
        Park park = null;
        if(optionalPark.isPresent()) park = optionalPark.get();
        return park;
    }

    @Override
    public List<Park> getByPostalCode(String postalCode) {
        List<Park> parkList = parkRepository.findByPostalCode(postalCode);
        if(parkList.isEmpty()) throw new NullPointerException();
        return parkList;
    }

    @Override
    public List<Park> getByNeighbourhood(String neighbourhood) {
        String fixedText = neighbourhood.replace("_", " ");
        List<Park> parkList = parkRepository.findByNeighbourhoodContaining(fixedText);
        if(parkList.isEmpty()) throw new NullPointerException();
        return parkList;
    }
}
