package com.generation.anagrafe.controller;

import com.generation.anagrafe.model.Persona;
import com.generation.anagrafe.service.ControllerHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonaController {
    @Autowired
    ControllerHelper controllerHelper;

    @GetMapping
    public List<Persona> findAll(){
        return controllerHelper.findAll();
    }

    @GetMapping("/{id}")
    public Persona findById(@PathVariable Long id){
        return controllerHelper.findById(id);
    }

    @PostMapping
    public Persona createPersona(@RequestBody Persona persona){
        return controllerHelper.save(persona);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        controllerHelper.deleteById(id);
    }

}
