package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Curso;

@Repository
public interface CursoRepositorio extends JpaRepository<Curso, Long>{

}
