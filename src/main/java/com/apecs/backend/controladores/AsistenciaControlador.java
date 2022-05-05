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

import com.apecs.backend.modelo.Asistencia;
import com.apecs.backend.repositorios.AsistenciaRepositorio;

@RestController
@RequestMapping("/api/asistencia")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class AsistenciaControlador {

	@Autowired
	private AsistenciaRepositorio asistenciaRepositorio;

	// Listar Asistencia
	@GetMapping("/listarAsistencia")
	public List<Asistencia> listarAsistencia() {
		return asistenciaRepositorio.findAll();
	}

	// Crear Asistencia
	@PostMapping("/crearAsistencia")
	public Asistencia crearAsistencia(@RequestBody Asistencia asistencia) {
		return asistenciaRepositorio.save(asistencia);
	}

	// Actualizar Asistencia
	@PutMapping("/actualizarAsistencia/{id}")
	public Asistencia actualizarAsistencia(@RequestBody Asistencia asistencia, @PathVariable Long id) {
		return asistenciaRepositorio.save(asistencia);
	}

	// Eliminar Asistencia
	@DeleteMapping("/elminarAsistencia/{id}")
	public String eliminarAsistencia(@PathVariable Long id) {
		asistenciaRepositorio.deleteById(id);
		return "La asistencia ha sido eliminada";
	}

}
