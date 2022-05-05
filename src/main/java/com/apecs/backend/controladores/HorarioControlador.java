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

import com.apecs.backend.modelo.Horarios;
import com.apecs.backend.repositorios.HorarioRepositorio;

@RestController
@RequestMapping("/api/horarios")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class HorarioControlador {

	@Autowired
	private HorarioRepositorio horarioRepositorio;

	// Listar Horarios
	@GetMapping("/listarHorarios")
	public List<Horarios> listarHorarios() {
		return horarioRepositorio.findAll();
	}

	// Crear Horario
	@PostMapping("/crearHorario")
	public Horarios crearHorario(@RequestBody Horarios horario) {
		return horarioRepositorio.save(horario);
	}

	// Actualizar Horario
	@PutMapping("/actualizarHorario/{id}")
	public Horarios actualizarHorario(@RequestBody Horarios horario, @PathVariable Long id) {
		return horarioRepositorio.save(horario);
	}

	// Eliminar Horario
	@DeleteMapping("/elminarHorario/{id}")
	public String eliminarHorario(@PathVariable Long id) {
		horarioRepositorio.deleteById(id);
		return "La horario ha sido eliminado";
	}

}
