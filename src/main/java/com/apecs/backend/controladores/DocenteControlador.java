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

import com.apecs.backend.modelo.Docente;
import com.apecs.backend.repositorios.DocenteRepositorio;

@RestController
@RequestMapping("/api/docentes")
@CrossOrigin(value = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class DocenteControlador {
	
	@Autowired
	private DocenteRepositorio docenteRepositorio;
	
	//Listar Docentes
	@GetMapping("/listarAlumnos")
	public List<Docente> listarDocente(){
		return docenteRepositorio.findAll();
	}
			
	//Crear Docente
	@PostMapping("/crearDocente")
	public Docente crearDocente(@RequestBody Docente docente) {
		return docenteRepositorio.save(docente);
	}
			
	//Actualizar Docente
	@PutMapping("/actualizarDocente/{id}")
	public Docente actualizarAlumno(@RequestBody Docente docente, @PathVariable Long id) {
		return docenteRepositorio.save(docente);
	}
			
	//Eliminar Docente
	@DeleteMapping("/elminarDocente/{id}")
	public String eliminarDocente(@PathVariable Long id) {
		docenteRepositorio.deleteById(id);
		return "El docente ha sido eliminado";
	}

}
