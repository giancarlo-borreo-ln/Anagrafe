package com.generation.anagrafe.service;

import com.generation.anagrafe.model.Persona;
import com.generation.anagrafe.model.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControllerHelperImpl implements ControllerHelper {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }
    @Override
    public Persona findById(Long id) {
        return personaRepository.findById(id).get();
    }
    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }
    @Override
    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }

}
