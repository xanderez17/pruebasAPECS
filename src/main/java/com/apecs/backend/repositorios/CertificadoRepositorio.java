package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Certificado;

@Repository
public interface CertificadoRepositorio extends JpaRepository<Certificado, Long>{

}
