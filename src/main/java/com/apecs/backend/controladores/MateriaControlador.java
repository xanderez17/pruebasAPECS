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

import com.apecs.backend.modelo.Materia;
import com.apecs.backend.repositorios.MateriaRepositorio;

@RestController
@RequestMapping("/api/materias")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class MateriaControlador {

	@Autowired
	private MateriaRepositorio materiaRepositorio;

	// Listar Materia
	@GetMapping("/listarMateria")
	public List<Materia> listarMateria() {
		return materiaRepositorio.findAll();
	}

	// Crear Materia
	@PostMapping("/crearMateria")
	public Materia crearMateria(@RequestBody Materia materia) {
		return materiaRepositorio.save(materia);
	}

	// Actualizar Materia
	@PutMapping("/actualizarMateria/{id}")
	public Materia actualizarMateria(@RequestBody Materia materia, @PathVariable Long id) {
		return materiaRepositorio.save(materia);
	}

	// Eliminar Materia
	@DeleteMapping("/elminarMateria/{id}")
	public String eliminarMateria(@PathVariable Long id) {
		materiaRepositorio.deleteById(id);
		return "La materia ha sido eliminada";
	}

}
