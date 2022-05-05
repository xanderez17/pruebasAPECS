package com.apecs.backend.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apecs.backend.modelo.Calificacion;
import com.apecs.backend.repositorios.CalificacionRepositorio;

@RestController
@RequestMapping("/api/calificaciones")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class CalificacionControlador {

	@Autowired
	private CalificacionRepositorio calificacionRepositorio;

	// Listar Calificacion
	@GetMapping("/listarCalificacion")
	public List<Calificacion> listarHorarios() {
		return calificacionRepositorio.findAll();
	}

	// Crear Calificacion
	@PostMapping("/crearCalificacion")
	public Calificacion crearHorario(@RequestBody Calificacion calificacion) {
		return calificacionRepositorio.save(calificacion);
	}

	// Actualizar Calificacion
	@PutMapping("/actualizarCalificacion/{id}")
	public Calificacion actualizarHorario(@RequestBody Calificacion calificacion, @PathVariable Long id) {
		return calificacionRepositorio.save(calificacion);
	}

	// Eliminar Calificacion
	@DeleteMapping("/elminarCalificacion/{id}")
	public String eliminarHorario(@PathVariable Long id) {
		calificacionRepositorio.deleteById(id);
		return "La horario ha sido eliminado";
	}

}
