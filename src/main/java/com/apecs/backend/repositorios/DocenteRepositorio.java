package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Docente;

@Repository
public interface DocenteRepositorio extends JpaRepository<Docente, Long>{

}
