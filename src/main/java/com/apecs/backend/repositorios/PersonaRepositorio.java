package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long>{

}
