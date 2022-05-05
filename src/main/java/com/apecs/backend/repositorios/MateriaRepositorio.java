package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Materia;

@Repository
public interface MateriaRepositorio extends JpaRepository<Materia, Long>{

}
