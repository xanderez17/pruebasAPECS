package com.apecs.backend.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apecs.backend.modelo.Ticket;
import com.apecs.backend.repositorios.TicketRepositorio;

@RestController
@RequestMapping("/api/ticket")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class TicketControlador {

	@Autowired
	private TicketRepositorio ticketRepositorio;

	// Listar Tickets
	@GetMapping("/listarTickets")
	public List<Ticket> listarTickets() {
		return ticketRepositorio.findAll();
	}

	// Crear Ticket
	@PostMapping("/crearTicket")
	public Ticket crearTicket(@RequestBody Ticket ticket) {
		return ticketRepositorio.save(ticket);
	}
	
	/*
	// Actualizar Ticket
	@PutMapping("/actualizarTicket/{id}")
	public Ticket actualizarHorario(@RequestBody Ticket ticket, @PathVariable Long id) {
		return ticketRepositorio.save(ticket);
	}

	// Eliminar Ticket
	@DeleteMapping("/elminarTicket/{id}")
	public String eliminarHorario(@PathVariable Long id) {
		ticketRepositorio.deleteById(id);
		return "El ticket ha sido eliminado";
	}
	*/

}
