package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Representante;

@Repository
public interface RepresentanteRepositorio extends JpaRepository<Representante, Long>{

}
