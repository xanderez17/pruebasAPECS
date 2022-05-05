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

import com.apecs.backend.modelo.Alumno;
import com.apecs.backend.modelo.Parentezco;
import com.apecs.backend.repositorios.ParentezcoRepositorio;

@RestController
@RequestMapping("/api/parentezcos")
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class ParentezcoControlador {

	@Autowired
	private ParentezcoRepositorio parentezcoRepositorio;

	// Listar Parentezcos
	@GetMapping("/listarParentezco")
	public List<Parentezco> listarParentezco() {
		return parentezcoRepositorio.findAll();
	}

	// Crear Parentezco
	@PostMapping("/crearParentezco")
	public Parentezco crearParentezco(@RequestBody Parentezco parentezco) {
		return parentezcoRepositorio.save(parentezco);
	}

	// Actualizar Parentezco
	@PutMapping("/actualizarAlumno/{id}")
	public Parentezco actualizarParentezco(@RequestBody Parentezco parentezco, @PathVariable Long id) {
		return parentezcoRepositorio.save(parentezco);
	}

	// Eliminar Parentezco
	@DeleteMapping("/elminarAlumno/{id}")
	public String eliminarParentezco(@PathVariable Long id) {
		parentezcoRepositorio.deleteById(id);
		return "El parentezco ha sido eliminado";
	}

}
