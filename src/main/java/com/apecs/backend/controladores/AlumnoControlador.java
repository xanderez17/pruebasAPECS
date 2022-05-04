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
import com.apecs.backend.repositorios.AlumnoRepositorio;

@RestController
@RequestMapping("/api/alumnos")
@CrossOrigin(value = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AlumnoControlador {
	
	@Autowired
	private AlumnoRepositorio alumnoRepositorio;
	
	//Listar Alumnos
	@GetMapping("/listarAlumnos")
	public List<Alumno> listarAlumno(){
		return alumnoRepositorio.findAll();
	}
		
	//Crear Alumno
	@PostMapping("/crearAlumno")
	public Alumno crearAlumno(@RequestBody Alumno alumno) {
		return alumnoRepositorio.save(alumno);
	}
		
	//Actualizar Alumno
	@PutMapping("/actualizarAlumno/{id}")
	public Alumno actualizarAlumno(@RequestBody Alumno alumno, @PathVariable Long id) {
		return alumnoRepositorio.save(alumno);
	}
		
	//Eliminar Alumno
	@DeleteMapping("/elminarAlumno/{id}")
	public String eliminarAlumno(@PathVariable Long id) {
		alumnoRepositorio.deleteById(id);
		return "El alumno ha sido eliminado";
	}

}
