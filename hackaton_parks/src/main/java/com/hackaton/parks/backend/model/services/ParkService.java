package com.hackaton.parks.backend.model.services;

import com.hackaton.parks.backend.model.domains.Park;

import java.util.List;

public interface ParkService {
    Park addPark(Park park);
    List<Park> getAllParks();
    Park getOneParkById(int id);
    List<Park> getByPostalCode(String postalCode);
    List<Park> getByNeighbourhood(String neighbourhood);
}
