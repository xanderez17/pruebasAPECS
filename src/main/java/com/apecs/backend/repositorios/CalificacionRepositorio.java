package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Calificacion;

@Repository
public interface CalificacionRepositorio extends JpaRepository<Calificacion, Long>{

}
