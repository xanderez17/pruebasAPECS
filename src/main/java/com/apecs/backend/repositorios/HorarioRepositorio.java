package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Horarios;

@Repository
public interface HorarioRepositorio extends JpaRepository<Horarios, Long>{

}
