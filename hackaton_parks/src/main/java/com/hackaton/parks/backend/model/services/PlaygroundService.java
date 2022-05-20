package com.hackaton.parks.backend.model.services;

import com.hackaton.parks.backend.model.domains.Playground;

import java.util.List;

public interface PlaygroundService {
    List<Playground> getAllPlayground();
    Playground getPlaygroundById(int id);
}
