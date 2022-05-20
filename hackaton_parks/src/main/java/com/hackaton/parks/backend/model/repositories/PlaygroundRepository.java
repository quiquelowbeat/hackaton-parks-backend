package com.hackaton.parks.backend.model.repositories;

import com.hackaton.parks.backend.model.domains.Playground;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaygroundRepository extends MongoRepository<Playground, Integer> {
}
