package com.apecs.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apecs.backend.modelo.Ticket;

@Repository
public interface TicketRepositorio extends JpaRepository<Ticket, Long>{

}
