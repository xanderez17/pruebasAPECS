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

import com.apecs.backend.modelo.Persona;
import com.apecs.backend.repositorios.PersonaRepositorio;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(value = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PersonaControlador {
	
	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	//Listar Personas
	@GetMapping("/listarPersonas")
	public List<Persona> listarPersonas(){
		return personaRepositorio.findAll();
	}
	
	//Crear Persona
	@PostMapping("/crearPersona")
	public Persona crearPersona(@RequestBody Persona persona){
		return personaRepositorio.save(persona);
	}
	
	//Actualizar Persona
	@PutMapping("/actualizarPersona/{id}")
	public Persona actualizarPersona(@RequestBody Persona persona, @PathVariable Long id) {
		return this.personaRepositorio.save(persona);
	}
	
	//Eliminar Persona
	@DeleteMapping("/eliminarPersona/{id}")
	public String eliminarPersona(@PathVariable Long id) {
		personaRepositorio.deleteById(id);
		return "La persona ha sido eliminada";
	}

}
