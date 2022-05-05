package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Asistencia;

@Repository
public interface AsistenciaRepositorio extends JpaRepository<Asistencia, Long>{

}
