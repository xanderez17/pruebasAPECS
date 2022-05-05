package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Contrato;

@Repository
public interface ContratoRepositorio extends JpaRepository<Contrato, Long>{

}
