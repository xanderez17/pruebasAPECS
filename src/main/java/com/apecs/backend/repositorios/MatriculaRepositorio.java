package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Matricula;

@Repository
public interface MatriculaRepositorio extends JpaRepository<Matricula, Long>{

}
