package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.FormaPago;

@Repository
public interface FormaPagoRepositorio extends JpaRepository<FormaPago, Long>{

}
