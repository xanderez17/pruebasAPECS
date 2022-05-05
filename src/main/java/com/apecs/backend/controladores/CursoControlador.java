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

import com.apecs.backend.modelo.Curso;
import com.apecs.backend.repositorios.CursoRepositorio;

@RestController
@RequestMapping("/api/cursos")
@CrossOrigin(value = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CursoControlador {

	@Autowired
	private CursoRepositorio cursoRepositorio;
	
	//Listar Cursos
	@GetMapping("/listarCursos")
	public List<Curso> listarCurso(){
		return cursoRepositorio.findAll();
	}
	
	//Crear Curso
	@PostMapping("/crearCurso")
	public Curso crearCurso(@RequestBody Curso curso) {
		return cursoRepositorio.save(curso);
	}
	
	//Actualizar Curso
	@PutMapping("/actualizarCurso/{id}")
	public Curso actualizarCurso(@RequestBody Curso curso, @PathVariable Long id) {
		return cursoRepositorio.save(curso);
	}
	
	//Eliminar Curso
	@DeleteMapping("eliminarCurso/{id}")
	public String eliminarCurso(@PathVariable Long id) {
		cursoRepositorio.deleteById(id);
		return "El curso ha sido eliminado";
	}
}
