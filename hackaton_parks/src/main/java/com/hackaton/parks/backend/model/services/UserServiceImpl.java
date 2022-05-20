package com.hackaton.parks.backend.model.services;

import com.hackaton.parks.backend.model.domains.User;
import com.hackaton.parks.backend.model.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private final UserRepository userRepository;


    @Override
    public User newUser(User user) {
        // user.setPassword(user.getPassword());
        return userRepository.save(user);
    }
}
