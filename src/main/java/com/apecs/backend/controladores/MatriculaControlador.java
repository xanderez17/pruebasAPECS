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

import com.apecs.backend.modelo.Matricula;
import com.apecs.backend.repositorios.MatriculaRepositorio;

@RestController
@RequestMapping("/api/matriculas")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class MatriculaControlador {

	@Autowired
	private MatriculaRepositorio matriculaRepositorio;

	// Listar Matricula
	@GetMapping("/listarMatricula")
	public List<Matricula> listarMateria() {
		return matriculaRepositorio.findAll();
	}

	// Crear Matricula
	@PostMapping("/crearMatricula")
	public Matricula crearMatricula(@RequestBody Matricula matricula) {
		return matriculaRepositorio.save(matricula);
	}

	// Actualizar Matricula
	@PutMapping("/actualizarMatricula/{id}")
	public Matricula actualizarMatricula(@RequestBody Matricula matricula, @PathVariable Long id) {
		return matriculaRepositorio.save(matricula);
	}

	// Eliminar Matricula
	@DeleteMapping("/elminarMatricula/{id}")
	public String eliminarMatricula(@PathVariable Long id) {
		matriculaRepositorio.deleteById(id);
		return "La mmatricula ha sido eliminada";
	}

}
