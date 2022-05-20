package com.hackaton.parks.backend.model.repositories;

import com.hackaton.parks.backend.model.domains.Park;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkRepository extends MongoRepository<Park, Integer> {
    List<Park> findByPostalCode(String postalCode);
    @Query("{'neighbourhood':{'$regex':'?0','$options':'i'}}")
    List<Park> findByNeighbourhoodContaining(String neighbourhood);
}
