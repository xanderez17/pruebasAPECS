package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Alumno;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, Long>{

}
