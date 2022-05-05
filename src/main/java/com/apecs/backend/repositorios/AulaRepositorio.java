package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Aula;

@Repository
public interface AulaRepositorio extends JpaRepository<Aula, Long>{

}
