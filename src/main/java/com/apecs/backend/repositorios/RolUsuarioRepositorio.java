package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.RolUsuario;

@Repository
public interface RolUsuarioRepositorio  extends JpaRepository<RolUsuario, Long>{
}
