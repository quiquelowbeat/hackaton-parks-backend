package com.hackaton.parks.backend.model.repositories;

import com.hackaton.parks.backend.model.domains.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
}
