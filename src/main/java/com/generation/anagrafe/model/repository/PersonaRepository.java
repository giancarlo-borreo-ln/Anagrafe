package com.generation.anagrafe.model.repository;

import com.generation.anagrafe.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
