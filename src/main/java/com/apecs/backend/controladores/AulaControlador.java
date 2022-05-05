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

import com.apecs.backend.modelo.Aula;
import com.apecs.backend.repositorios.AulaRepositorio;

@RestController
@RequestMapping("/api/aula")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class AulaControlador {

	@Autowired
	private AulaRepositorio aulaRepositorio;

	// Listar Aulas
	@GetMapping("/listarHorarios")
	public List<Aula> listarAulas() {
		return aulaRepositorio.findAll();
	}

	// Crear Aula
	@PostMapping("/crearHorario")
	public Aula crearAula(@RequestBody Aula aula) {
		return aulaRepositorio.save(aula);
	}

	// Actualizar Aula
	@PutMapping("/actualizarHorario/{id}")
	public Aula actualizarAula(@RequestBody Aula aula, @PathVariable Long id) {
		return aulaRepositorio.save(aula);
	}

	// Eliminar Aula
	@DeleteMapping("/elminarHorario/{id}")
	public String eliminarAula(@PathVariable Long id) {
		aulaRepositorio.deleteById(id);
		return "El aula ha sido eliminada";
	}

}
