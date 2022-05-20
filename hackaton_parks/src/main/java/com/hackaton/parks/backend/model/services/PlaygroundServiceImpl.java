package com.hackaton.parks.backend.model.services;

import com.hackaton.parks.backend.model.domains.Playground;
import com.hackaton.parks.backend.model.repositories.PlaygroundRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PlaygroundServiceImpl implements PlaygroundService{

    @Autowired
    private final PlaygroundRepository playgroundRepository;


    @Override
    public List<Playground> getAllPlayground() {
        return playgroundRepository.findAll();
    }

    @Override
    public Playground getPlaygroundById(int id) {
        Optional<Playground> optionalPlayground = playgroundRepository.findById(id);
        Playground playground = null;
        if(optionalPlayground.isPresent()) playground = optionalPlayground.get();
        return playground;
    }
}
