package com.generation.anagrafe.service;

import com.generation.anagrafe.model.Persona;

import java.util.List;

public interface ControllerHelper {
    List<Persona> findAll();

    Persona findById(Long id);

    Persona save(Persona persona);

    void deleteById(Long id);
}
